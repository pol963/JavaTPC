import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		//���� �����ϱ�. PDT(�⺻�ڷ���) vs UDDT(�����ڷ���)
		
		int a;
		a = 10;
		
		//å 1���� �����ϱ� ���� ���� �����ϱ�. -> å�̶�� �ڷ����� �ڹٿ��� �������� �ʽ��ϴ�.
		//���� �ڷ����� ������ �մϴ� ����� ���� ������ �ٷ� Class�Դϴ�.
		Book b;
		
		//b�� ��ü ���۷��� ����.
		b = new Book(); //��ü���� -> ���� �����Ѵ�� Ŭ����(����)�� �̿��Ͽ� ��ü ����. b=��ü.
		
		//b�����ȿ��� ��ü�� �־ �ٷ������� ���ϰ�.�� �̿��ؼ� �����ؾ� �մϴ�.
		b.title="�ڹ�������";
		b.price=15000;
		b.company="�Ѻ��̵��";
		b.page=700;
		
		System.out.println("b.title : " + b.title);
		System.out.println("b.price : " + b.price);
		System.out.println("b.company : " + b.company);
		System.out.println("b.page : " + b.page);
		System.out.println();
		
		
		//���� p�� person�����͸� ��ƺ���.
		PersonVO p; //PersonVO�ڷ����� p���� ����
		p = new PersonVO(); // ��ü���� ���������� �޸𸮿� ��ü����.
		p.name ="KangMinGi"; //������ �ֱ�.
		p.age = 30;
		p.weight = 80;
		p.height = 170;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
		

		/*
		 * �߰����� ����b�� å1���� �����͸� ����������� �ڷ����� �ʿ��ϴ� å1���� �����͸� ������� �� �ִ� �ڷ��� ������ �ڹٿ����� book���
		 * �ڷ����� ����. ���� �����ڰ� ���� book��� �ڷ����� ���� å1���� �־��ָ� �ȴ�. �� �ڷ����� ���鶧 �ʿ��� ������ Ŭ����
		 * �̴�. Ŭ������ ����� �� Ŭ������ �ڷ����̵Ǹ� �� �ڷ����� �̿��ؼ� �����͸� �־��ش�. �̶� b�������� �����͸� �ϳ��� ���� �� �ִ�.
		 * �̋� bookŬ���� ��ü�� b�� ������ �ִ� ���� �ƴ� bookŬ������ �ִ� �޸� �������� ������ �ִ�. b�� å�� �������� ��ü��
		 * �����ϰ� ����־�� �մϴ�. b = new book(); �̶� b�� �������� ������ϴ�. �̶� b�� �ν��Ͻ��� ����ִٰ��Ͽ� �ν��Ͻ�����,
		 * Ȥ�� ��ü�� ����ִٰ� �Ͽ� ��ü ������� �մϴ�.
		 */
	}

}
