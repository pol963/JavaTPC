import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.Inflearn.BookDTO;

public class Project01_A {

	public static void main(String[] args) {
		//Object(BookDTO) -> JSON(String) 변환
		
		//객체생성과 동시에 생성자메서드에 데이터 넣어서 넘겨주기. -> object형 데이터.
		BookDTO dto = new BookDTO("자바",15000,"A출판사",500);
		
		//object데이터를 String데이터로 바꾸기위한 json.
		//JSON이용하기위해 객체생성. API 사용 필요. -> 자르 빌드패치.
		Gson g = new Gson(); 
		String json = g.toJson(dto); //dto데이터(객체)를 json으로 변환. -> String
		System.out.println(json);
		
		//json(String)타입의 데이터를 다시 자바의 클래스 데이터 타입으로 바꾸기 위한 메서드. fromJson()
		BookDTO dto1 = g.fromJson(json, BookDTO.class);
		System.out.println(dto1); //모두출력 toString()
		System.out.println(dto1.getTitle()+"\t"+dto1.getPrice()); //개별출력
		System.out.println();
		System.out.println();
		
		//하나의 객체가아닌 여러개의 객체를 String로 바꿀때.  
		//object(List<BookDTO>) -> Json(String) [{  },{  },{  }....] 의 형태.
		List<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("자바1",15000,"A출판사",500));
		lst.add(new BookDTO("자바2",14000,"B출판사",550));
		lst.add(new BookDTO("자바3",16000,"C출판사",600));

		String lstjson = g.toJson(lst);
		System.out.println(lstjson);
		System.out.println();
		
		//Json(String) -> object(List<BookDTO>)
		List<BookDTO> lst1 = g.fromJson(lstjson, new TypeToken<List<BookDTO>>() {}.getType());
		System.out.println(lst1);
		
		for( BookDTO vo : lst1 ) {
			System.out.println(vo.toString());
		}
		
		
	}

}
