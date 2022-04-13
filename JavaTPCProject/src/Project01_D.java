import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

import org.json.*;

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
		
		//��Ʈ��ũ ���,�����ͺ��̽� ����...����� ��� ����ó���� �ʼ�.
		try {
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			//io : Ű����� ���ڿ��� �Է¹޴� ����. readLine : ���پ� �о���̱�. -> address�� ����.
			String address = io.readLine(); 
			//�Է¹��� �ּҿ� ������ �ִٸ� �ȵǱ� ������ Encoding�� UTF-8�� �������ֱ�.
			String addr = URLEncoder.encode(address, "UTF-8");
			
			//��û URL -> ���̹� api�� ��ûurl�� Ű����� �Է��� �ּҸ� �Ѱܼ� ��û.
			//"https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query="+addr; �� ���ĵ� ����.
			String reqURL = apiUrl+addr;
			
			//�ش� URL�� ��ȿ�� �ּ����� �ƴ��� �˾ƺ���. ��ȿ���� ������ ����.
			URL url = new URL(reqURL); 
			
			//url��ü�� �̿��ؼ� ����. ������ �ϰ� �Ǹ� HttpURLConnention ��ü�� �޾��ֱ�.
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//������ ���� ������,id,secret ����.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", Client_id);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", Client_Secret);
			
			//���� 3���� ������ �Է��ؼ� ���������� ������ ������ �ǰ� ������ ���������� �˾ƺ���
			int responseCode = con.getResponseCode(); //200�� ����.
			
			//���������� 200���� �޾Ҵٸ� json���·� ���� �����͸� ���پ� �о�鿩�� �ϱ⶧���� BufferedReader�� ���.
			BufferedReader br;
			
			
			//���������� 200�̶�� json���·� ������ �Ѿ��. ���پ� �о���̱�.
			if(responseCode == 200) {
				//������ �����͸� �о�;� �մϴ�.
				//con.getInputStream() -> con�� ��� json�����͸� byte������ ��������. �ѱ۱������������� UTF-8
				//InputStreamReader byte������ �����͸� ���ڴ��� �����ͷ� ó���� �� �ְ� ���ݴϴ�.
				//BufferedReader ��ȯ�� ���ڵ��� buffer������� ���ڿ��� ó��.
				//��, byte������ ������ �����͸� ���������� �����ͷ� ��ȯ�� buffer����� �̿��Ͽ� ���ڿ� ������ ����
				//BufferedReader�� �ᱹ ������� ���Ǹ� ���� ���.
				br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
				
			}else { //������ ����� getErrorStream�� ���� ���������Ͱ� ����.
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			
			//���������� ��Ʈ���� �����ٸ� bufferedReader�� �̿��ؼ� �� ���ξ� �о���̱�.
			
			//�Ѷ��ξ� �о���̱� ���� ����.
			String line;
			
			//�� ���ξ� �о�帰 �����͸� �����ϱ� ���� ����.
			StringBuffer response = new StringBuffer();
			
			//�ݺ����� �̿��ؼ� ���������� �����͸� ���پ� ����. 
			while((line = br.readLine()) != null) { //line�� br����� �����͸� 1�پ� ����. -> null�̸� ��ž.
				response.append(line); //line�� 1�پ� ���� ������(json) response�� ����.
			}
			
			br.close();
			
			//���ϴ� ������ �̾Ƴ���.json(���ڿ�) -> response�� ��� json�����͸� ���ڿ� �������� tokener�� ����.
			JSONTokener tokener = new JSONTokener(response.toString());
			
			//������ tokener���� ���ڿ� �����͸� Object���·� ��ȯ. -> �����͸� �ڵ鸵 �Ϸ��� Object���·� ��ȯ����� �մϴ�.
			JSONObject object = new JSONObject(tokener);
			System.out.println(object.toString());
			System.out.println();
			
			//key value�� �̿��� �迭�� �ּҰ��� ������.
			JSONArray arr =object.getJSONArray("addresses");
			
			//�ݺ����� ����ؼ� ������ ������.
			for(int i = 0; i < arr.length() ; i++) {
				
				//arr.get(i) -> arr�� i���� �����͸� temp�� ����.
				JSONObject temp = (JSONObject) arr.get(i);
				
				//addresses�ȿ� �ִ� �� �����͸� �ϳ��� ������. 
				System.out.println("roadAddress : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("�浵 : " + temp.get("x"));
				System.out.println("���� : " + temp.get("y"));
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
		
	}

}





