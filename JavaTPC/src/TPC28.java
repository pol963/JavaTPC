import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {

		A a = new A();
		a.display();
		System.out.println(a.toString()); //재정의없을시 a의 객체 주소를 String 형태로 반환 kr.poly.A@279f2327
		System.out.println(a); //재정의없을시 kr.poly.A@279f2327
	
		
		//부모의 클래스타입으로 객체 생성시.
		 Object o = new A();
		 ((A)o).display(); // 다운캐스팅 , 재정의 -> 다형성의 원리로 자식의 display메소드 호출가능 
		 System.out.println(o.toString());
		
		
	}

}
