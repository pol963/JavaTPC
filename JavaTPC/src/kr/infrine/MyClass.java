package kr.infrine;

//MyClass�� ���������� public�� �������� �ʴ´ٸ� default������� �ٴ´�
//default������������ �ǹ̴� ���� ��Ű���������� ������ �����ϳ� ��Ű�� �ܺο����� ������ �Ұ���.
public class MyClass {

	//���ڷ� ���� 2���� �ް� �� ���ڱ����� ���� ���ϴ� �޼��� �����ϱ�.
	public int sum(int a,int b) {
		int total = 0;
			for(int i = a; i<=b ; i++) {
				total += i;
			}
		return total;
	}
}
