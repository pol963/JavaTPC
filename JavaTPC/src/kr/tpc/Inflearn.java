package kr.tpc;

//두개의 메소드 만들기 하나는 일반 메서드 하나는 static메서드로 만들기.
public class Inflearn {

	private Inflearn() {
		
	}
	//인스턴스 메서드. -> 생성자 메서드가 private일경우 절대 호출이 불가능합니다. new연산자를 사용할 수 없기 때문에. -> static메서드로 바꿔줘야 합니다.
	public static void TPC() {
		System.out.println("TPC강의는 재미있다.");
	}
	
	//클래스 메서드. -> 생성자 메서드가 private여도 클래스.Java로 바로 호출이 가능합니다.
	public static void Java() {
		System.out.println("java강의는 재미있다.");
	}
	
}
