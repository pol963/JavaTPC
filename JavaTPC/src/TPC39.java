
public class TPC39 {
	
	//��ü�ڷ���.
	public static void main(String[] args) {
		
		//���� 1�� �����ϴ� 2���� ���.
		int a = 1;
		Integer b = new Integer(1); //Integer b = 1; �� ���ڿ������� ���.
		
		System.out.println(b.intValue()); //���������
		System.out.println(b.toString()); //���ڿ����
		
		System.out.println("--------------------");
		//������Ʈ�迭�� 3���� ���� �־��.
		Object[] obj = new Object[3];
		/*
		 * obj[0] = new Integer(1); //obj[0] = 1; �� ���ڿ������� ���. 
		 * obj[1] = new Integer(2);
		 * obj[2] = new Integer(3);
		 */
		
		//Boxing�� �̿��Ͽ� ������ �־��.
		
		obj[0] = 1;
		obj[1] = 2;
		obj[2] = 3;
		
		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());
		
		
		
		//"100"+"100" = 200 -> ���ڿ�100�ΰ��� ���Ͽ� ������ 200�� �����. -> ���ڿ��� ���������� �����غ���.
		String a1 = "100";
		String a2 = "100";
		
		System.out.println("���ڿ� ���ϱ� : " + a1+a2);

		int v1 = Integer.parseInt(a1);
		int v2 = Integer.parseInt(a2);
		System.out.println(v1+v2);
		
		
		//100+100 = "100100" -> �������� ���ڿ��� ���ϱ�.

		String num1 = String.valueOf(v1);
		String num2 = String.valueOf(v2);
		System.out.println(num1+num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
