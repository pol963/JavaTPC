
import java.net.*;
import java.io.*;

//�������α׷� -> Ŭ���̾�Ʈ���� �����Ͱ����� �µ����͸� �ٽ� Ŭ���̾�Ʈ�� ����. ��ġ ����ó��.
public class Project06A_Server {

	public static void main(String[] args) {
		//ServerSocket -> ��źҰ��� Ŭ���̾�Ʈ ���Ͽ��� �����͹ޱ� �����.
		ServerSocket ss = null;
		
		try { //��Ʈ�� �ߺ��ɼ� ������ �˾ƺ������� try������ �Ǵ�.
			//������ ��Ʈ�� �����Ͽ� ServerSocket ����.
			ss = new ServerSocket(9999);
			System.out.println("Server Ready...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Ŭ���̾�Ʈ���� �� �����͸� �ݺ������� �޾Ƽ� ������� �ϱ⿡ �ݺ��� ���.
		while(true) {
			try {
				//�������Ͽ� Ŭ���̾�Ʈ�� ������ �Ͽ��ٸ� ������ ����. ���ϻ����� ���������� Ŭ���̾�Ʈ�� ������ ��Ƽ� ��. ->���ε�.
				Socket socket = ss.accept();
				System.out.println("Client Connet Success!!!");
				
				//Client���� �����͸� �޾Ƶ��̱� ���� in.
				InputStream in = socket.getInputStream();
				//in����Ʈ ���� ���ڿ�(�ѱ�) �� ���� ���ֱ⿡ Data ����.
				DataInputStream dis = new DataInputStream(in);
				
				//�о�µ����͸� ���ڿ��� ��ȯ�� message�� ����.
				String message = dis.readUTF();
				
				//�ٽ� Ŭ���̾�Ʈ���� ������.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//���ڿ��� �������̿��� Ŭ���̾�Ʈ�� �����ֱ�.
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








