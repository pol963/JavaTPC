
public class TPC09 {

	//static키워드에 관해2
	public static void main(String[] args) {
		
		//static키워드가 없는 메소드를 구현하여 정수 2개를 계산해보기.
		int a = 30;
		int b = 33;
		
		//sum메소드를 이용하기위해서는 객체생성을 하여 heap Area에 TPC09클래스를 로딩해줘야 합니다.
		TPC09 tpc09 = new TPC09();
		
		//tpc09클래스에는 여러 데이터가 있습니다. 변수,메소드...등 따라서 도트접근자.를 이용하여 접근.
		int result = tpc09.sum(a, b);
		
		System.out.println("result : " + result);
		
	}
	
	//static키워드가 없는 메소드 구현하기.
	public int sum(int num1,int num2) {
		int total = num1+num2;
		return total;
	}

}



/*
 * 자바에는 기본적으로 method Area , stack Area , heap Area , literal Pool의 메모리 영역이 있다.
 * method Area에는 메소드가 로딩이된다. static과 nonstatic영역으로 구분됨
 * stack Area에는 메소드의 호출정보 (매개변수,리턴값등) 이 저장되는 곳
 * heap Area는 객체가 생성되는 영역입니다. -> new 연산자에 의한 객체생성.
 * 
 * 만약 Static키워드가 없이 메서드가 생성되었다면 main메서드 이후 main의 stack-> heap(객체생성)->
 * method의 nonStatic영역에서 코드를 찍은뒤 -> stack 에서 메소드 호출정보를 받고 결과값이 리턴.
 * 
 * 즉, static키워드가 없이 메소드가 생성되었다면 new연산자를 이용해 객체를 생성해줘야 합니다.
 * 이래야 메모리에 정보가 담겨 메소드를 호출하여 사용할 수 있습니다.
 * 
 * 
 * 
 *
 */












