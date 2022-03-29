package kr.tpc;

//책1권의 정보를 저장하게 해주는 도구 -> 클래스 -> 자료형. 
//책1권의 정보 -> 이름,가격,출판사,페이지수. 
public class BookVO {

	//정보
	public String title;
	public int price;
	public String company;
	public int page;
	
	//기본생성자 메소드.
	public BookVO() {
		//this.title = "자바"; 라고 값을줄 수 도있지만 메인클래스에서 값을 주기. -> this키워드를 사용하여 맴버변수에 대입하는 방식.
		
	}
	
	
	//생성자 메소드의 중복정의 초기화.
	public BookVO(String title,int price,String company,int page) {
		
		//this키워드를 사용하여 맴버변수(클래스 변수)임을 지정하기.
		this.title = title; //this.title -> 맴버변수 = 뒤의 title는 생성자 메소드 호출시의 매개변수 데이터입니다.
		this.price = price;
		this.company = company;
		this.page = page;
		
	}
	
	
	
	
	
}
