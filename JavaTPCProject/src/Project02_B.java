import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import kr.Inflearn.DownloadBroker;


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
			
			System.out.println();
			System.out.println();
			
			
			//리소스(mp3,img) 다운로드 해보기.
			
			/*
			//mp3 // "source" 태그안의 내용을 가져오기.
			Element tag = doc.select("source").first();
			//tag의 내용중 src를 공백을 제거한뒤 dPatg에 저장.
			String dPath=tag.attr("src").trim(); //https://meditation.su.or.kr/meditation_mp3/2022/20220418.mp3
			System.out.println(dPath); //mp3주소 경로.
			//파일 이름 정하기. -> subString -> 지정범위의 문자열 인덱스 반환 -> dPath의 lastIndexOf -> / 뒤부분에 +1.
			String fileName = dPath.substring(dPath.lastIndexOf("/")+1);
			*/
			
			//이미지 경로와 파일이름.
			Element tag = doc.select(".img > img").first();
			String dPath="https://sum.su.or.kr:8888"+tag.attr("src").trim();
			System.out.println(dPath);
			String fileName = dPath.substring(dPath.lastIndexOf("/")+1);
			
			//실제로 다운로드 할 수 있는 쓰레드 하나 만들기.
			//dPath -> 경로 , fileName -> 파일이름.
			Runnable r = new DownloadBroker(dPath,fileName);
			//쓰레드 생생
			Thread dLoad = new Thread(r);
			dLoad.start(); //스레드 시작.
			
			//스레드에서 작업(다운로드)를 하고 있는 도중에는 해당 메인 클래스는 for문을 반복. 카운트다운 1부터 10까지. 
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
 	프로세스(process)란 단순히 실행 중인 프로그램(program)이라고 할 수 있습니다.
	즉, 사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중인 것을 말합니다.
	이러한 프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성됩니다.
 	스레드(thread)란 프로세스(process) 내에서 실제로 작업을 수행하는 주체를 의미합니다.
 	
 	
 	
 */



















