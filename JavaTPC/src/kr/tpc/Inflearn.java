package kr.tpc;

//�ΰ��� �޼ҵ� ����� �ϳ��� �Ϲ� �޼��� �ϳ��� static�޼���� �����.
public class Inflearn {

	private Inflearn() {
		
	}
	//�ν��Ͻ� �޼���. -> ������ �޼��尡 private�ϰ�� ���� ȣ���� �Ұ����մϴ�. new�����ڸ� ����� �� ���� ������. -> static�޼���� �ٲ���� �մϴ�.
	public static void TPC() {
		System.out.println("TPC���Ǵ� ����ִ�.");
	}
	
	//Ŭ���� �޼���. -> ������ �޼��尡 private���� Ŭ����.Java�� �ٷ� ȣ���� �����մϴ�.
	public static void Java() {
		System.out.println("java���Ǵ� ����ִ�.");
	}
	
}
