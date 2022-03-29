import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {

	public static void main(String[] args) {
		//A와 B클래스를 다 받을 수 있는 배열을 구현하기.
		
		Object[] oArr = new Object[2];
		
		oArr[0] = new A();
		oArr[1] = new B();
		
		
		for(int i = 0;i<oArr.length;i++) {
			if(oArr[i] instanceof A) {
				((A)oArr[i]).go();
			}else {
				((B)oArr[i]).go();
			}
		}
		
		System.out.println("----------------");
		
		printGo(oArr);
		
		
		
	}

	private static void printGo(Object[] oArr) {

		for(int i = 0;i<oArr.length;i++) {
			if(oArr[i] instanceof A) {
				((A)oArr[i]).go();
			}else {
				((B)oArr[i]).go();
			}
		}
		
	}

}



















