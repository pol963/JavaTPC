import kr.tpc.BookVO;

public class TPC12 {

	//������ �޼ҵ��� �ʱ�ȭ 1.�⺻�����ڸ޼ҵ� 2.��������������ڸ޼ҵ�.
	public static void main(String[] args) {
		
		//�⺻������ �޼ҵ��� �ʱ�ȭ
		BookVO b1 = new BookVO();
		b1.title="�ڹ�";
		b1.price=15000;
		b1.company="�Ѻ��̵��";
		b1.page=600;
		
		//�⺻������ �޼ҵ� �ʱ�ȭ����
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company +"\t");
		System.out.println(b1.page);
		
		
		//������ �޼ҵ��� �ߺ�����(overloading)�� �̿��Ͽ� å1���� �����ϱ�. ���� �Ű������� �̿��ؼ� �����ϱ�.
		
		BookVO b2 = new BookVO("���̽�",12000,"�Ѻ��̵��",400);
		System.out.print(b2.title + "\t");
		System.out.print(b2.price + "\t");
		System.out.print(b2.company +"\t");
		System.out.println(b2.page);
		
	}

}





/*
 * �ʱ�ȭ -> ���� �ִ°�.
 * ������ �޼ҵ�� ��ü������ new������ �ڿ� ������ �޼ҵ� �Դϴ�.
 * �� �޼ҵ��� ��Ȱ�� ��ü�� ���� �Դϴ�. �㳪 �Ű������� �����ν� �ʱ�ȭ�� �����մϴ�. �̶��� �ش� Ŭ������ ������ �޼ҵ忡 �ʱ�ȭ �۾��� ����� �մϴ�.
 * ������ �޼ҵ��� �ߺ����Ƕ� �̸��� ������ �Ű������� ���� �ٸ� ������ �޼ҵ带 ����ϴ°� �Դϴ�. 
 * 
 * 
*/
