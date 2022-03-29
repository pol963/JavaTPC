import kr.tpc.BookVO;

public class TPC12 {

	//생성자 메소드의 초기화 1.기본생성자메소드 2.사용자지정생성자메소드.
	public static void main(String[] args) {
		
		//기본생성자 메소드의 초기화
		BookVO b1 = new BookVO();
		b1.title="자바";
		b1.price=15000;
		b1.company="한빛미디어";
		b1.page=600;
		
		//기본생성자 메소드 초기화과정
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company +"\t");
		System.out.println(b1.page);
		
		
		//생성자 메소드의 중복정의(overloading)를 이용하여 책1권을 저장하기. 값은 매개변수를 이용해서 저장하기.
		
		BookVO b2 = new BookVO("파이썬",12000,"한빛미디어",400);
		System.out.print(b2.title + "\t");
		System.out.print(b2.price + "\t");
		System.out.print(b2.company +"\t");
		System.out.println(b2.page);
		
	}

}





/*
 * 초기화 -> 값을 주는것.
 * 생성자 메소드란 객체생성시 new연산자 뒤에 나오는 메소드 입니다.
 * 이 메소드의 역활은 객체의 생성 입니다. 허나 매개변수를 줌으로써 초기화도 가능합니다. 이때는 해당 클래스의 생성자 메소드에 초기화 작업을 해줘야 합니다.
 * 생성자 메소드의 중복정의란 이름은 같으나 매개변수의 수가 다른 생성자 메소드를 사용하는것 입니다. 
 * 
 * 
*/
