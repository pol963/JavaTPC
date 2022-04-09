import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import kr.Inflearn.BookDTO;

public class Project01_A {

	public static void main(String[] args) {
		//Object(BookDTO) -> JSON(String) 변환
		
		//객체생성과 동시에 생성자메서드에 데이터 넣어서 넘겨주기.
		BookDTO dto = new BookDTO("자바",15000,"A출판사",500);
		
		//JSON이용하기위해 객체생성. API 사용 필요. -> 자르 빌드패치.
		Gson g = new Gson(); 
		String json = g.toJson(dto); //dto데이터(객체)를 json으로 변환. -> String
		System.out.println(json);
		
		//json -> bookdto
		BookDTO dto1 = g.fromJson(json, BookDTO.class);
		System.out.println(dto1); //모두출력 toString()
		System.out.println(dto1.getTitle()+"\t"+dto1.getPrice()); //개별출력
		
		
		//객체가 하나가 아닐경우 -> list.
		List<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("자바1",15000,"출판사1",560));
		lst.add(new BookDTO("자바2",14000,"출판사2",660));
		lst.add(new BookDTO("자바3",13000,"출판사3",760));
		
		g.toJson(lst);
		
		
		
	}

}
