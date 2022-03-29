package kr.tpc;

//해당 클래스는 자바 개발자가 구현하는게 아님. DB에서 구현.
public class JavaOracle implements DbConnect{

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB 연결");
		
	}

}
