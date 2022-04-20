import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import kr.Inflearn.ExcelVO;

public class Project03_D {
	
	//Ű����κ��� å �����͸� �Ѱܹ޾� api���� img..���� ������ �޾ƿ���.
	public static void main(String[] args) {
		
		//Ű����κ��� ���� �����͸� buffer�� �̿��Ͽ� br�� ����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			//å ���� ���� ���ǻ� �Է� �ޱ�.
			System.out.print("å���� : ");
			String title = br.readLine();
			System.out.print("å���� : ");
			String author = br.readLine();
			System.out.print("���ǻ� : ");
			String company = br.readLine();
			
			//�Է¹��� ������ vo�� ����.
			ExcelVO vo = new ExcelVO(title, author, company);
			
			//vo�ǵ����͸� api�� �Ѱܼ� ��û�ϰ� ��û�� ���� ���䵥���͸� �޴� �޼���.
			getIsbnImage(vo);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	//api�� ����.
	private static void getIsbnImage(ExcelVO vo) {
		
		try {
			
			//api URL�� �� ���� �Ѱ��ֱ�. 
			String openApi ="https://openapi.naver.com/v1/search/book_adv.xml?"
					+ "d_titl =" + URLEncoder.encode(vo.getTitle(),"UTF-8")
					+ "&d_auth =" + URLEncoder.encode(vo.getAuthor(),"UTF-8")
					+ "&d_publ =" +  URLEncoder.encode(vo.getCompany(),"UTF-8");
				
			//URL�� �ùٸ��� ����.
			URL url = new URL(openApi);
			
			//��������ֱ�.
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//���̵��н������ �Ѱ��ִ� ���.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", "wPEDAEevqo84ctrZD8rs");
			con.setRequestProperty("X-Naver-Client-Secret", "bbZBqR_ZND");
			
			//�ڵ带 ���Ͽ� �� �Ѿ�� �Ѿ�Ӵ��� Ȯ���ϱ�.
			int responseCode = con.getResponseCode(); //200�̶�� ����.
			
			
			//200���� �����̶�� �����͸� �޾ƿ���.
			//�޾ƿ��� ���� Buffered ����.
			BufferedReader br1 = null;
			if(responseCode == 200) {
				br1 = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				br1 = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			
			//���پ� �о ������� ������ ��ü.
			//���������� bufferedReader�̸����ٸ� �о���̱�.
			String inputLine;
			//���䵥���ʹ��.
			StringBuffer response = new StringBuffer();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}













