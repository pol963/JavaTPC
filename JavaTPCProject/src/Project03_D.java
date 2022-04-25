import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import kr.Inflearn.ExcelVO;

//------------------------미완---------------------

public class Project03_D {
	
	//키보드로부터 책 데이터를 넘겨받아 api에서 img..등의 정보를 받아오기.
	public static void main(String[] args) {
		
		//키보드로부터 받은 데이터를 buffer를 이용하여 br에 저장.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			//책 제목 저자 출판사 입력 받기.
			System.out.print("책제목:");
			String title=br.readLine();
			System.out.print("책저자:");
			String author=br.readLine();
			System.out.print("출판사:");
			String company=br.readLine();
			
			//입력받은 데이터 vo로 묶기.
			ExcelVO vo=new ExcelVO(title, author, company);
			
			//vo의데이터를 api에 넘겨서 요청하고 요청에 대한 응답데이터를 받는 메서드.
			getIsbnImage(vo);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	//api에 연결.
	private static void getIsbnImage(ExcelVO vo) {
		
		try {
			
			//api URL에 값 같이 넘겨주기. 
			String openApi="https://openapi.naver.com/v1/search/book_adv.xml?d_titl="
					+ URLEncoder.encode(vo.getTitle(), "UTF-8")
					+ "&d_auth="+URLEncoder.encode(vo.getAuthor(), "UTF-8")
					+ "&d_publ="+URLEncoder.encode(vo.getCompany(), "UTF-8");
				
			//URL이 올바른지 보기.
			URL url = new URL(openApi);
			
			
			//연결시켜주기.
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			
			//아이디패스워드와 넘겨주는 방식.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", "wPEDAEevqo84ctrZD8rs");
			con.setRequestProperty("X-Naver-Client-Secret", "bbZBqR_ZND");
			
			//코드를 통하여 잘 넘어가고 넘어왓는지 확인하기.
			int responseCode = con.getResponseCode(); //200이라면 정상.
			
			
			//200으로 정상이라면 데이터를 받아오기.
			//받아오기 위한 Buffered 생성.
			BufferedReader br1=null;
			 if(responseCode==200) {
				 br1=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));			 
			 }else {
				 br1=new BufferedReader(new InputStreamReader(con.getErrorStream()));
			 }
			
			
			//한줄씩 읽어서 담기위한 변수와 객체.
			//성공적으로 bufferedReader이만들어졋다면 읽어들이기.
			String inputLine;
			//응답데이터담기.
			StringBuffer response = new StringBuffer();
			
			//반복문으로 br1에 담겨있는 데이터를 inputLine에 넣기.
			 while((inputLine=br1.readLine())!=null) {
				
				//String타입의 inputLine를 buffer기능을 가진 StringBuffer에 저장.
				 response.append(inputLine);
			}
			
			br1.close();
			System.out.println(response.toString());
			
			//doc객체로출력.
			Document doc = Jsoup.parse(response.toString());
			System.out.println(doc.toString());
			
			//total값이 0이라면 찾는것을 실패한것. 따라서 출력해보고 판단하기.
			Element total =doc.select("total").first();
			System.out.println("total : " + total.text());
			
			System.out.println();
			
			//if문으로 tatal의 값을 판단 후isbm과 imgurl가져오기.
			if(!(total.text().equals("0"))) {
				Element isbn = doc.select("isbn").first();
				String isbnStr = isbn.text();
				System.out.println("isbnStr : " + isbnStr);
				
				//isbn을 찾았으면 범위를 지정해보기.
				String isbn_fine = isbnStr.split(" ")[1];
				vo.setIsbn(isbn_fine);
				
				System.out.println("isbn_fine : " + isbn_fine);
				System.out.println();
				
				
				//img찾아보기.
				//Element img = doc.select("img").first();
				//System.out.println(img.toString());
				
				
				
				
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}













