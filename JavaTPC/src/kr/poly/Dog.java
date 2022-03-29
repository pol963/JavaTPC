package kr.poly;

public class Dog extends Animar{
	
	public Dog() {
		//super();이 생략되어 있는 상태. -> 더 상위 클래스의 생성자 호출 메소드 입니다. -> Animar클래스의 생성자.
	}
	
	
	//부모클래스(Animar)가 가진 eat메소드를 상속받았지만 자신의 고유 메소드가 필요하기에 재정의(override) 합니다. 
	//부모클래스가 추상클래스로 변경(eat추상메서드.) 상속받은 자식클래스는 반드시 재정의 필요. ->다형성의 보장
	//만약 오버라이드를 하지 않을 시 클래스 자체가 불완전한 클래스가 되어 abstract키워드 필요 또, 불완전한 객체는 new 키워드를 사용하여 객체 생성불가능.
	public void eat() { 
		
		System.out.println("개처림 먹는다.");
	}
}
