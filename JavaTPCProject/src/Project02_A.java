import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project02_A {

	//웹 페이지 크롤링 해보기. ->jsoup사용.
	public static void main(String[] args) {
		
		//파싱할 웹 페이지 url.
		String url ="https://sports.news.naver.com/wfootball/index";
		//jsoup로 얻어온 html의 모든것을 담는 전체문서.
		Document doc = null;
		
		//예외처리.
		try {
			doc = Jsoup.connect(url).get(); //get방식으로 해당url에 연결하여 doc에 html저장.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//doc로부터 각 요소 가져와 보기.
		
		//Elements -> 가져온html을 담는 클래스. 
		//웹 페이지에 목표한 부분의 div태그안의 home_news부분 선택.
		Elements elements = doc.select("div.home_news");
		
		//h2태그 -> 제목 가져와보기.
		String title = elements.select("h2").text().substring(0,4);
		System.out.println("============================");
		System.out.println(title);
		
		for(Element el : elements.select("li")) {
			System.out.println(el.text());
		}
		System.out.println("============================");
		
	}

}























