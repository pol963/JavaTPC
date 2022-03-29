import kr.tpc.*;

public class TPC24 {
	
	//다형성 배열 -> 배열의 타입을 부모의 자료형타입으로 만들면 자식 객체들을 배열안에 받을 수 있습니다. ->배열 안에는 동일한 객체타입만 넣을 수 있다.
	//ex) Dog 는 Dog만 Cat는 Cat만 or int는 int만 ......
	public static void main(String[] args) {
		
		//Dog와 Cat를 한 배열에 저장해보기.
		Animar[] ani = new Animar[2];
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i = 0; i < ani.length;i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}//for
		
		
		System.out.println();
		System.out.println();
		
		display(ani);
		
	}

	//위의 과정을 메소드로 코딩한것.
	private static void display(Animar[] ani) { //다형성 배열.
		for(int i = 0; i < ani.length;i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}
	}

}
