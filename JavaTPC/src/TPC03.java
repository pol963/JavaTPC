import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		//관계 이해하기. PDT(기본자료형) vs UDDT(유저자료형)
		
		int a;
		a = 10;
		
		//책 1권을 저장하기 위한 변수 선언하기. -> 책이라는 자료형은 자바에서 제공하지 않습니다.
		//직접 자료형을 만들어야 합니다 만들기 위한 도구가 바로 Class입니다.
		Book b;
		
		//b에 객체 레퍼런스 저장.
		b = new Book(); //객체생성 -> 내가 설계한대로 클래스(도구)를 이용하여 객체 생성. b=객체.
		
		//b변수안에는 객체가 있어서 바로접근을 못하고.을 이용해서 접근해야 합니다.
		b.title="자바의정석";
		b.price=15000;
		b.company="한빛미디어";
		b.page=700;
		
		System.out.println("b.title : " + b.title);
		System.out.println("b.price : " + b.price);
		System.out.println("b.company : " + b.company);
		System.out.println("b.page : " + b.page);
		System.out.println();
		
		
		//변수 p에 person데이터를 담아보기.
		PersonVO p; //PersonVO자료형의 p변수 선언
		p = new PersonVO(); // 객체생성 실질적으로 메모리에 객체생성.
		p.name ="KangMinGi"; //데이터 넣기.
		p.age = 30;
		p.weight = 80;
		p.height = 170;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
		

		/*
		 * 추가설명 변수b에 책1권의 데이터를 집어넣을려면 자료형이 필요하다 책1권의 데이터를 집어넣을 수 있는 자료형 하지만 자바에서는 book라는
		 * 자료형은 없다. 따라서 개발자가 직접 book라는 자료형을 만들어서 책1권을 넣어주면 된다. 이 자료형을 만들때 필요한 도구가 클래스
		 * 이다. 클래스를 만들면 이 클래스는 자료형이되며 이 자료형을 이용해서 데이터를 넣어준다. 이때 b변수에는 데이터를 하나만 넣을 수 있다.
		 * 이떄 book클래스 자체를 b가 가지고 있는 것이 아닌 book클래스가 있는 메모리 참조값을 가지고 있다. b에 책을 담으려면 객체를
		 * 생성하고 담아주어야 합니다. b = new book(); 이때 b에 참조값이 담겨집니다. 이때 b는 인스턴스를 담고있다고하여 인스턴스변수,
		 * 혹은 객체를 담고있다고 하여 객체 변수라고 합니다.
		 */
	}

}
