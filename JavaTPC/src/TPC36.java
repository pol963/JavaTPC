import kr.infrine.IntArray;

public class TPC36 {
	
	//배열처럼 동작하는 클래스(API)만들기.
	//1.배열생성 2.배열인덱스에 값 넣기 3.배열 값 가져오기 4.배열 크키 알아보기. 를 구현하기.
	public static void main(String[] args) {

		
		//정수 3개를 배열에 저장하고 출력해보기. -> 배열 직접 입력.
		int[] arrInt = new int[3];
		arrInt[0] = 10;
		arrInt[1] = 20;
		arrInt[2] = 30;
		
		for(int i = 0; i < arrInt.length;i++) {
			System.out.println("arrInt[" + i + "] : " + arrInt[i]);
		}
		
		
		//만든 클래스(API)를 이용해서 배열 구현해보기. -> kr.infrine.IntArray
		IntArray arr = new IntArray(3); //배열생성.
		
		//배열에 값 넣기.
		arr.add(11);
		arr.add(12);
		arr.add(13);
		
		//배열크기 가져오기와 배열데이터 가져오기.
		for(int i = 0 ; i < arr.size() ; i++) {
			
			System.out.println(arr.get(i));
		}
		
	}


	
}
