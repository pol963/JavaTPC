import kr.tpc.*;

public class TPC29 {

	public static void main(String[] args) {

		//tpc의 A와B의 객체를 생성한뒤 두개를 다받을 수있는 메소드 구현하기 인자로 둘다 받을수 있어야 합니다. -> 부모타입.
		A a = new A();
		display(a);
		B b = new B();
		display(b);
	}

	
	//인자로 A와B를 다받을 수있는 메서드를 구현하고 A와 B의 객체가 들어왔을때 go메서드를 실행하여보기. 각각.
	//부모타입으로 display인자를 받으면 메서드를 2개 생성할 필요가 없습니다.
	private static void display(Object o) { //다형성 인수.

		if(o instanceof A) {
			((A)o).go();
		}else {
			((B)o).go();
		}
		
	}

}
