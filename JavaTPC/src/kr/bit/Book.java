package kr.bit;

public class Book { //클래스라는 도구로 만든 사용자정의 자료형(UDDT)
	
	public String title;
	public int price;
	public String company;
	public int page;
	

}

//책 자료형 설계
//제목, 가격, 출판사, 페이지수 ... 이러한 것들을 "상태정보"라고 합니다.
//다시말해 객체 라고 정의할 수 있습니다 책이라는 객체.
//사람또한 객체로 말할 수 있습니다. 키,몸무게...등은 상태정보 행동은 행위정보=메소드 입니다. 
//즉 객체는 속성들을 가르키는 상태정보와 행동들을 정의하는 행위정보:메소드 로 구성되어있습니다.
	//제목,가격,출판사,페이지수 등과 같은 데이터를 담기위해서는 변수가 필요합니다.
	//하나의 메모리or구조or덩어리에 담기위해 클래스 안에 만들어줍니다 해당 클래스 안에 저장되는 하나의 객체.
	//기억공간여러개를 하나로 붙여놓는것이 객체. 클래스로 설계하는것.