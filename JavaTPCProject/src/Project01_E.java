import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.util.Date;

import org.json.*;

public class Project01_E {

	//static map api 사용을 위한 메서드 구현. -> 지도 이미지 생성 함수.
	public static void map_service(String point_x, String point_y, String address) {
		
		//static map api url을 가져오기.
		String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		
		try {
			//마커의 위치를 잡는 포지션변수.
			String pos = URLEncoder.encode(point_x+" "+point_y,"UTF-8");
			//url에 주소를 넣고 지속적으로 붙여넣기 위함.
			String url = URL_STATICMAP;
			//center -> 나타내주는 맵의 정중앙 표현.
			url += "center=" + point_x + "," + point_y;
			//지도의 크기 지정.
			url += "&level=16&w=700&h=500";
			//지도의 마커 설정.
			url += "&markers=type:t|size:mid|pos:"+pos+"|labal:"+URLEncoder.encode(address,"UTF-8");
			
			//해당 주소가 유효한지 알아보기위해 객체 생성. 연결을 위해 객체 생성.
			URL u = new URL(url);
			
			//url객체를 이용해서 연결. 연결되면 HttpURLConnection객체를 이용하여 받아주기.
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			
			//연결을 위한 연결방식,id,secret 지정.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID","d6bcopz9in");
			con.setRequestProperty("X-NCP-APIGW-API-KEY", "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9");
			
			//위의 3개의 정보를 입력해서 성공적으로 지도와 연결이 되고 응답이 정상적인지 알아보기
			int responseCode = con.getResponseCode(); //200 이 정상.
			
			BufferedReader br;
			if(responseCode == 200) { //정상일시.
				//byte단위로 데이터를 받을 것이기에 InputStream객체 생성.
				InputStream is = con.getInputStream();
				
				//받아들인 데이터를 OutputStream을 이용하여 파일에 넣기위해 int형 변수 선언.
				int read = 0;
				
				//일종의 buffer구현. 1024바이트만큼 담고 넘겨주기를 반복하기 위한 배열변수.
				byte[] bytes = new byte[1024];
				
				//파일이름랜덤지정 -> 날자 시간 문자열.
				String tempname = Long.valueOf(new Date().getTime()).toString();
				
				//파일 생성을 위한 객체생성. 이름지정
				File f = new File(tempname + ".jpg");
				
				//파일 생성
				f.createNewFile();
				
				//파일을 쓰기위해서 OutputStream만들기.
				OutputStream outputStream = new FileOutputStream(f);
				
				
				while((read = is.read(bytes)) != -1) {
					outputStream.write(bytes,0,read);
				}
				is.close();
				
				
			}else { //에러 발생시.
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputline;
				StringBuffer response = new StringBuffer();
				while((inputline = br.readLine()) != null) {
					response.append(inputline);
				}
				br.close();
				System.out.println(response.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {

		String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
		String Client_id = "d6bcopz9in";
		String Client_Secret = "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9";

		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("주소를 입력하세요 : ");
			String address = io.readLine();
			String addr = URLEncoder.encode(address, "UTF-8");

			String reqURL = apiUrl + addr;

			URL url = new URL(reqURL);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", Client_id);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", Client_Secret);

			int responseCode = con.getResponseCode(); // 200이 정상.

			BufferedReader br;

			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}

			String line;

			StringBuffer response = new StringBuffer();

			
			//이미지를가져오기 위한 변수 3개 만들기. -> static map api관련.
			String x = "";  String y = ""; String z = "";
			
			while ((line = br.readLine()) != null) {
				response.append(line);
			}

			br.close();

			JSONTokener tokener = new JSONTokener(response.toString());

			JSONObject object = new JSONObject(tokener);
			System.out.println(object.toString());
			System.out.println();

			JSONArray arr = object.getJSONArray("addresses");

			for (int i = 0; i < arr.length(); i++) {

				JSONObject temp = (JSONObject) arr.get(i);

				System.out.println("roadAddress : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("경도 : " + temp.get("x"));
				System.out.println("위도 : " + temp.get("y"));
				
				//x,y,z에 값 넣어주기 -> static map api에 의해 지도를 가져오기 위해.
				x=(String) temp.get("x");
				y=(String) temp.get("y");
				z=(String) temp.get("roadAddress");
			}
			
			//메소드 호출
			map_service(x,y,z);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
