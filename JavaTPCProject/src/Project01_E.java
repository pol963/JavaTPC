import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.util.Date;

import org.json.*;

public class Project01_E {

	//static map api ����� ���� �޼��� ����. -> ���� �̹��� ���� �Լ�.
	public static void map_service(String point_x, String point_y, String address) {
		
		//static map api url�� ��������.
		String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		
		try {
			//��Ŀ�� ��ġ�� ��� �����Ǻ���.
			String pos = URLEncoder.encode(point_x+" "+point_y,"UTF-8");
			//url�� �ּҸ� �ְ� ���������� �ٿ��ֱ� ����.
			String url = URL_STATICMAP;
			//center -> ��Ÿ���ִ� ���� ���߾� ǥ��.
			url += "center=" + point_x + "," + point_y;
			//������ ũ�� ����.
			url += "&level=16&w=700&h=500";
			//������ ��Ŀ ����.
			url += "&markers=type:t|size:mid|pos:"+pos+"|labal:"+URLEncoder.encode(address,"UTF-8");
			
			//�ش� �ּҰ� ��ȿ���� �˾ƺ������� ��ü ����. ������ ���� ��ü ����.
			URL u = new URL(url);
			
			//url��ü�� �̿��ؼ� ����. ����Ǹ� HttpURLConnection��ü�� �̿��Ͽ� �޾��ֱ�.
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			
			//������ ���� ������,id,secret ����.
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID","d6bcopz9in");
			con.setRequestProperty("X-NCP-APIGW-API-KEY", "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9");
			
			//���� 3���� ������ �Է��ؼ� ���������� ������ ������ �ǰ� ������ ���������� �˾ƺ���
			int responseCode = con.getResponseCode(); //200 �� ����.
			
			BufferedReader br;
			if(responseCode == 200) { //�����Ͻ�.
				//byte������ �����͸� ���� ���̱⿡ InputStream��ü ����.
				InputStream is = con.getInputStream();
				
				//�޾Ƶ��� �����͸� OutputStream�� �̿��Ͽ� ���Ͽ� �ֱ����� int�� ���� ����.
				int read = 0;
				
				//������ buffer����. 1024����Ʈ��ŭ ��� �Ѱ��ֱ⸦ �ݺ��ϱ� ���� �迭����.
				byte[] bytes = new byte[1024];
				
				//�����̸��������� -> ���� �ð� ���ڿ�.
				String tempname = Long.valueOf(new Date().getTime()).toString();
				
				//���� ������ ���� ��ü����. �̸�����
				File f = new File(tempname + ".jpg");
				
				//���� ����
				f.createNewFile();
				
				//������ �������ؼ� OutputStream�����.
				OutputStream outputStream = new FileOutputStream(f);
				
				
				while((read = is.read(bytes)) != -1) {
					outputStream.write(bytes,0,read);
				}
				is.close();
				
				
			}else { //���� �߻���.
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputline;
				StringBuffer response = new StringBuffer();
				while((inputline = br.readLine()) != null) {
					response.append(inputline);
				}
				br.close();
				System.out.println(response.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {

		String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
		String Client_id = "d6bcopz9in";
		String Client_Secret = "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9";

		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			String address = io.readLine();
			String addr = URLEncoder.encode(address, "UTF-8");

			String reqURL = apiUrl + addr;

			URL url = new URL(reqURL);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", Client_id);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", Client_Secret);

			int responseCode = con.getResponseCode(); // 200�� ����.

			BufferedReader br;

			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}

			String line;

			StringBuffer response = new StringBuffer();

			
			//�̹������������� ���� ���� 3�� �����. -> static map api����.
			String x = "";  String y = ""; String z = "";
			
			while ((line = br.readLine()) != null) {
				response.append(line);
			}

			br.close();

			JSONTokener tokener = new JSONTokener(response.toString());

			JSONObject object = new JSONObject(tokener);
			System.out.println(object.toString());
			System.out.println();

			JSONArray arr = object.getJSONArray("addresses");

			for (int i = 0; i < arr.length(); i++) {

				JSONObject temp = (JSONObject) arr.get(i);

				System.out.println("roadAddress : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("�浵 : " + temp.get("x"));
				System.out.println("���� : " + temp.get("y"));
				
				//x,y,z�� �� �־��ֱ� -> static map api�� ���� ������ �������� ����.
				x=(String) temp.get("x");
				y=(String) temp.get("y");
				z=(String) temp.get("roadAddress");
			}
			
			//�޼ҵ� ȣ��
			map_service(x,y,z);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
