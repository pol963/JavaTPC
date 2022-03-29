import kr.tpc.OverLoad;

public class TPC16 {

	//메서드 오버로딩(method overloading)
	public static void main(String[] args) {
		//정수+정수,정수+실수,실수+실수 의 동작을 하는 메소드를 호출하기. 추가로 정수+정수+정수의 동작을 하는 메서드도 호출하기.
		
		OverLoad ov = new OverLoad();
		ov.sum(10, 20);
		ov.sum(23.4f, 30);
		ov.sum(12.2f,13.3f);
		ov.sum(20, 10, 20);
		
		
	}

}
