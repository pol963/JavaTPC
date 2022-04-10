import java.io.InputStream;

import org.json.JSONObject;
import org.json.*;

public class Project01_C {

	public static void main(String[] args) {

		//�ܺο���(�ٸ�����������) json������ �����͸� �ް� �ٽ� Object���·� �־�� �Ҷ�.
		//������ �о���̱����� ���ϸ� ����.
		String src = "info.json";
		
		//������ �о�帮������ IO�� stream(��Ʈ��)�� ����ϱ�.
		InputStream is = Project01_C.class.getResourceAsStream(src); //Project01_C�� �ִ� ��ο��� getResourceAsStream src�� �����Ͽ� IO�������� 
		
		//������ �����ÿ� ���� ����ó��.
		if(is==null) {
			throw new NullPointerException("Can not find resource file");
		}
		
		//���ڿ��� �� ������ json������ ������ �ø������� �۾�. -> ���ڿ��� �޸𸮿� json���°� �Ǿ� �ö�.
		JSONTokener tokener = new JSONTokener(is);
		
		//json�����͸� �ڵ鸵 �ϱ� ���ؼ��� Object�� �ʿ�. Object�� �ٽ� ��������.
		JSONObject object = new JSONObject(tokener);

		//Array�����̱� ������ Array���·� �����͸� ��������.
		JSONArray students1=object.getJSONArray("students");
		
		//�ݺ����� ����Ͽ� ��������.
		for(int i = 0 ; i < students1.length() ; i++) {
			//get(i) i��°���ִ� �����͸� �������� get�� Object������ �������� ������ �ٿ�ĳ������ �ʿ��մϴ�.
		JSONObject student = (JSONObject)students1.get(i);
		
		System.out.print(student.get("name") + "\t");
		System.out.print(student.get("address") + "\t");
		System.out.println(student.get("phone"));
		
		
		}
		
		
	}
}


















