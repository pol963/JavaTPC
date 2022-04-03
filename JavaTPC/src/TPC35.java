
public class TPC35 {

	
	//String 클래스의 이해.
	public static void main(String[] args) {
		
		String str1 = new String("APPLE"); //번지저장. 힙에리어
		String str2 = new String("APPLE"); //번지저장. 힙에리어
		
		if(str1 == str2) { //문자열끼리 비교를 할때에는 ==과 같은 연산자를 사용하면 안됩니다. -> 번지를 비교
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		System.out.println("====== 올바른 비교 =====");

		if(str1.equals(str2)) { //str1이 가르키는 번지의 내용과 str2가 가르키는 번지의 내용을 비교.
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		System.out.println();
		System.out.println();
		//리터럴 상수의 경우.
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if(str3 == str4) { //리터럴 상수로 변수에 저장한경우 리터럴 메모리 풀 에 따로 생성 -> 재활용성이 좋다 변수2개가 같은곳을 가르킴.
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if(str3.equals(str4)) { //리터럴 상수로 변수에 저장한경우 리터럴 메모리 풀 에 따로 생성 -> 재활용성이 좋다 변수2개가 같은곳을 가르킴.
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		/*
		 	객체생성(new)을 하여 String 변수에 데이터를 넣으면 객체생성변수에는 번지가 들어있으며 비교시 번지로 비교된다 == 의 경우. equals라면 번지가 아닌 데이터를 비교.
		 	heap Area 영역에 생성.
		 	
		 	문자열 상수로 변수 생성시 데이터가 같다면 같은 번지를 공유합니다. ==연산자로 비교시 같음이 뜸.
		 	literal pool 메모리 영역에 생성.
		 	
		 	중요점으로는 equals로 사용하여 비교를 하기.
		  
		  
		 */
		
		
		
	}

}
