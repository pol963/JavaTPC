import kr.infrine.IntArray;

public class TPC36 {
	
	//�迭ó�� �����ϴ� Ŭ����(API)�����.
	//1.�迭���� 2.�迭�ε����� �� �ֱ� 3.�迭 �� �������� 4.�迭 ũŰ �˾ƺ���. �� �����ϱ�.
	public static void main(String[] args) {

		
		//���� 3���� �迭�� �����ϰ� ����غ���. -> �迭 ���� �Է�.
		int[] arrInt = new int[3];
		arrInt[0] = 10;
		arrInt[1] = 20;
		arrInt[2] = 30;
		
		for(int i = 0; i < arrInt.length;i++) {
			System.out.println("arrInt[" + i + "] : " + arrInt[i]);
		}
		
		
		//���� Ŭ����(API)�� �̿��ؼ� �迭 �����غ���. -> kr.infrine.IntArray
		IntArray arr = new IntArray(3); //�迭����.
		
		//�迭�� �� �ֱ�.
		arr.add(11);
		arr.add(12);
		arr.add(13);
		
		//�迭ũ�� ��������� �迭������ ��������.
		for(int i = 0 ; i < arr.size() ; i++) {
			
			System.out.println(arr.get(i));
		}
		
	}


	
}
