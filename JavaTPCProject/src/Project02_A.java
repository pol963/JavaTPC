import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Project02_A {

	//�� ������ ũ�Ѹ� �غ���. ->jsoup���.
	public static void main(String[] args) {
		
		//�Ľ��� �� ������ url.
		String url ="https://sports.news.naver.com/wfootball/index";
		Document doc = null;
		
		//����ó��.
		try {
			doc = Jsoup.connect(url).get(); //get������� �ش�url�� �����Ͽ� doc�� html����.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//doc�κ��� �� ��� ������ ����.
		
		//�� �������� ��ǥ�� �κ��� div�±׾��� home_news�κ� ����.
		Elements elements = doc.select("div.home_news");
		
		
		
	}

}
