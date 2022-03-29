import kr.tpc.*;

public class TPC23 {
	
	//다형성 이론 실습. 	
	public static void main(String[] args) {
		
		//1.다형성 인수 -> 매개변수의 변수타입을 부모의 타입으로 하면 자식 객체들을 받을 수 있습니다. -> 메소드를 여러개 만드는것을 간편하게 변경.
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
		
		
		
	}
	
	
	//다형성인수 -> 부모자료형으로 자식 자료형을 다받는것 -> display인자에 각 Dog d, Cat c가 한번씩 들어옵니다. 
	public static void display(Animar r) { //이떄 r은 자동 UpCasting 
		 r.eat();
		 
		 //instanceof -> 객체타입확인 연산자 -> 형변환여부를 확인하여 t or f 로 반환해줍니다.
		 if(r instanceof Cat) { //r이 Cat타입으로 만들어졋다면 True 아니면 False
			 ((Cat)r).night(); //DownCasting
		 }
		 
	}

}
