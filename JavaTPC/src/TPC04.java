
public class TPC04 {

	public static void main(String[] args) {
		//������ �迭�� ������ �̵��� ���� �ǽ�. 
		
		//������������3���� ���� �� �ִ� ���� ����� ������ �ֱ�.
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		//abc�� ���ϴ� �޼ҵ� ȣ���ϱ�.
		plus(a,b,c);
		
		
		//���� ������ �迭�� ���·� �����ϱ�.
		int[] arr = new int[3]; //�迭�ڷ����� ���� ���� ���� ��ü ����.
		
		//�迭 �ε����ȿ� �� �Ҵ��ϱ�.
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		//�Ҵ��� ���� ���� �����ִ� �޼ҵ� ȣ���ϱ�.
		plus1(arr);
		
	}
	
	//abc�� ���ϴ� �޼ҵ带 �����.
	public static void plus(int x,int y,int z) {
		int sum = x+y+z;
		System.out.println("sum : " + sum);
		
	}
	
	public static void plus1(int[] x) {
			
			//�ݺ����� ����Ͽ� ���ڷ� ���� �迭 �����ֱ�.
			int sum = 0;
			for(int i = 0; i<x.length; i++) {
				sum += x[i];
				
			}
			System.out.println("arrsum :" + sum);
			
		
	}
	
	//�߰����� : �⺻������ �迭�̶� �������� �����͸� �ϳ��� ������ ����� �̵��ϱ� �����ϱ� ���Ѱ��Դϴ�.
	
}





















