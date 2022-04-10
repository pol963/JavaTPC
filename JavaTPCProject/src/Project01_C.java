import java.io.InputStream;

import org.json.JSONObject;
import org.json.*;

public class Project01_C {

	public static void main(String[] args) {

		//외부에서(다른누군가에게) json형식의 데이터를 받고 다시 Object형태로 넣어야 할때.
		//파일을 읽어들이기위한 파일명 저장.
		String src = "info.json";
		
		//파일을 읽어드리기위해 IO의 stream(스트림)을 사용하기.
		InputStream is = Project01_C.class.getResourceAsStream(src); //Project01_C가 있는 경로에서 getResourceAsStream src와 연결하여 IO가져오기 
		
		//파일이 없을시에 대한 예외처리.
		if(is==null) {
			throw new NullPointerException("Can not find resource file");
		}
		
		//문자열로 된 파일을 json형태의 구조로 올리기위한 작업. -> 문자열이 메모리에 json형태가 되어 올라감.
		JSONTokener tokener = new JSONTokener(is);
		
		//json데이터를 핸들링 하기 위해서는 Object가 필요. Object로 다시 만들어야함.
		JSONObject object = new JSONObject(tokener);

		//Array형태이기 때문에 Array형태로 데이터를 가져오기.
		JSONArray students1=object.getJSONArray("students");
		
		//반복문을 사용하여 가져오기.
		for(int i = 0 ; i < students1.length() ; i++) {
			//get(i) i번째에있는 데이터를 가져오기 get은 Object형으로 가져오기 때문에 다운캐스팅이 필요합니다.
		JSONObject student = (JSONObject)students1.get(i);
		
		System.out.print(student.get("name") + "\t");
		System.out.print(student.get("address") + "\t");
		System.out.println(student.get("phone"));
		
		
		}
		
		
	}
}


















