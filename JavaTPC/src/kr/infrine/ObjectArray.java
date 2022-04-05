package kr.infrine;

	//�迭ó�� �����ϴ� Ŭ����(API)�����.
	//1.�迭���� 2.�迭�ε����� �� �ֱ� 3.�迭 �� �������� 4.�迭 ũŰ �˾ƺ���. �� �����ϱ�.
public class ObjectArray {
	
	private int count=0; //������ üũ.
	private Object[] arr; //�迭�� ����.
	
	
	//�迭���� �⺻ ������ -> ȣ��ÿ� ���ڰ��� �Ѱ����� �ʾ������� ���.
	public ObjectArray() {
		this(10); //this�� �ڱ��ڽ��� ȣ�� ���ڰ��� �ޱ⶧���� �ٸ� �����ڸ޼ҵ� ȣ��.
	}
	
	//�迭���� ��ü������ ���ڸ� �Ѱܹ޾��� ��.
	public ObjectArray(int init) {
		arr = new Object[init]; //private int[] arr = new int[init] �� ����. 
	}
	
	//�迭�ε����� �� �ֱ�.
	public void add(Object data) {
		arr[count++] = data;
	}
	
	//�迭 �� ��������.
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		
		return count;
		//return arr.length;
		
	}
	
	

}
