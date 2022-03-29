
public class TPC07 {
	
	//메소드의 매개변수 전달방법 2가지  1.값 전달 기법 2.번지(레퍼런스) 전달 기법
	public static void main(String[] args) {
		
		//임의의 정수와 실수를 담는 변수를 선언하고 메소드를 이용하여 계산하기.
		int a = 38;
		float b = 45.67f;
		
		float result = sum(a,b);
		System.out.println("result : " + result);
		
		
		//5개의 정수가 담긴 배열을 만들고 해당 정수를 메소드를 이용하여 계산하기.
		int[] arr = {1,2,3,4,5};
		int resultArr = arrSum(arr);
		System.out.println("resultArr : " + resultArr);
		
	}

	//값을 매개변수로 전달받은 메소드
	public static float sum(int num1, float num2) {
		float resultSum = num1 + num2;
		return resultSum;
		
	}
	
	//레퍼런스를 매겨변수 전달받은 메소드
	public static int arrSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
	
	
	
}
