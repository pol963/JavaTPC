import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import kr.Inflearn.BookDTO;

public class Project01_A {

	public static void main(String[] args) {
		//Object(BookDTO) -> JSON(String) ��ȯ
		
		//��ü������ ���ÿ� �����ڸ޼��忡 ������ �־ �Ѱ��ֱ�.
		BookDTO dto = new BookDTO("�ڹ�",15000,"A���ǻ�",500);
		
		//JSON�̿��ϱ����� ��ü����. API ��� �ʿ�. -> �ڸ� ������ġ.
		Gson g = new Gson(); 
		String json = g.toJson(dto); //dto������(��ü)�� json���� ��ȯ. -> String
		System.out.println(json);
		
		//json -> bookdto
		BookDTO dto1 = g.fromJson(json, BookDTO.class);
		System.out.println(dto1); //������ toString()
		System.out.println(dto1.getTitle()+"\t"+dto1.getPrice()); //�������
		
		
		//��ü�� �ϳ��� �ƴҰ�� -> list.
		List<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("�ڹ�1",15000,"���ǻ�1",560));
		lst.add(new BookDTO("�ڹ�2",14000,"���ǻ�2",660));
		lst.add(new BookDTO("�ڹ�3",13000,"���ǻ�3",760));
		
		g.toJson(lst);
		
		
		
	}

}
