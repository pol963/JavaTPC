import kr.tpc.BookVO;

public class TPC11 {

	// å�ѱ��� �����ϱ� ���� ��ü�� �����ϱ�.
	public static void main(String[] args) {

		// ��ü ����. -> BookVO�ڷ����� ���� b�� ����. -> b�ȿ� new�����ڷ� BookVO�� ������ ����ִ� �޸𸮸� ����Ű�� �ִ�
		// �ּ� ����.
		BookVO b = new BookVO();

		// ��ü�� ������ �ֱ�->å�ѱ��� ���� �ֱ�.
		b.title = "���̽�";
		b.price = 15000;
		b.company = "������";
		b.page = 700;

		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);

		
		// �ٸ�å�� ���� �����غ���.

		BookVO b1 = new BookVO();

		b1.title = "����Ŭ";
		b1.price = 17000;
		b1.company = "������";
		b1.page = 300;

		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
		System.out.println(b1.page);

	}

}

/*
 * �𵨸��̶�? -> ��ü�ȿ� �Ӽ�(��������,�ɹ�����...���)���� �ʿ��Ѱ͸� �̾Ƴ��� ������ �𵨸� �̶�� �մϴ�. Ŭ������ ���鶧
 * publicŰ����� �ʹ� ������ ����Դϴ�. -> ������,�ƹ��� ��ü�� ���������� ������ �� �ֱ� �����Դϴ�. ���� public��ΰ���
 * Ű���尡 �ƴ� private Ű���带 �̿��� ��ü������ ��ȣ���ݴϴ�. -> ��������
 * 
 * 
 *
 */
