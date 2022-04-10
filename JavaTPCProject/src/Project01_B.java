import org.json.*;

public class Project01_B {

	public static void main(String[] args) {
		//Json - java(org.json) 
		
		//org.json 자르파일을 추가 -> Object를 만들필요없이 org.json에서 지원해줌. -> 더욱 간편.
		JSONObject student = new JSONObject();
		
		
		//객체를 여러개 저장하기위한 JSONArray
		JSONArray students = new JSONArray();
		
		
		//put메서드는 데이터를 넣어주는 메서드. key/value의 형태로 저장.
		student.put("name", "홍길동");
		student.put("phone", "010-1111-2222");
		student.put("address", "서울");
		System.out.println(student);
		
		System.out.println();
		System.out.println();
		
		
		//Array에 데이터넣기.
		students.put(student); //{ [ 객체 , 객체 ] }
		
		
		student = new JSONObject();
		student.put("name", "나길동");
		student.put("phone", "010-3333-2222");
		student.put("address", "광주");
		
		
		//Array에 데이터넣기.
		students.put(student); //{ [ 객체 , 객체 ] }
		
		//그대로출력
		System.out.println(students);
		
		System.out.println();
		
		//다시 Object에넣어서 key value형태로 넣어서 출력.
		JSONObject object = new JSONObject();
		object.put("students ", students);
		System.out.println(object.toString(1));
		
		
	}

}
