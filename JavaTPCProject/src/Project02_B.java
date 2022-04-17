import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Project02_B {

	//Ű����� ��¥�� �Է��ϸ� ���������� Ư�� ������ ũ�Ѹ� �ؿ��� ���α׷� �����غ���.
	public static void main(String[] args) {

		//���ӿ� �ʿ��� url. 
		String url ="https://sum.su.or.kr:8888/bible/today/Ajex/Bible/BodyMatter?qt_ty=QT1";
		
		//Ű����� ��¥�� �Է��ϱ����� BufferReader����. -> system�� Byte , BufferedReader�� ���ڿ� �߰��� �������ʿ�.
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		//��Ʈ��ũ ��� �̱⿡ ����ó�� �ʼ�.
		try {
			//�Է� ����.
			System.out.print("[��¥ �Է� -> ��(yyyy) - ��(mm) - ��(dd)] : ");
			//�Է¹޾Ƽ� bible�� ����. br -> BufferedReader / readLine -> ���پ� �о���̱�.
			String bible = br.readLine();
			
			//url�ڿ� �ش� ���������� ���Ŀ� �°� �������� ä����� ��¥�� ���� �����͸� ������ �� �ֽ��ϴ�.
			//&->�������̾���ϋ� �ʿ�. base_de = bible(��¥�Էµ�����)
			url = url+"&Base_de ="+bible+"&bibleType=1";
			System.out.println("=============================");
			
			//url�� ��ġ�ϴ� �� �������� ������ jsoup���� ��������. �����Ͽ� doc�� ����.
			Document doc = Jsoup.connect(url).post();
			
			//���������� ���� �����ͺ��� first�������� bible_text�� ù��°�� ��������.  .�� Ŭ������ ���� #�� ���̵�� ����.
			Element bible_text = doc.select(".bible_text").first();
			System.out.println(bible_text.text());
			
			//�������� �����ͺ���.
			Element bibleinfo_box = doc.select(".bibleinfo_box").first();
			System.out.println(bibleinfo_box.text());
			
			//�������� �۵��� �� �����ͺ���. >�� ������� ����.
			Elements liList = doc.select(".body_list > li");

			//�ϳ��� ��� �� ������ ���� �� ���⿡ �ݺ������� �־��ֱ�.
			for(Element el : liList) {
				System.out.print(el.select(".num").first().text()+" : ");
				System.out.println(el.select(".info").first().text());
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
