package kr.tpc;

//영화자료형을 만들기위한 클래스(도구) 설계하기. -> 올바른 클래스로 만들기.
//1.맴버변수의 정보은닉 2.디폴트생성자와 사용자설정생성자(매개변수) 오버로딩 하기 3. setter,getter메소드 만들기 4. toString메소드 만들기.

//영화정보 : 제목,가격,주인공,등급,시간
public class MovieVO {
	private String title;
	private int price;
	private String author;
	private int level;
	private float time;
	
	public void MemberVO() {}
	public MovieVO(String title, int price, String author, int level, float time) {
		this.title = title;
		this.price = price;
		this.author = author;
		this.level = level;
		this.time = time;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", author=" + author + ", level=" + level + ", time="
				+ time + "]";
	};
	
	
	
	
}
