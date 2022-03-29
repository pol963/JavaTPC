package kr.poly;

//인터페이스는 구현된 메소드를 가질 수 없습니다. -> 인터페이스 클래스도 불완전한 클래스이기에 객체생성이 불가능 합니다. -> 부모클래스로서만 사용가능 -> 다형성 강제.
public interface RemoCon {

	//인터페이스는 상수(변하지 않는 수)또한 가질 수 있습니다.
	public static final int MaxCh = 100;
	int MinCh = 1; // public static final 생략 가능.
	
	
	//추상메서드 -> 일반메서드는 가질 수 없습니다.
	public abstract void chUp();
	public void chDown(); //abstract생략 가능 -> 인터페이스라서 생략이 가능합니다.
	public void internet();
}
