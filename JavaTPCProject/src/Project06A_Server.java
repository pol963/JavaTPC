
import java.net.*;
import java.io.*;

//에코프로그램 -> 클라이언트에서 데이터가오면 온데이터를 다시 클라이언트에 전달. 마치 에코처럼.
public class Project06A_Server {

	public static void main(String[] args) {
		//ServerSocket -> 통신불가능 클라이언트 소켓에서 데이터받기 대기중.
		ServerSocket ss = null;
		
		try { //포트가 중복될수 있으니 알아보기위해 try문으로 판단.
			//임의의 포트를 지정하여 ServerSocket 생성.
			ss = new ServerSocket(9999);
			System.out.println("Server Ready...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//클라이언트에서 온 데이터를 반복적으로 받아서 보내줘야 하기에 반복문 사용.
		while(true) {
			try {
				//서버소켓에 클라이언트가 접속을 하였다면 소켓을 생성. 소켓생성시 서버소켓이 클라이언트의 정보를 담아서 줌. ->바인딩.
				Socket socket = ss.accept();
				System.out.println("Client Connet Success!!!");
				
				//Client에서 데이터를 받아들이기 위한 in.
				InputStream in = socket.getInputStream();
				//in바이트 단위 문자열(한글) 을 받을 수있기에 Data 보조.
				DataInputStream dis = new DataInputStream(in);
				
				//읽어온데이터를 문자열로 변환후 message에 저장.
				String message = dis.readUTF();
				
				//다시 클라이언트에게 보내기.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//문자열로 소켓을이용해 클라이언트에 돌려주기.
				dos.writeUTF("[ECHO]"+message+"from Server");
				dos.close();
				dis.close();
				socket.close();
				System.out.println("Client Server Close...");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//while
	}//main
}//class








