package kr.tpc;

//�ش� Ŭ������ �ڹ� �����ڰ� �����ϴ°� �ƴ�. DB���� ����.
public class JavaOracle implements DbConnect{

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB ����");
		
	}

}
