package kr.Inflearn;

//잘만든 클래스의 조건 4가지.
// 1. 정보은닉  2. 기본생성자+초기화를위한 생성자 2개 생성  3. set,get 메서드  4. 모든맴버가 가지고 있는 값을 String으로 출력 toString()


public class BookDTO {

	private String title;
	private int price;
	private String company;
	private int page;

	// 기본생성자.
	public BookDTO() {
	}

	// 인자를 받는 생성자.
	public BookDTO(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	};

}
