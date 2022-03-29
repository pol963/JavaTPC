import kr.tpc.Inflearn;

public class TPC31 {
	
	public static void main(String[] args) {
	//Inflearn클래스를 이용하여 객체를 생성하고 메소드 2개를 호출해보기.
		
		//클래스 메서드 이기에 클래스.java로 접근이 가능합니다 -> static키워드.
		Inflearn.TPC();
		Inflearn.Java(); 
		
		
		//Java API의 private 생성자들의 예시 구현해보기. 
		System.out.println("출력"); //system클래스안의 모든 메서드는 다 static키워드가 붙어 있기에 따로 객체생성없이 바로 클래스.으로 사용가능합니다.
		int num = Math.max(10, 20);
		System.out.println("num : " + num);
		
		
	}

}

/*
 * 생성자 메소드가 중요한 이유는 객체생성시 생성자 메소드가 객체를 생성해 주기 때문입니다.-> 클래스이용을 생성자메소드가 객체생성으로 가능하게해줌.
 * 생성자 메소드가 private일 경우 static키워드를 이용해서 클래스를 사용해야 합니다.
 * static키워드가 붙어있는 맴버는 변수던 메소드던 메모리공간에 프로그램이 시작할 때 부터 올라가 있기 때문에 객체생성없이 사용이 가능합니다.
 * 클래스를 만들때 static키워드가있는 메서드를 클래스 메서드라고 합니다 -> 객체생성없이 접근 가능.
 * 클래스를 만들때 static키워드가 없는 메서드를 인스턴스 메서드라고 부릅니다. -> new연산자를 이용하여 객체를 필수적으로 생성해줘야 합니다.
 * new 연산자의 뜻은 강제적으로 메모리에 올린다는 것 입니다. 
 * static키워드가 붙어있는 메소드는 자동으로 메모리에 올라가 집니다. -> method Area의 static 존에.
 * 
 * */
