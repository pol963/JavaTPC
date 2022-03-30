import kr.infrine.MyClass; //*로 처릴할시 패키지내의 모든 클래스 사용가능.

public class TPC33 {

	public static void main(String[] args) {
		
		//kr.infrine. 이부분으 생략되어 있습니다. 클래스풀네임. -> import로 대체. public라서 가능
		MyClass m = new MyClass();
		int sum = m.sum(10, 100);
		System.out.println("sum : " + sum);
		
		
	}

}
