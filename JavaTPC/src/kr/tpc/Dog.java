package kr.tpc;

public class Dog extends Animar{
	
	public Dog() {
		//super();�� �����Ǿ� �ִ� ����. -> �� ���� Ŭ������ ������ ȣ�� �޼ҵ� �Դϴ�. -> AnimarŬ������ ������.
	}
	
	
	//�θ�Ŭ����(Animar)�� ���� eat�޼ҵ带 ��ӹ޾����� �ڽ��� ���� �޼ҵ尡 �ʿ��ϱ⿡ ������(override) �մϴ�. 
	public void eat() { 
		
		System.out.println("��ó�� �Դ´�.");
	}
}
