
public class TPC08 {

	//static 키워드에 관하여.
	public static void main(String[] args) {

		int a = 20;
		int b = 30;
		
		int v=add(a,b); //static메소드 호출 
		System.out.println(v);
		
	}
	
	
	public static int add(int a , int b) {
		int  sum = a+b;
		return sum;
	}
	
}


//추가 설명 메인 메소드가 static이라면 호출하는 메소드또한 static이여야 한다.
//static키워드란 프로그램을 실행하기전에 메소드에 기계어 코드를 메모리에 로딩을 시키기위한 키워드입니다.
//static zone이라는 고정된 위치에 자동으로 로딩이 됩니다.
//static키워드가 메소드에 붙어있다면 main메소드 에도 붙어있기에 바로 호출이 가능합니다.





