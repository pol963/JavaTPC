import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {

		A a = new A();
		a.display();
		System.out.println(a.toString()); //�����Ǿ����� a�� ��ü �ּҸ� String ���·� ��ȯ kr.poly.A@279f2327
		System.out.println(a); //�����Ǿ����� kr.poly.A@279f2327
	
		
		//�θ��� Ŭ����Ÿ������ ��ü ������.
		 Object o = new A();
		 ((A)o).display(); // �ٿ�ĳ���� , ������ -> �������� ������ �ڽ��� display�޼ҵ� ȣ�Ⱑ�� 
		 System.out.println(o.toString());
		
		
	}

}
