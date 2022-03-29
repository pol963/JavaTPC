
public class TPC04 {

	public static void main(String[] args) {
		//변수와 배열의 데이터 이동에 대한 실습. 
		
		//정수형데이터3개를 넣을 수 있는 변수 만들고 데이터 넣기.
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		//abc를 더하는 메소드 호출하기.
		plus(a,b,c);
		
		
		//위의 과정을 배열의 형태로 구현하기.
		int[] arr = new int[3]; //배열자료형의 변수 선언 이후 객체 생성.
		
		//배열 인덱스안에 값 할당하기.
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		//할당한 값을 토대로 더해주는 메소드 호출하기.
		plus1(arr);
		
	}
	
	//abc를 더하는 메소드를 만들기.
	public static void plus(int x,int y,int z) {
		int sum = x+y+z;
		System.out.println("sum : " + sum);
		
	}
	
	public static void plus1(int[] x) {
			
			//반보문을 사용하여 인자로 받은 배열 더해주기.
			int sum = 0;
			for(int i = 0; i<x.length; i++) {
				sum += x[i];
				
			}
			System.out.println("arrsum :" + sum);
			
		
	}
	
	//추가설명 : 기본적으로 배열이란 여러개의 데이터를 하나의 구조로 만들어 이동하기 쉽게하기 위한것입니다.
	
}





















