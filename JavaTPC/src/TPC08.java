
public class TPC08 {

	//static Ű���忡 ���Ͽ�.
	public static void main(String[] args) {

		int a = 20;
		int b = 30;
		
		int v=add(a,b); //static�޼ҵ� ȣ�� 
		System.out.println(v);
		
	}
	
	
	public static int add(int a , int b) {
		int  sum = a+b;
		return sum;
	}
	
}


//�߰� ���� ���� �޼ҵ尡 static�̶�� ȣ���ϴ� �޼ҵ���� static�̿��� �Ѵ�.
//staticŰ����� ���α׷��� �����ϱ����� �޼ҵ忡 ���� �ڵ带 �޸𸮿� �ε��� ��Ű������ Ű�����Դϴ�.
//static zone�̶�� ������ ��ġ�� �ڵ����� �ε��� �˴ϴ�.
//staticŰ���尡 �޼ҵ忡 �پ��ִٸ� main�޼ҵ� ���� �پ��ֱ⿡ �ٷ� ȣ���� �����մϴ�.





