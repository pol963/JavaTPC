package kr.Inflearn;

//엑셀안의 데이터를 아래 클래스의 형태로 담기위한 클래스.
public class ExcelVO {

	private String title;
	private String author;
	private String company;
	private String isbn;
	private String imgurl;
	
	public ExcelVO() {}

	public ExcelVO(String title, String author, String company, String isbn, String imgurl) {
		super();
		this.title = title;
		this.author = author;
		this.company = company;
		this.isbn = isbn;
		this.imgurl = imgurl;
	}

	//후에 사용할 수도 있기에 구현.
	public ExcelVO(String title, String author, String company) {
		super();
		this.title = title;
		this.author = author;
		this.company = company;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	@Override
	public String toString() {
		return "ExcelVO [title=" + title + ", author=" + author + ", company=" + company + ", isbn=" + isbn
				+ ", imgurl=" + imgurl + "]";
	}
	
	
	
	
	
}
