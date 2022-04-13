import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

import org.json.*;

public class Project01_D {

	//주소를 입력하면 좌료를 리턴받는 프로그램 만들기. -> 네이버 API사용하기.
	public static void main(String[] args) {
		
		//네이버API 연결 및 사용을 위한 필수 필요 주소(요청 URL).
		String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
		
		//네이버API 연결 및 사용을 위한 필수 필요 Client ID ,Client Secret.
		String Client_id = "d6bcopz9in";
		String Client_Secret = "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9";
		
		//키보드로 부터 주소(지번,도로명)을 입력받기 위한 BufferReader(문자),System.in(바이트),inputStreamReader(브릿지 스트림)
		//즉 바이트스트림과 문자스트림을 바로 연결할 수 없기때문에 브릿지 스트림으로 연결.
		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
		
		//네트워크 통신,데이터베이스 연결...등등은 모두 예외처리가 필수.
		try {
			System.out.print("주소를 입력하세요 : ");
			//io : 키보드로 문자열을 입력받는 변수. readLine : 한줄씩 읽어들이기. -> address에 저장.
			String address = io.readLine(); 
			//입력받은 주소에 공백이 있다면 안되기 때문에 Encoding을 UTF-8로 지정해주기.
			String addr = URLEncoder.encode(address, "UTF-8");
			
			//요청 URL -> 네이버 api에 요청url과 키보드로 입력한 주소를 넘겨서 요청.
			//"https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query="+addr; 의 형식도 가능.
			String reqURL = apiUrl+addr;
			
			//해당 URL이 유효한 주소인지 아닌지 알아보기. 유효하지 않을시 에러.
			URL url = new URL(reqURL); 
			
			//url객체를 이용해서 연결. 연결을 하게 되면 HttpURLConnention 객체로 받아주기.
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//연결을 위한 연결방식,id,secret 지정.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", Client_id);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", Client_Secret);
			
			//위의 3개의 정보를 입력해서 성공적으로 지도와 연결이 되고 응답이 정상적인지 알아보기
			int responseCode = con.getResponseCode(); //200이 정상.
			
			//성공적으로 200번을 받았다면 json형태로 오는 데이터를 한줄씩 읽어들여야 하기때문에 BufferedReader를 사용.
			BufferedReader br;
			
			
			//정상적으로 200이라면 json형태로 데이터 넘어옴. 한줄씩 읽어들이기.
			if(responseCode == 200) {
				//성공시 데이터를 읽어와야 합니다.
				//con.getInputStream() -> con에 담긴 json데이터를 byte단위로 가져오기. 한글깨짐방지를위한 UTF-8
				//InputStreamReader byte단위의 데이터를 문자단위 데이터로 처리할 수 있게 해줍니다.
				//BufferedReader 변환된 문자들을 buffer기능으로 문자열로 처리.
				//즉, byte단위로 가져온 데이터를 문자형태의 데이터로 변환후 buffer기능을 이용하여 문자열 단위로 받음
				//BufferedReader은 결국 사용자의 편의를 위해 사용.
				br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
				
			}else { //에러가 생길시 getErrorStream을 통해 에러데이터가 리턴.
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			
			//정상적으로 스트림이 만들어졋다면 bufferedReader을 이용해서 한 라인씩 읽어들이기.
			
			//한라인씩 읽어들이기 위한 변수.
			String line;
			
			//한 라인씩 읽어드린 데이터를 저장하기 위한 변수.
			StringBuffer response = new StringBuffer();
			
			//반복문을 이용해서 지속적으로 데이터를 한줄씩 저장. 
			while((line = br.readLine()) != null) { //line에 br에담긴 데이터를 1줄씩 저장. -> null이면 스탑.
				response.append(line); //line에 1줄씩 담기는 데이터(json) response에 저장.
			}
			
			br.close();
			
			//원하는 데이터 뽑아내기.json(문자열) -> response에 담긴 json데이터를 문자열 형식으로 tokener에 저장.
			JSONTokener tokener = new JSONTokener(response.toString());
			
			//저장한 tokener안의 문자열 데이터를 Object형태로 변환. -> 데이터를 핸들링 하려면 Object형태로 변환해줘야 합니다.
			JSONObject object = new JSONObject(tokener);
			System.out.println(object.toString());
			System.out.println();
			
			//key value를 이용해 배열의 주소값을 빼오기.
			JSONArray arr =object.getJSONArray("addresses");
			
			//반복문을 사용해서 데이터 빼보기.
			for(int i = 0; i < arr.length() ; i++) {
				
				//arr.get(i) -> arr의 i번재 데이터를 temp에 저장.
				JSONObject temp = (JSONObject) arr.get(i);
				
				//addresses안에 있는 각 데이터를 하나씩 빼보기. 
				System.out.println("roadAddress : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("경도 : " + temp.get("x"));
				System.out.println("위도 : " + temp.get("y"));
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
		
	}

}





