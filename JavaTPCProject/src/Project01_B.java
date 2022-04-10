import org.json.*;

public class Project01_B {

	public static void main(String[] args) {
		//Json - java(org.json) 
		
		//org.json �ڸ������� �߰� -> Object�� �����ʿ���� org.json���� ��������. -> ���� ����.
		JSONObject student = new JSONObject();
		
		
		//��ü�� ������ �����ϱ����� JSONArray
		JSONArray students = new JSONArray();
		
		
		//put�޼���� �����͸� �־��ִ� �޼���. key/value�� ���·� ����.
		student.put("name", "ȫ�浿");
		student.put("phone", "010-1111-2222");
		student.put("address", "����");
		System.out.println(student);
		
		System.out.println();
		System.out.println();
		
		
		//Array�� �����ͳֱ�.
		students.put(student); //{ [ ��ü , ��ü ] }
		
		
		student = new JSONObject();
		student.put("name", "���浿");
		student.put("phone", "010-3333-2222");
		student.put("address", "����");
		
		
		//Array�� �����ͳֱ�.
		students.put(student); //{ [ ��ü , ��ü ] }
		
		//�״�����
		System.out.println(students);
		
		System.out.println();
		
		//�ٽ� Object���־ key value���·� �־ ���.
		JSONObject object = new JSONObject();
		object.put("students ", students);
		System.out.println(object.toString(1));
		
		
	}

}
