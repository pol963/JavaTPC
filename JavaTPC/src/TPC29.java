import kr.tpc.*;

public class TPC29 {

	public static void main(String[] args) {

		//tpc�� A��B�� ��ü�� �����ѵ� �ΰ��� �ٹ��� ���ִ� �޼ҵ� �����ϱ� ���ڷ� �Ѵ� ������ �־�� �մϴ�. -> �θ�Ÿ��.
		A a = new A();
		display(a);
		B b = new B();
		display(b);
	}

	
	//���ڷ� A��B�� �ٹ��� ���ִ� �޼��带 �����ϰ� A�� B�� ��ü�� �������� go�޼��带 �����Ͽ�����. ����.
	//�θ�Ÿ������ display���ڸ� ������ �޼��带 2�� ������ �ʿ䰡 �����ϴ�.
	private static void display(Object o) { //������ �μ�.

		if(o instanceof A) {
			((A)o).go();
		}else {
			((B)o).go();
		}
		
	}

}
