package kr.poly;

//�������̽��� ������ �޼ҵ带 ���� �� �����ϴ�. -> �������̽� Ŭ������ �ҿ����� Ŭ�����̱⿡ ��ü������ �Ұ��� �մϴ�. -> �θ�Ŭ�����μ��� ��밡�� -> ������ ����.
public interface RemoCon {

	//�������̽��� ���(������ �ʴ� ��)���� ���� �� �ֽ��ϴ�.
	public static final int MaxCh = 100;
	int MinCh = 1; // public static final ���� ����.
	
	
	//�߻�޼��� -> �Ϲݸ޼���� ���� �� �����ϴ�.
	public abstract void chUp();
	public void chDown(); //abstract���� ���� -> �������̽��� ������ �����մϴ�.
	public void internet();
}
