import kr.tpc.OverLoad;

public class TPC16 {

	//�޼��� �����ε�(method overloading)
	public static void main(String[] args) {
		//����+����,����+�Ǽ�,�Ǽ�+�Ǽ� �� ������ �ϴ� �޼ҵ带 ȣ���ϱ�. �߰��� ����+����+������ ������ �ϴ� �޼��嵵 ȣ���ϱ�.
		
		OverLoad ov = new OverLoad();
		ov.sum(10, 20);
		ov.sum(23.4f, 30);
		ov.sum(12.2f,13.3f);
		ov.sum(20, 10, 20);
		
		
	}

}
