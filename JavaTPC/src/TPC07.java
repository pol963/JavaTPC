
public class TPC07 {
	
	//�޼ҵ��� �Ű����� ���޹�� 2����  1.�� ���� ��� 2.����(���۷���) ���� ���
	public static void main(String[] args) {
		
		//������ ������ �Ǽ��� ��� ������ �����ϰ� �޼ҵ带 �̿��Ͽ� ����ϱ�.
		int a = 38;
		float b = 45.67f;
		
		float result = sum(a,b);
		System.out.println("result : " + result);
		
		
		//5���� ������ ��� �迭�� ����� �ش� ������ �޼ҵ带 �̿��Ͽ� ����ϱ�.
		int[] arr = {1,2,3,4,5};
		int resultArr = arrSum(arr);
		System.out.println("resultArr : " + resultArr);
		
	}

	//���� �Ű������� ���޹��� �޼ҵ�
	public static float sum(int num1, float num2) {
		float resultSum = num1 + num2;
		return resultSum;
		
	}
	
	//���۷����� �Űܺ��� ���޹��� �޼ҵ�
	public static int arrSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
	
	
	
}
