
public class TPC05 {
	//�⺻ �迭�� ������ �迭�� �ǽ�.
	public static void main(String[] args) {
		
		//1.���� 3���� �����ϴ� �迭�� �����.
		//2.�� �ε������� 10,20,30�� �־��ֱ�.
		//3.�ݺ����� ���Ͽ� �հ踦 ����ϱ�.
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum : " + sum);
		
		
		//9���� ������ ������ �ִ� ������ �迭�� �����.
		int[][] arr1 = new int[3][3];
		
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;
		
		//�� i �� j
		for(int i = 0; i<arr1.length;i++) {
			for(int j = 0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
		//�������� �������迭�� �̿��Ͽ� �ﰢ�� ������.
		int[][] arr2 = new int[5][];
		
		arr2[0] = new int[1];
		arr2[1] = new int[2];
		arr2[2] = new int[3];
		arr2[3] = new int[4];
		arr2[4] = new int[5];
		
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0 ; j < arr2[i].length;j++) {
				arr2[i][j] = '*';
				System.out.print((char)arr2[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
