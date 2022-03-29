package kr.poly;

//추상클래스(불완전한클래스) 추상메서드를 가지고 있기에 추상클래스가 됩니다. -> 불완전하기에 혼자서 작동될수없는 객체가 됩니다. -> new Animar은 불가능.
public abstract class Animar{ 

	//추상메서드(불완전한메서드) -> 실행구문이 필요없고 자식클래스에서 오버라이드를 강제하기위해(다형성의보장) 사용
	public abstract void eat(); 
	
	public void Move() {
		System.out.println("무리를 지어 이동하기.");
	}
	
	
}

/*
 	부모클래스의 추상메서드는 결국 자식클래스의 오버라이드를 강제합니다. -> 다형성을 보장하기위해 자식클래스에서의 오버라이드.
 
 */

