import kr.tpc.Animar;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {

		//자동형변환 
		Animar ani = new Cat();
		ani.eat(); //컴피일시에는 Animar의 ?를 가르키나 컴파일이 끝나고 실행시에는 Cat의 고양치러머먹다가 실행 -> override
		
		//ani를 이용해여 night메소드를 호출해보기.
		Cat c_ani = (Cat)ani;
		c_ani.night();
		
		//줄여서 출력해보기.
		//Downcasting
		((Cat)ani).night(); //만약 바깥괄호가 없다면 .연산자가 우선되기에 캐스팅이 되자않고 ani.night로 인식하기에 오류가 나옵니다.
		
		
		//다형성이란 하위클래스들이 상위클래스한테 같은 요구를 받아도 다른 동작을 하는것을 다형성이라고 합니다.
		System.out.println("--------------------------");
		
		//Object클래스의 경우.
		Object o = new Dog();
		//o.eat(); //분명 부모자식클래스는 맞으나 Object클래스는 내가만든지 않았기에eat메서드가 없습니다.
		((Dog)o).eat(); //강제형변환
		
		Dog od = (Dog)o;
		od.eat();
		
		
	}

}
