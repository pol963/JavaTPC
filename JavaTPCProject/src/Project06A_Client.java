import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Project06A_Client {
	
	//서버에 요청하는 클라이언트.
	public static void main(String[] args) {
		
		try {
			//서버에 접속하기위한 소켓 해당 소켓에는 서버의 정보또한 담겨 있습니다.
			Socket socket = new Socket("127.0.0.1" , 9999);
			System.out.println("Connection Success!");
			
			//키보드로부터 서버에 보낼 메시지 입력.
			Scanner scanner = new Scanner(System.in);
			
			//키보드로부터 한라인의 메시지를 입력받은후 messge에 저장.
			String messge = scanner.nextLine();
			
			//서버로 보내는 코드.
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF(messge);
			
			
			//서버에서 클라이언트로 보내올때 코드.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("ServerEchoMessge : " + dis.readUTF());
			dis.close();
			dos.close();
			socket.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}





