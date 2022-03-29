import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
		
		Animar ani = new Dog();
		ani.eat(); //컴파일때 Animar eat() -> 실행시 Dog eat() 자식이 부모의 eat를 오버라이드
		ani.Move();
		
		
		ani = new Cat();
		ani.eat(); //컴파일시 Animar eat() -> 실행시 Cat eat() 자식이 부모의 eat를 오버라이드
		ani.Move();
		((Cat)ani).night();
		
	}

}


/*
 	상속 그리고 다형성 그리고 다형성의 보장.
 	다형성의 보장은 인터페이스를 사용
  
  
 */



