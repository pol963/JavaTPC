

package kr.poly;
//Ŭ���� ������ �����Ǿ� �ִ� 3���� �ڵ�. 1.import java.lang ��Ű�� 2.extends object 3.�����ڸ޼ҵ�� super
import java.lang.*;


public class A extends Object{

	public A() {
		super();
	}
	
	public void display(){
	
		System.out.println("���� A�Դϴ�.");
		
	}

	//��� �Ϲ�Ŭ������ Object Ŭ������ ��ӹ޴´�. ObjectŬ�����ȿ��� toString()�޼ҵ尡 ���ǵǾ� �ִ�.
	@Override
	public String toString() {
		
		return "������ �޼��� �Դϴ�.";
	}
	
	
	
}