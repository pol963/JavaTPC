package kr.tpc;

//�޼��� �����ε�� ? �޼ҵ��� �̸��� ������ �Ű������� ������ �ڷ����� �ٸ� ������ �ϴ� �޼ҵ带 ������ ���� �ϴ°�. 
public class OverLoad {
	//����(method)���θ� �̷���� ��ü
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(float a,int b) {
		System.out.println(a+b);
	}
	public void sum(float a,float b) {
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
}

/*
 *�޼ҵ� �����ε�ÿ� �޼ҵ� �̸��� �� ���ƺ������� �����Ͻÿ��� �޼ҵ��� �̸��� �� ����˴ϴ�.
 *���� �̸��� ���� �޼ҵ��� �Ͽ��� ã���� �ð��� �����ɷ� �޸𸮰� �Ҹ�Ǵ� ���� �����ϴ�.
 *���� sum�̿��� �����Ͻ� sum_int_int ó�� �� �ٸ��� ������ �˴ϴ�. 
 * 
 * 
 */
 