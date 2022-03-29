package kr.tpc;

public class Dog extends Animar{
	
	public Dog() {
		//super();이 생략되어 있는 상태. -> 더 상위 클래스의 생성자 호출 메소드 입니다. -> Animar클래스의 생성자.
	}
	
	
	//부모클래스(Animar)가 가진 eat메소드를 상속받았지만 자신의 고유 메소드가 필요하기에 재정의(override) 합니다. 
	public void eat() { 
		
		System.out.println("개처림 먹는다.");
	}
}
