import kr.tpc.MovieVO;

public class TPC17 {
	
	//�迭�� Ŭ���� or Ŭ������ �迭
	public static void main(String[] args) {
		//������ ������5���� ������ �ִ� �迭�� �����ϰ� 1~5���� ���.
		int[] arrInt1 = new int[5];
		
		arrInt1[0] = 10;
		arrInt1[1] = 20;
		arrInt1[2] = 30;
		arrInt1[3] = 40;
		arrInt1[4] = 50;
		
		//�迭����� �ʱ�ȭ�� ���ÿ� ���� 
		int[] arrInt2 = {10,20,30,40,50};
		
		//�ٸ������� �迭����
		//int[] arrInt3 = new int[] {10,20,30,40,50};
		
		//arrInt2����غ��� �ݺ������
		for(int i = 0 ; i<arrInt2.length;i++) {
			System.out.println(arrInt2[i]);
		}
		
		System.out.println();
		System.out.println();
		
		//��ȭ�����͸� �����غ��� ��ȭ�������� �ɹ������δ� ����,����,���ΰ�,���,�ð� �� �ִ�. 
		MovieVO mv = new MovieVO("����", 10000, "�� ����", 18, 1.4f);
		System.out.println(mv.toString());
		
		System.out.println();
		System.out.println();
		
		
		//��ȭ�����͵��� �迭���·� 3���� ��ȭ�����͸� �����غ���.
		MovieVO[] mvArr = new MovieVO[3];
		mvArr[0] = new MovieVO("����1", 10000, "�� ����", 18, 1.4f);
		mvArr[1] = new MovieVO("����2", 12000, "�� ����", 19, 1.4f);
		mvArr[2] = new MovieVO("����3", 14000, "�� ����", 20, 1.4f);
		
		System.out.println(mvArr[0].toString());
		System.out.println(mvArr[1]);
		System.out.println(mvArr[2]);
		
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		//�ݺ����� ����Ͽ� ����غ���.
		for(int i = 0; i < mvArr.length ; i ++) {
			System.out.println(mvArr[i]);
		}
		
		
		
	}

}




























