import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project02_A {

	//�� ������ ũ�Ѹ� �غ���. ->jsoup���.
	public static void main(String[] args) {
		
		//�Ľ��� �� ������ url.
		String url ="https://sports.news.naver.com/wfootball/index";
		//jsoup�� ���� html�� ������ ��� ��ü����.
		Document doc = null;
		
		//����ó��.
		try {
			doc = Jsoup.connect(url).get(); //get������� �ش�url�� �����Ͽ� doc�� html����.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//doc�κ��� �� ��� ������ ����.
		
		//Elements -> ������html�� ��� Ŭ����. 
		//�� �������� ��ǥ�� �κ��� div�±׾��� home_news�κ� ����.
		Elements elements = doc.select("div.home_news");
		
		//h2�±� -> ���� �����ͺ���.
		String title = elements.select("h2").text().substring(0,4);
		System.out.println("============================");
		System.out.println(title);
		
		for(Element el : elements.select("li")) {
			System.out.println(el.text());
		}
		System.out.println("============================");
		
	}

}























