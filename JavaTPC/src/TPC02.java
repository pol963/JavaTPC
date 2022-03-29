
public class TPC02 {

	public static void main(String[] args) {

		//프로그래밍의 3대요소 : 변수,자료형(DataType),할당(=)
		//정수형.
		int a,b,c;
		a=1;
		b=1;
		c=a+b;
		System.out.println("c:" + c);
		
		//실수의 자료형은 float, double가 있다. 
		//그중 실수의 소수점은 double형태로 먼저 인식하기에 소수점 뒤에 f라는 float약자를 붙여준다.
		float f;
		f = 34.5f; 
		System.out.println(f);
		
		//문자형 : 문자 하나
		char d;
		d = 'A';
		System.out.println(d);
		
		//문자열 String 
		String str;
		str = "문자하나와 문자열의 차이.";
		
		//논리형
		boolean g;
		g = true; // true 참 false 거짓
		System.out.println(g);
		
		
		
	}

}

/* 프로그래밍의 3대요소 설명
   변수 : 기억공간의 이름 -> 메모리공간의 이름
   자료형 : 크기와 종류 결정
   할당 : 대입연산자로 변수안에 데이터 할당 */
 