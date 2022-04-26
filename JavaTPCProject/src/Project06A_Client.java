import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Project06A_Client {
	
	//������ ��û�ϴ� Ŭ���̾�Ʈ.
	public static void main(String[] args) {
		
		try {
			//������ �����ϱ����� ���� �ش� ���Ͽ��� ������ �������� ��� �ֽ��ϴ�.
			Socket socket = new Socket("127.0.0.1" , 9999);
			System.out.println("Connection Success!");
			
			//Ű����κ��� ������ ���� �޽��� �Է�.
			Scanner scanner = new Scanner(System.in);
			
			//Ű����κ��� �Ѷ����� �޽����� �Է¹����� messge�� ����.
			String messge = scanner.nextLine();
			
			//������ ������ �ڵ�.
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF(messge);
			
			
			//�������� Ŭ���̾�Ʈ�� �����ö� �ڵ�.
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





