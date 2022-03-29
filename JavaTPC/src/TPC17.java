import kr.tpc.MovieVO;

public class TPC17 {
	
	//배열과 클래스 or 클래스형 배열
	public static void main(String[] args) {
		//정수형 데이터5개를 담을수 있는 배열을 선언하고 1~5까지 담기.
		int[] arrInt1 = new int[5];
		
		arrInt1[0] = 10;
		arrInt1[1] = 20;
		arrInt1[2] = 30;
		arrInt1[3] = 40;
		arrInt1[4] = 50;
		
		//배열선언과 초기화를 동시에 진행 
		int[] arrInt2 = {10,20,30,40,50};
		
		//다른형태의 배열선언
		//int[] arrInt3 = new int[] {10,20,30,40,50};
		
		//arrInt2출력해보기 반복문사용
		for(int i = 0 ; i<arrInt2.length;i++) {
			System.out.println(arrInt2[i]);
		}
		
		System.out.println();
		System.out.println();
		
		//영화데이터를 저장해보기 영화데이터의 맴버변수로는 제목,가격,주인공,등급,시간 이 있다. 
		MovieVO mv = new MovieVO("리딕", 10000, "빈 디젤", 18, 1.4f);
		System.out.println(mv.toString());
		
		System.out.println();
		System.out.println();
		
		
		//영화데이터들을 배열형태로 3개의 영화데이터를 저장해보기.
		MovieVO[] mvArr = new MovieVO[3];
		mvArr[0] = new MovieVO("리딕1", 10000, "빈 디젤", 18, 1.4f);
		mvArr[1] = new MovieVO("리딕2", 12000, "빈 디젤", 19, 1.4f);
		mvArr[2] = new MovieVO("리딕3", 14000, "빈 디젤", 20, 1.4f);
		
		System.out.println(mvArr[0].toString());
		System.out.println(mvArr[1]);
		System.out.println(mvArr[2]);
		
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		//반복문을 사용하여 출력해보기.
		for(int i = 0; i < mvArr.length ; i ++) {
			System.out.println(mvArr[i]);
		}
		
		
		
	}

}




























