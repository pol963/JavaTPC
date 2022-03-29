
public class TPC06 {

	//메소드란 ? 호출될시 기능들이 동작하여 결과값을 반환하는 것 입니다. 
	//메소드는 독립적이기에 메인메소드 안에 만들 수 없습니다.
	public static void main(String[] args) {
		//랜덤한 정수 2개를 선언하고 메소드를 통하여 계산하기.
		int a,b;
		a=45;
		b=55;
		
		int result = sum(a,b);
		System.out.println("result : " + result);
		
		System.out.println();
		
		//arrInt메소드를 호출하고 결과값을 받아보기.
		int[] resultArr = arrInt();
		
		//받은 결과값을 활용해 각 인덱스의 정수를 합해보기. 반복문 필수 사용.
		int sum=0;
		for(int i = 0;i<resultArr.length;i++) {
			sum += resultArr[i];
		}
		
		System.out.println("sum : " + sum);

		
	}
	
	//호출될시 정수 2개를 매개변수로 받아 합하여 결과값을 리턴하는 메소드를 정의 하기.
	public static int sum(int num1, int num2) {
		int resultMet = num1 + num2;
		
		return resultMet;
	}
	
	//임의의 정수3개를 배열형태로 리턴하는 메소드 구현하기.
	public static int[] arrInt() {
		
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		return arr;
		
		
	}

}



















