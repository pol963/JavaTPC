package kr.tpc;


	//클래스를 이용하여 사용자 지정 자료형 UDDT만들기 -> 이는 이후 객체생성을 통해 객체가 됩니다.
public class BookDTO {

	public String title;
	public int price;
	public String company;
	public int page;
	
	//디폴트 생성자 메소드 입니다 -> 생략.
	public BookDTO() {
		//해당 클래스객체가 생성될때 객체를 생성해주는 작업을 합니다. -> 기계어코드
	}

	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
}
