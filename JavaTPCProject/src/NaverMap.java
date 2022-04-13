import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.Date;
import javax.swing.ImageIcon;
import org.json.*;
import kr.Inflearn.AddressVO;
public class NaverMap implements ActionListener{
	
	Project01_F naverMap; //Project10_F Ÿ�� ���� ����
	public NaverMap(Project01_F naverMap) { //���ڷ� ���� naverMap �� naverMap�ɹ��� ����.
		this.naverMap=naverMap;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String clientId = "d6bcopz9in";
        String clientSecret = "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9";
        AddressVO vo=null;
        try {
        	String address =naverMap.address.getText();
            String addr = URLEncoder.encode(address, "UTF-8");//�Է� ���鵵 ����ó��������Ѵ�.
            String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + addr; 
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
            con.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);            
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8")); 
            } else {  
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer(); //���ڿ� �߰� ����� ���
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            JSONTokener tokener=new JSONTokener(response.toString());
            JSONObject object=new JSONObject(tokener);
            System.out.println(object);
            
            JSONArray arr=object.getJSONArray("addresses");	            
		    for(int i=0;i<arr.length();i++){
		  	 JSONObject temp = (JSONObject) arr.get(i);
		  	 // AddressVO ��ü�� �ּ� ������ ����
		  	 vo=new AddressVO();
		  	 vo.setRoadAddress((String)temp.get("roadAddress"));
		  	 vo.setJibunAddress((String)temp.get("jibunAddress"));
		  	 vo.setX((String)temp.get("x"));
		  	 vo.setY((String)temp.get("y"));
		  	 System.out.println(vo);
		   } 
		    map_service(vo);
         } catch (Exception err) {
            System.out.println(err);
        }
	}
	public void map_service(AddressVO vo) {
		String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
     	try {
     		//vo���� �浵 ����. utf-8 -> ���� ����. %20
     		String pos=URLEncoder.encode(vo.getX() + " " + vo.getY(), "UTF-8");
	        URL_STATICMAP += "center=" + vo.getX() + "," + vo.getY();
	        URL_STATICMAP += "&level=16&w=700&h=500";
	        	
	        //markers pos -> ���� �浵 ��ġ����.
	        URL_STATICMAP += "&markers=type:t|size:mid|pos:"+pos+"|label:"+URLEncoder.encode(vo.getRoadAddress(), "UTF-8");;
	        URL url = new URL(URL_STATICMAP);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", "d6bcopz9in");
            con.setRequestProperty("X-NCP-APIGW-API-KEY", "I7mAeuiFVzSgi77wQUoip88sce07O3jY6AYVlAf9");
            int responseCode = con.getResponseCode();
            BufferedReader br;            
            if(responseCode==200) { //���� ������.
                InputStream is = con.getInputStream();
                int read = 0;
                byte[] bytes = new byte[1024];
                String tempname = Long.valueOf(new Date().getTime()).toString();
                File f = new File(tempname + ".jpg");   
                f.createNewFile();
                OutputStream outputStream = new FileOutputStream(f);
                
                //������ ��������. -> 1024����Ʈ�� �����Ͽ� read�� ����.
                while ((read =is.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
                is.close();
                
                //�̹��� �����͸� �޸𸮿� ��������
            	ImageIcon img=new ImageIcon(f.getName());
            	naverMap.imageLabel.setIcon(img);           	
                naverMap.resAddress.setText(vo.getRoadAddress());
                naverMap.jibunAddress.setText(vo.getJibunAddress());
                naverMap.resX.setText(vo.getX());
                naverMap.resY.setText(vo.getY());
            } else {  // ���� �߻�
                System.out.println(responseCode);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
