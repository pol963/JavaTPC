import kr.tpc.Animar;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {

		//Animar클래스를 사용하지 않은 경우 -> Dog클래스와 Cat클래스를 내가만들어 어떤한 메소드가 있는지 다 알 수 있을때
		
		Dog d = new Dog();
		d.eat();//Animar의 eat메서드 입니다. Dog(자식)클래스가 Animar(부모)클래스를 상속받았기에 사용이 가능합니다.
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		
		//Dog.java 와 Cat.java 소스파일이 없을떄 -> 누군가한테 클래스파일만을 받았을때 Dog와 Cat에 어떠한 메소드가있는지 모를떄.
		Animar ani = new Dog(); //Upcasting(자동형변환)에 의해 부모자식간의 타입이 안맞아도 사용이 가능합니다.
		ani.eat(); //이때 실행전에는 분명 Animar의 eat를 가르키고있으나 실행시에는 오버라이드에 의해 부모의 메서드는 오버라이드된 자식의 메소드를 찾아가서 실행시킨다.
		
		ani = new Cat();
		ani.eat();
		
		
		//중요한점은 Dog와 Cat의 상세한 메소드를 몰라도 상속으로 인해 Animar에서 오버라이드로 Dog메소드를 사용가능하다는 점이다.
		
		//ani는 부모타입이나 자식타입으로 다운캐스팅을 한 것 입니다. -> 강제형변환
		((Cat)ani).night();
		
		
		
		
		
		
		
	}

}
