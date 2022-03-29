import kr.tpc.BookVO;

public class TPC11 {

	// 책한권을 저장하기 위해 객체를 생성하기.
	public static void main(String[] args) {

		// 객체 생성. -> BookVO자료형의 변수 b를 생성. -> b안에 new연산자로 BookVO의 구조를 담고있는 메모리를 가르키고 있는
		// 주소 저장.
		BookVO b = new BookVO();

		// 객체에 데이터 넣기->책한권의 정보 넣기.
		b.title = "파이썬";
		b.price = 15000;
		b.company = "에이콘";
		b.page = 700;

		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);

		
		// 다른책도 만들어서 저장해보기.

		BookVO b1 = new BookVO();

		b1.title = "오라클";
		b1.price = 17000;
		b1.company = "에이콘";
		b1.page = 300;

		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
		System.out.println(b1.page);

	}

}

/*
 * 모델링이란? -> 객체안에 속성(상태정보,맴버변수...등등)들중 필요한것만 뽑아내는 과정을 모델링 이라고 합니다. 클래스를 만들때
 * public키워드는 너무 위험한 방법입니다. -> 누구나,아무나 객체에 직접적으로 접근할 수 있기 때문입니다. 따라서 public모두공개
 * 키워드가 아닌 private 키워드를 이용해 객체정보를 보호해줍니다. -> 정보은닉
 * 
 * 
 *
 */
