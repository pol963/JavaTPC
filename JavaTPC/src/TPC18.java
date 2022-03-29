import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {

	public static void main(String[] args) {
		//java에서 제공해주는 Class들 -> API들.
		//String(문자열) Class -> 자바에서는 문자열 자료형이란 없습니다 String는 따로 자바에서 만든 문자열 클래스 입니다. 	
		String str = new String("APPLE");
		//String Class의 메소드 사용해보기 
		String loStr = str.toLowerCase(); //소문자 변경
		System.out.println("loStr : " + loStr);
		
		
		//직접 만들어서 사용하는 Class들 -> DTO,VO,DAO,Utility API들
		MyUtil mu = new MyUtil();
		int total = mu.sum();
		System.out.println(total);
		
		//다른회사에서 만든 Class API -> GSON...등
		//책한권의 데이터를 객체생성과 동시에 초기화하고 json으로 출력해보기.
		BookVO b=new BookVO("자바",12000,"영진출판사",800);
		Gson g= new Gson();
		String json = g.toJson(b);
		System.out.println("json : " + json);
		
		
		
		
	}
}

















