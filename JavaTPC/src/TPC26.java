import kr.poly.*;

public class TPC26 {
	//�������̽� Ȱ��
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
