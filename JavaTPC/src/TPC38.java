import java.util.*;

import kr.tpc.*;

public class TPC38 {

	//ArrayList�� ����Ͽ� å3���� �����غ���.
	public static void main(String[] args) {

		//List�� ArrayList�� �θ�. ���ڴ� 3�̾ƴ϶� 1�̿��� ũ��� ��� �þ�� �˴ϴ�. -> list�� ����.
		List<BookDTO> list = new ArrayList<BookDTO>(3); //<BookDTO> Ÿ������.
		list.add(new BookDTO("�ڹ�",12000,"�����ǻ�",600));
		list.add(new BookDTO("���̽�",11000,"�����ǻ�",700));
		list.add(new BookDTO("C���",10000,"�����ǻ�",800));
		
		for(int i = 0 ; i < list.size() ; i++) {
			//Object o = list.get(i);
			BookDTO bdto = list.get(i);
			System.out.println(bdto.title+ " " + bdto.price + " " + 
					bdto.company+ " " + bdto.page);
		}
		
		
		
	}

}
