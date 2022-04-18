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
	
	
	//������ ���۽� �ش� �޼��忡�� �۾��� ���۵˴ϴ�.
	@Override
	public void run() {
		
		try {
			//���ϸ����� ���� �����..
			FileOutputStream fos = new FileOutputStream(fileName);
			//���� ���⸦ ���� ��Ʈ�������.
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//URL��ü�� �����Ͽ� address������ url�� ����.
			URL url = new URL(address);
			InputStream is = url.openStream(); //url�ּҿ� �ִ� ������(�̹��� ����� ���)�� OpenStream�� �̿��Ͽ� InputStream�� �־���
			BufferedInputStream input = new BufferedInputStream(is); //is (InputStream)�� ���� ������ ��� Buffered. �ӵ��� ������.
			
			
			int data;
			//input���� �����͸� byte���·� data�� ����.
			while((data=input.read()) != -1) {
				bos.write(data);
			}
			bos.close();
			input.close();
			System.out.println("�ٿ�ε� �Ϸ�.");
			System.out.println(fileName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
