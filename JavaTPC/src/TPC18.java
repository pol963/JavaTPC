import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {

	public static void main(String[] args) {
		//java���� �������ִ� Class�� -> API��.
		//String(���ڿ�) Class -> �ڹٿ����� ���ڿ� �ڷ����̶� �����ϴ� String�� ���� �ڹٿ��� ���� ���ڿ� Ŭ���� �Դϴ�. 	
		String str = new String("APPLE");
		//String Class�� �޼ҵ� ����غ��� 
		String loStr = str.toLowerCase(); //�ҹ��� ����
		System.out.println("loStr : " + loStr);
		
		
		//���� ���� ����ϴ� Class�� -> DTO,VO,DAO,Utility API��
		MyUtil mu = new MyUtil();
		int total = mu.sum();
		System.out.println(total);
		
		//�ٸ�ȸ�翡�� ���� Class API -> GSON...��
		//å�ѱ��� �����͸� ��ü������ ���ÿ� �ʱ�ȭ�ϰ� json���� ����غ���.
		BookVO b=new BookVO("�ڹ�",12000,"�������ǻ�",800);
		Gson g= new Gson();
		String json = g.toJson(b);
		System.out.println("json : " + json);
		
		
		
		
	}
}

















