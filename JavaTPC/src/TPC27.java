import kr.poly.*;

public class TPC27 {

	public static void main(String[] args) {

		//Remocon���� TVŬ������ �����غ���.
		RemoCon r = new TV();
		
		for(int i = 0 ; i < 40; i++) {
		r.chUp();
		}
		
		System.out.println("------------------");
		
		for(int i = 0; i < 40 ; i++) {
			
		r.chDown();
		
		}
		r.internet();
		
	}

}
