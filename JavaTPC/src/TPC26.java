import kr.poly.*;

public class TPC26 {
	//인터페이스 활용
public static void main(String[] args) {
	
	RemoCon r = new TV();
	r.chUp();
	r.chDown();
	r.internet();
	
	System.out.println("-----------------------");
	
	r = new Radio();
	r.chUp();
	r.chDown();
	r.internet();
	
}
}
