
public class TPC09 {

	//staticŰ���忡 ����2
	public static void main(String[] args) {
		
		//staticŰ���尡 ���� �޼ҵ带 �����Ͽ� ���� 2���� ����غ���.
		int a = 30;
		int b = 33;
		
		//sum�޼ҵ带 �̿��ϱ����ؼ��� ��ü������ �Ͽ� heap Area�� TPC09Ŭ������ �ε������ �մϴ�.
		TPC09 tpc09 = new TPC09();
		
		//tpc09Ŭ�������� ���� �����Ͱ� �ֽ��ϴ�. ����,�޼ҵ�...�� ���� ��Ʈ������.�� �̿��Ͽ� ����.
		int result = tpc09.sum(a, b);
		
		System.out.println("result : " + result);
		
	}
	
	//staticŰ���尡 ���� �޼ҵ� �����ϱ�.
	public int sum(int num1,int num2) {
		int total = num1+num2;
		return total;
	}

}



/*
 * �ڹٿ��� �⺻������ method Area , stack Area , heap Area , literal Pool�� �޸� ������ �ִ�.
 * method Area���� �޼ҵ尡 �ε��̵ȴ�. static�� nonstatic�������� ���е�
 * stack Area���� �޼ҵ��� ȣ������ (�Ű�����,���ϰ���) �� ����Ǵ� ��
 * heap Area�� ��ü�� �����Ǵ� �����Դϴ�. -> new �����ڿ� ���� ��ü����.
 * 
 * ���� StaticŰ���尡 ���� �޼��尡 �����Ǿ��ٸ� main�޼��� ���� main�� stack-> heap(��ü����)->
 * method�� nonStatic�������� �ڵ带 ������ -> stack ���� �޼ҵ� ȣ�������� �ް� ������� ����.
 * 
 * ��, staticŰ���尡 ���� �޼ҵ尡 �����Ǿ��ٸ� new�����ڸ� �̿��� ��ü�� ��������� �մϴ�.
 * �̷��� �޸𸮿� ������ ��� �޼ҵ带 ȣ���Ͽ� ����� �� �ֽ��ϴ�.
 * 
 * 
 * 
 *
 */












