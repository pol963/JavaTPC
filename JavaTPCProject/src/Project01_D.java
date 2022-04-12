import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		
		
		
		
		
	}

}




/*
 	1. 네이버에 있는 오픈 API를 연결하여 사용하여야 하기 때문에 주소를 가지고 와야 합니다.
  	2. 네이버API 연결 및 사용을 위한 필수 필요 Client ID ,Client Secret
  	3. 키보드로 부터 주소(지번,도로명)을 입력받기 위한 BufferReader
  
 * */



