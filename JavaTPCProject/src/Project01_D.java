import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Project01_D {

	//�ּҸ� �Է��ϸ� �·Ḧ ���Ϲ޴� ���α׷� �����. -> ���̹� API����ϱ�.
	public static void main(String[] args) {
		
		//���̹�API ���� �� ����� ���� �ʼ� �ʿ� �ּ�(��û URL).
		String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
		
		//���̹�API ���� �� ����� ���� �ʼ� �ʿ� Client ID ,Client Secret.
		String Client_id = "d6bcopz9in";
		String Client_Secret = "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9";
		
		//Ű����� ���� �ּ�(����,���θ�)�� �Է¹ޱ� ���� BufferReader(����),System.in(����Ʈ),inputStreamReader(�긴�� ��Ʈ��)
		//�� ����Ʈ��Ʈ���� ���ڽ�Ʈ���� �ٷ� ������ �� ���⶧���� �긴�� ��Ʈ������ ����.
		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		
	}

}




/*
 	1. ���̹��� �ִ� ���� API�� �����Ͽ� ����Ͽ��� �ϱ� ������ �ּҸ� ������ �;� �մϴ�.
  	2. ���̹�API ���� �� ����� ���� �ʼ� �ʿ� Client ID ,Client Secret
  	3. Ű����� ���� �ּ�(����,���θ�)�� �Է¹ޱ� ���� BufferReader
  
 * */



