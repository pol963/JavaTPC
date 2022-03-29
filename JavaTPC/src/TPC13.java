import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		
		//class vs object vs instance -> 책(자료형클래스) vs 객체(자료형 변수or객체변수) vs 인스턴스(인스턴스 변수)
		
		
		//임의의 책 정보를 담은 4개의 변수 만들기.
		String title = "개발자가 되는법";
		int price = 15000;
		String company ="제이펍";
		int page = 400;
						
					//BookDTO클래스가 바로 자료형 클래스입니다. 설계도 입니다. 
		BookDTO dto; //지금의 dto는 그냥 객체 : Object 입니다. 아무런 데이터가 담겨있지 않기때문에. 
		
		//이때의 dto는 인스턴스 변수 입니다. new연산자와 BookDTO생성자메소드로 메모리에 실체가 생겻기 때문에 인스턴스 변수 라고합니다.
		dto = new BookDTO(title,price,company,page); 
		
		//메소드호출시에 dto인스턴스를 주고 호출해보기.
		bookPrint(dto);
	
	
	}
	
	//매개변수로 BookDTO자료형의 dto변수를 받는 메소드. 동작으로는 dto변수가 가르키는 레퍼런스의 각 정보를 출력하기.
	public static void bookPrint(BookDTO dto) {
		
		System.out.println(dto.title);
		System.out.println(dto.price);
		System.out.println(dto.company);
		System.out.println(dto.page);
		
	}
}

/*
 * DTO -> 는 데이터를 담아서 이동한다는 뜻이다 따라서 클래스에 dto를 붙여주면 데이터를 받아서 다른 곳으로 이동시키는 클래스임을 명시한것입니다.
 * ex) 클래스 변수 이후 변수에 데이터를 담고 다른 메소드에 매개변수로 넘겨주기 이게 데이터의 이동을 뜻합니다. 
 * */






 