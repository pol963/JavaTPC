import kr.tpc.BookDTO;

public class TPC10 {
	
	//�⺻�ڷ��� PDT �� ����������ڷ��� UDDT
	public static void main(String[] args) {
	
		//�⺻�ڷ���->PDT
		int a = 10; 
		System.out.println("a : " + a);
		
		//����� ���� �ڷ��� -> UDDT å�� �����ϴº��� �ʿ䰡�� -> BookDTO
		BookDTO b;
		
		b = new BookDTO(); //��ü���� �̶� �����ڸ޼ҵ尡 ȣ��Ǿ� �޸𸮿� ��ü������ ����. 
		
		b.title = "�ڹ��� ����";
		b.price = 15000;
		b.company="�������ǻ�";
		b.page= 670;
		
		System.out.print("b.title : " + b.title + "\t");
		System.out.print("b.price : " + b.price+"\t");
		System.out.print("b.company : " + b.company + "\t");
		System.out.println("b.page : " + b.page);
		
		
		
	}

}



/* 
*
*��ü�� �����Ҷ� new ������ �ڿ� ������ �޼ҵ尡 �ִ´� �̸� ������ �޼ҵ��� �մϴ�.
* -> ������ �޸𸮿� ��ü�� �����ϴ� ������ �ϴ� �޼ҵ�.
* �⺻������ ��ü������ �ش� Ŭ�����ȿ��� ������ �޼ҵ尡 �����Ǿ� �ֽ��ϴ�.
* ��� ��ü�� ����� ������ �ڱ� �ڽ��� ����Ű�� ��ü���� ���̸���� ���ϴ�. �̸� this��ü��� �մϴ�.
* 
*/