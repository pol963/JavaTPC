package kr.Inflearn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownloadBroker implements Runnable{

	private String address;
	private String fileName;
	public DownloadBroker(String address, String fileName) {
		super();
		this.address = address;
		this.fileName = fileName;
	}
	
	
	//쓰레드 시작시 해당 메서드에서 작업이 시작됩니다.
	@Override
	public void run() {
		
		try {
			//파일명으로 파일 만들기..
			FileOutputStream fos = new FileOutputStream(fileName);
			//파일 쓰기를 위한 스트림만들기.
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//URL객체를 생성하여 address정보를 url에 저장.
			URL url = new URL(address);
			InputStream is = url.openStream(); //url주소에 있는 데이터(이미지 오디오 등등)를 OpenStream을 이용하여 InputStream에 넣어줌
			BufferedInputStream input = new BufferedInputStream(is); //is (InputStream)을 좀더 향상시켜 사용 Buffered. 속도를 빠르게.
			
			
			int data;
			//input안의 데이터를 byte형태로 data에 저장.
			while((data=input.read()) != -1) {
				bos.write(data);
			}
			bos.close();
			input.close();
			System.out.println("다운로드 완료.");
			System.out.println(fileName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
