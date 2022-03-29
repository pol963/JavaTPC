

package kr.poly;
//클래스 생성시 생략되어 있는 3가지 코드. 1.import java.lang 패키지 2.extends object 3.생성자메소드와 super
import java.lang.*;


public class A extends Object{

	public A() {
		super();
	}
	
	public void display(){
	
		System.out.println("나는 A입니다.");
		
	}

	//모든 일반클래스는 Object 클래스를 상속받는다. Object클래스안에는 toString()메소드가 정의되어 있다.
	@Override
	public String toString() {
		
		return "재정의 메서드 입니다.";
	}
	
	
	
}