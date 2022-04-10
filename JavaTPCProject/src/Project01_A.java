import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.Inflearn.BookDTO;

public class Project01_A {

	public static void main(String[] args) {
		//Object(BookDTO) -> JSON(String) ��ȯ
		
		//��ü������ ���ÿ� �����ڸ޼��忡 ������ �־ �Ѱ��ֱ�. -> object�� ������.
		BookDTO dto = new BookDTO("�ڹ�",15000,"A���ǻ�",500);
		
		//object�����͸� String�����ͷ� �ٲٱ����� json.
		//JSON�̿��ϱ����� ��ü����. API ��� �ʿ�. -> �ڸ� ������ġ.
		Gson g = new Gson(); 
		String json = g.toJson(dto); //dto������(��ü)�� json���� ��ȯ. -> String
		System.out.println(json);
		
		//json(String)Ÿ���� �����͸� �ٽ� �ڹ��� Ŭ���� ������ Ÿ������ �ٲٱ� ���� �޼���. fromJson()
		BookDTO dto1 = g.fromJson(json, BookDTO.class);
		System.out.println(dto1); //������ toString()
		System.out.println(dto1.getTitle()+"\t"+dto1.getPrice()); //�������
		System.out.println();
		System.out.println();
		
		//�ϳ��� ��ü���ƴ� �������� ��ü�� String�� �ٲܶ�.  
		//object(List<BookDTO>) -> Json(String) [{  },{  },{  }....] �� ����.
		List<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("�ڹ�1",15000,"A���ǻ�",500));
		lst.add(new BookDTO("�ڹ�2",14000,"B���ǻ�",550));
		lst.add(new BookDTO("�ڹ�3",16000,"C���ǻ�",600));

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
