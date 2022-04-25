import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import kr.Inflearn.ExcelVO;

//------------------------�̿�---------------------

public class Project03_D {
	
	//Ű����κ��� å �����͸� �Ѱܹ޾� api���� img..���� ������ �޾ƿ���.
	public static void main(String[] args) {
		
		//Ű����κ��� ���� �����͸� buffer�� �̿��Ͽ� br�� ����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			//å ���� ���� ���ǻ� �Է� �ޱ�.
			System.out.print("å����:");
			String title=br.readLine();
			System.out.print("å����:");
			String author=br.readLine();
			System.out.print("���ǻ�:");
			String company=br.readLine();
			
			//�Է¹��� ������ vo�� ����.
			ExcelVO vo=new ExcelVO(title, author, company);
			
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
			String openApi="https://openapi.naver.com/v1/search/book_adv.xml?d_titl="
					+ URLEncoder.encode(vo.getTitle(), "UTF-8")
					+ "&d_auth="+URLEncoder.encode(vo.getAuthor(), "UTF-8")
					+ "&d_publ="+URLEncoder.encode(vo.getCompany(), "UTF-8");
				
			//URL�� �ùٸ��� ����.
			URL url = new URL(openApi);
			
			
			//��������ֱ�.
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			
			//���̵��н������ �Ѱ��ִ� ���.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", "wPEDAEevqo84ctrZD8rs");
			con.setRequestProperty("X-Naver-Client-Secret", "bbZBqR_ZND");
			
			//�ڵ带 ���Ͽ� �� �Ѿ�� �Ѿ�Ӵ��� Ȯ���ϱ�.
			int responseCode = con.getResponseCode(); //200�̶�� ����.
			
			
			//200���� �����̶�� �����͸� �޾ƿ���.
			//�޾ƿ��� ���� Buffered ����.
			BufferedReader br1=null;
			 if(responseCode==200) {
				 br1=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));			 
			 }else {
				 br1=new BufferedReader(new InputStreamReader(con.getErrorStream()));
			 }
			
			
			//���پ� �о ������� ������ ��ü.
			//���������� bufferedReader�̸����ٸ� �о���̱�.
			String inputLine;
			//���䵥���ʹ��.
			StringBuffer response = new StringBuffer();
			
			//�ݺ������� br1�� ����ִ� �����͸� inputLine�� �ֱ�.
			 while((inputLine=br1.readLine())!=null) {
				
				//StringŸ���� inputLine�� buffer����� ���� StringBuffer�� ����.
				 response.append(inputLine);
			}
			
			br1.close();
			System.out.println(response.toString());
			
			//doc��ü�����.
			Document doc = Jsoup.parse(response.toString());
			System.out.println(doc.toString());
			
			//total���� 0�̶�� ã�°��� �����Ѱ�. ���� ����غ��� �Ǵ��ϱ�.
			Element total =doc.select("total").first();
			System.out.println("total : " + total.text());
			
			System.out.println();
			
			//if������ tatal�� ���� �Ǵ� ��isbm�� imgurl��������.
			if(!(total.text().equals("0"))) {
				Element isbn = doc.select("isbn").first();
				String isbnStr = isbn.text();
				System.out.println("isbnStr : " + isbnStr);
				
				//isbn�� ã������ ������ �����غ���.
				String isbn_fine = isbnStr.split(" ")[1];
				vo.setIsbn(isbn_fine);
				
				System.out.println("isbn_fine : " + isbn_fine);
				System.out.println();
				
				
				//imgã�ƺ���.
				//Element img = doc.select("img").first();
				//System.out.println(img.toString());
				
				
				
				
			}else {
				System.out.println("�˻� ����� �����ϴ�.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}













