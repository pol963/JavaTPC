
public class TPC35 {

	
	//String Ŭ������ ����.
	public static void main(String[] args) {
		
		String str1 = new String("APPLE"); //��������. ��������
		String str2 = new String("APPLE"); //��������. ��������
		
		if(str1 == str2) { //���ڿ����� �񱳸� �Ҷ����� ==�� ���� �����ڸ� ����ϸ� �ȵ˴ϴ�. -> ������ ��
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		System.out.println("====== �ùٸ� �� =====");

		if(str1.equals(str2)) { //str1�� ����Ű�� ������ ����� str2�� ����Ű�� ������ ������ ��.
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		System.out.println();
		System.out.println();
		//���ͷ� ����� ���.
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if(str3 == str4) { //���ͷ� ����� ������ �����Ѱ�� ���ͷ� �޸� Ǯ �� ���� ���� -> ��Ȱ�뼺�� ���� ����2���� �������� ����Ŵ.
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		if(str3.equals(str4)) { //���ͷ� ����� ������ �����Ѱ�� ���ͷ� �޸� Ǯ �� ���� ���� -> ��Ȱ�뼺�� ���� ����2���� �������� ����Ŵ.
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		/*
		 	��ü����(new)�� �Ͽ� String ������ �����͸� ������ ��ü������������ ������ ��������� �񱳽� ������ �񱳵ȴ� == �� ���. equals��� ������ �ƴ� �����͸� ��.
		 	heap Area ������ ����.
		 	
		 	���ڿ� ����� ���� ������ �����Ͱ� ���ٸ� ���� ������ �����մϴ�. ==�����ڷ� �񱳽� ������ ��.
		 	literal pool �޸� ������ ����.
		 	
		 	�߿������δ� equals�� ����Ͽ� �񱳸� �ϱ�.
		  
		  
		 */
		
		
		
	}

}
