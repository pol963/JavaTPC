import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Project02_B {

	//키보드로 날짜를 입력하면 웹페이지의 특정 정보를 크롤링 해오는 프로그램 구현해보기.
	public static void main(String[] args) {

		//접속에 필요한 url. 
		String url ="https://sum.su.or.kr:8888/bible/today/Ajex/Bible/BodyMatter?qt_ty=QT1";
		
		//키보드로 날짜를 입력하기위해 BufferReader구현. -> system은 Byte , BufferedReader은 문자열 중간에 연결이필요.
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		//네트워크 통신 이기에 예외처리 필수.
		try {
			//입력 형식.
			System.out.print("[날짜 입력 -> 년(yyyy) - 월(mm) - 일(dd)] : ");
			//입력받아서 bible에 저장. br -> BufferedReader / readLine -> 한줄씩 읽어들이기.
			String bible = br.readLine();
			
			//url뒤에 해당 웹페이지의 형식에 맞게 변수들을 채워줘야 날짜에 따른 데이터를 가져올 수 있습니다.
			//&->데이터이어붙일떄 필요. base_de = bible(날짜입력데이터)
			url = url+"&Base_de ="+bible+"&bibleType=1";
			System.out.println("=============================");
			
			//url에 일치하는 웹 페이지의 정보를 jsoup으로 가져오기. 연결하여 doc에 저장.
			Document doc = Jsoup.connect(url).post();
			
			//웹페이지의 제목 가져와보기 first여러개의 bible_text중 첫번째를 가져오기.  .은 클래스로 접근 #은 아이디로 접근.
			Element bible_text = doc.select(".bible_text").first();
			System.out.println(bible_text.text());
			
			//본문정보 가져와보기.
			Element bibleinfo_box = doc.select(".bibleinfo_box").first();
			System.out.println(bibleinfo_box.text());
			
			//본문안의 글들을 다 가져와보기. >는 하위요소 선택.
			Elements liList = doc.select(".body_list > li");

			//하나씩 모두 다 일일이 넣을 수 없기에 반복문으로 넣어주기.
			for(Element el : liList) {
				System.out.print(el.select(".num").first().text()+" : ");
				System.out.println(el.select(".info").first().text());
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
