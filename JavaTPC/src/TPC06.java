
public class TPC06 {

	//�޼ҵ�� ? ȣ��ɽ� ��ɵ��� �����Ͽ� ������� ��ȯ�ϴ� �� �Դϴ�. 
	//�޼ҵ�� �������̱⿡ ���θ޼ҵ� �ȿ� ���� �� �����ϴ�.
	public static void main(String[] args) {
		//������ ���� 2���� �����ϰ� �޼ҵ带 ���Ͽ� ����ϱ�.
		int a,b;
		a=45;
		b=55;
		
		int result = sum(a,b);
		System.out.println("result : " + result);
		
		System.out.println();
		
		//arrInt�޼ҵ带 ȣ���ϰ� ������� �޾ƺ���.
		int[] resultArr = arrInt();
		
		//���� ������� Ȱ���� �� �ε����� ������ ���غ���. �ݺ��� �ʼ� ���.
		int sum=0;
		for(int i = 0;i<resultArr.length;i++) {
			sum += resultArr[i];
		}
		
		System.out.println("sum : " + sum);

		
	}
	
	//ȣ��ɽ� ���� 2���� �Ű������� �޾� ���Ͽ� ������� �����ϴ� �޼ҵ带 ���� �ϱ�.
	public static int sum(int num1, int num2) {
		int resultMet = num1 + num2;
		
		return resultMet;
	}
	
	//������ ����3���� �迭���·� �����ϴ� �޼ҵ� �����ϱ�.
	public static int[] arrInt() {
		
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		return arr;
		
		
	}

}



















