package kr.tpc;

//å1���� ������ �����ϰ� ���ִ� ���� -> Ŭ���� -> �ڷ���. 
//å1���� ���� -> �̸�,����,���ǻ�,��������. 
public class BookVO {

	//����
	public String title;
	public int price;
	public String company;
	public int page;
	
	//�⺻������ �޼ҵ�.
	public BookVO() {
		//this.title = "�ڹ�"; ��� ������ �� �������� ����Ŭ�������� ���� �ֱ�. -> thisŰ���带 ����Ͽ� �ɹ������� �����ϴ� ���.
		
	}
	
	
	//������ �޼ҵ��� �ߺ����� �ʱ�ȭ.
	public BookVO(String title,int price,String company,int page) {
		
		//thisŰ���带 ����Ͽ� �ɹ�����(Ŭ���� ����)���� �����ϱ�.
		this.title = title; //this.title -> �ɹ����� = ���� title�� ������ �޼ҵ� ȣ����� �Ű����� �������Դϴ�.
		this.price = price;
		this.company = company;
		this.page = page;
		
	}
	
	
	
	
	
}
