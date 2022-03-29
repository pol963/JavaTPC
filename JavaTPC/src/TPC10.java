import kr.tpc.BookDTO;

public class TPC10 {
	
	//기본자료형 PDT 와 사용자지정자료형 UDDT
	public static void main(String[] args) {
	
		//기본자료형->PDT
		int a = 10; 
		System.out.println("a : " + a);
		
		//사용자 지정 자료형 -> UDDT 책을 저장하는변수 필요가정 -> BookDTO
		BookDTO b;
		
		b = new BookDTO(); //객체생성 이때 생성자메소드가 호출되어 메모리에 객체생성을 실행. 
		
		b.title = "자바의 정석";
		b.price = 15000;
		b.company="영진출판사";
		b.page= 670;
		
		System.out.print("b.title : " + b.title + "\t");
		System.out.print("b.price : " + b.price+"\t");
		System.out.print("b.company : " + b.company + "\t");
		System.out.println("b.page : " + b.page);
		
		
		
	}

}



/* 
*
*객체를 생성할때 new 연산자 뒤에 나오는 메소드가 있는대 이를 생성자 메소드라고 합니다.
* -> 실제로 메모리에 객체를 생성하는 역할을 하는 메소드.
* 기본적으로 객체생성시 해당 클래스안에는 생성자 메소드가 생략되어 있습니다.
* 어떠한 객체가 만들어 질때는 자기 자신을 가르키는 객체또한 같이만들어 집니다. 이를 this객체라고 합니다.
* 
*/