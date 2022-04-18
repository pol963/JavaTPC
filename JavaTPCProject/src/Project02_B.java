import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import kr.Inflearn.DownloadBroker;


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
			
			System.out.println();
			System.out.println();
			
			
			//���ҽ�(mp3,img) �ٿ�ε� �غ���.
			
			/*
			//mp3 // "source" �±׾��� ������ ��������.
			Element tag = doc.select("source").first();
			//tag�� ������ src�� ������ �����ѵ� dPatg�� ����.
			String dPath=tag.attr("src").trim(); //https://meditation.su.or.kr/meditation_mp3/2022/20220418.mp3
			System.out.println(dPath); //mp3�ּ� ���.
			//���� �̸� ���ϱ�. -> subString -> ���������� ���ڿ� �ε��� ��ȯ -> dPath�� lastIndexOf -> / �ںκп� +1.
			String fileName = dPath.substring(dPath.lastIndexOf("/")+1);
			*/
			
			//�̹��� ��ο� �����̸�.
			Element tag = doc.select(".img > img").first();
			String dPath="https://sum.su.or.kr:8888"+tag.attr("src").trim();
			System.out.println(dPath);
			String fileName = dPath.substring(dPath.lastIndexOf("/")+1);
			
			//������ �ٿ�ε� �� �� �ִ� ������ �ϳ� �����.
			//dPath -> ��� , fileName -> �����̸�.
			Runnable r = new DownloadBroker(dPath,fileName);
			//������ ����
			Thread dLoad = new Thread(r);
			dLoad.start(); //������ ����.
			
			//�����忡�� �۾�(�ٿ�ε�)�� �ϰ� �ִ� ���߿��� �ش� ���� Ŭ������ for���� �ݺ�. ī��Ʈ�ٿ� 1���� 10����. 
			for(int i = 0; i < 10 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.print(" " + (i+1));
				
			}
			
			System.out.println();
			System.out.println("====================");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}



/*
 	���μ���(process)�� �ܼ��� ���� ���� ���α׷�(program)�̶�� �� �� �ֽ��ϴ�.
	��, ����ڰ� �ۼ��� ���α׷��� �ü���� ���� �޸� ������ �Ҵ�޾� ���� ���� ���� ���մϴ�.
	�̷��� ���μ����� ���α׷��� ���Ǵ� �����Ϳ� �޸� ���� �ڿ� �׸��� ������� �����˴ϴ�.
 	������(thread)�� ���μ���(process) ������ ������ �۾��� �����ϴ� ��ü�� �ǹ��մϴ�.
 	
 	
 	
 */



















