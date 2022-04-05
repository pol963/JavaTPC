
public class TPC39 {
	
	//객체자료형.
	public static void main(String[] args) {
		
		//정수 1을 저장하는 2가지 방법.
		int a = 1;
		Integer b = new Integer(1); //Integer b = 1; 이 더자연스러운 방식.
		
		System.out.println(b.intValue()); //정수형출력
		System.out.println(b.toString()); //문자열출력
		
		System.out.println("--------------------");
		//오브젝트배열에 3개의 정수 넣어보기.
		Object[] obj = new Object[3];
		/*
		 * obj[0] = new Integer(1); //obj[0] = 1; 이 더자연스러운 방식. 
		 * obj[1] = new Integer(2);
		 * obj[2] = new Integer(3);
		 */
		
		//Boxing을 이용하여 데이터 넣어보기.
		
		obj[0] = 1;
		obj[1] = 2;
		obj[2] = 3;
		
		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());
		
		
		
		//"100"+"100" = 200 -> 문자열100두개를 더하여 정수형 200을 만들기. -> 문자열을 정수형으로 변경해보기.
		String a1 = "100";
		String a2 = "100";
		
		System.out.println("문자열 더하기 : " + a1+a2);

		int v1 = Integer.parseInt(a1);
		int v2 = Integer.parseInt(a2);
		System.out.println(v1+v2);
		
		
		//100+100 = "100100" -> 정수형을 문자열로 구하기.

		String num1 = String.valueOf(v1);
		String num2 = String.valueOf(v2);
		System.out.println(num1+num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
