import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Project02_A {

	//웹 페이지 크롤링 해보기. ->jsoup사용.
	public static void main(String[] args) {
		
		//파싱할 웹 페이지 url.
		String url ="https://sports.news.naver.com/wfootball/index";
		Document doc = null;
		
		//예외처리.
		try {
			doc = Jsoup.connect(url).get(); //get방식으로 해당url에 연결하여 doc에 html저장.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//doc로부터 각 요소 가져와 보기.
		
		//웹 페이지에 목표한 부분의 div태그안의 home_news부분 선택.
		Elements elements = doc.select("div.home_news");
		
		
		
	}

}
