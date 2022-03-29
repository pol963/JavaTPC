import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {

	public static void main(String[] args) {
		//A�� BŬ������ �� ���� �� �ִ� �迭�� �����ϱ�.
		
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



















