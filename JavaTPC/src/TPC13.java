import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		
		//class vs object vs instance -> å(�ڷ���Ŭ����) vs ��ü(�ڷ��� ����or��ü����) vs �ν��Ͻ�(�ν��Ͻ� ����)
		
		
		//������ å ������ ���� 4���� ���� �����.
		String title = "�����ڰ� �Ǵ¹�";
		int price = 15000;
		String company ="������";
		int page = 400;
						
					//BookDTOŬ������ �ٷ� �ڷ��� Ŭ�����Դϴ�. ���赵 �Դϴ�. 
		BookDTO dto; //������ dto�� �׳� ��ü : Object �Դϴ�. �ƹ��� �����Ͱ� ������� �ʱ⶧����. 
		
		//�̶��� dto�� �ν��Ͻ� ���� �Դϴ�. new�����ڿ� BookDTO�����ڸ޼ҵ�� �޸𸮿� ��ü�� ����� ������ �ν��Ͻ� ���� ����մϴ�.
		dto = new BookDTO(title,price,company,page); 
		
		//�޼ҵ�ȣ��ÿ� dto�ν��Ͻ��� �ְ� ȣ���غ���.
		bookPrint(dto);
	
	
	}
	
	//�Ű������� BookDTO�ڷ����� dto������ �޴� �޼ҵ�. �������δ� dto������ ����Ű�� ���۷����� �� ������ ����ϱ�.
	public static void bookPrint(BookDTO dto) {
		
		System.out.println(dto.title);
		System.out.println(dto.price);
		System.out.println(dto.company);
		System.out.println(dto.page);
		
	}
}

/*
 * DTO -> �� �����͸� ��Ƽ� �̵��Ѵٴ� ���̴� ���� Ŭ������ dto�� �ٿ��ָ� �����͸� �޾Ƽ� �ٸ� ������ �̵���Ű�� Ŭ�������� ����Ѱ��Դϴ�.
 * ex) Ŭ���� ���� ���� ������ �����͸� ��� �ٸ� �޼ҵ忡 �Ű������� �Ѱ��ֱ� �̰� �������� �̵��� ���մϴ�. 
 * */






 