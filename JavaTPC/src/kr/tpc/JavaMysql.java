package kr.tpc;

//해당 클래스는 java개발자가 직접 구현하는게 아닙니다.
public class JavaMysql implements DbConnect{

	@Override
	public void getConnection(String url, String user, String password) {

		System.out.println("Mysql 연결");
	}

}
