import kr.tpc.Animar;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	//상속에 의한 클래스를 사용하는 방법
	public static void main(String[] args) {

		//확장성이 좋은 객체생성 방법 -> 상속에 의한.
		Animar ani = new Dog(); //UpCasting
		ani.eat();
		
		
		ani = new Cat();
		ani.eat();
		/* 형변환DownCasting
		Cat NC = (Cat)ani; 
		NC.night();
		*/
		
		//위의 두줄을 한줄로 줄인 코드.
		((Cat)ani).night();
		
	}

}

/*
 	Dog클래스 Cat클래스는 Animar클래스를 부모로두고있는 자식 클래스이다.
 	부모클래스는 자식클래스 둘에게 같은 동작을 요구한다 -> eat
 	이때 자식클래스 둘은 같은 동작의 요구에 다른 반응을 보인다. 각 개처럼먹다,고양이처럼 먹다 로 반응한다.
 	이렇게 같은 요구에 다른 반응을 보이는것을 다형성 이라고 합니다.
*/





