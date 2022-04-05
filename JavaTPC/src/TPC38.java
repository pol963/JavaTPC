import java.util.*;

import kr.tpc.*;

public class TPC38 {

	//ArrayList를 사용하여 책3권을 저장해보기.
	public static void main(String[] args) {

		//List는 ArrayList의 부모. 인자는 3이아니라 1이여도 크기는 계속 늘어나게 됩니다. -> list의 장점.
		List<BookDTO> list = new ArrayList<BookDTO>(3); //<BookDTO> 타입지정.
		list.add(new BookDTO("자바",12000,"가출판사",600));
		list.add(new BookDTO("파이썬",11000,"나출판사",700));
		list.add(new BookDTO("C언어",10000,"다출판사",800));
		
		for(int i = 0 ; i < list.size() ; i++) {
			//Object o = list.get(i);
			BookDTO bdto = list.get(i);
			System.out.println(bdto.title+ " " + bdto.price + " " + 
					bdto.company+ " " + bdto.page);
		}
		
		
		
	}

}
