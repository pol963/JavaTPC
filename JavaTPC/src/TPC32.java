import kr.tpc.*;

public class TPC32 {

	public static void main(String[] args) {
		
		//java와 DB를 연결하여 프로그래밍 하는것을 jDBC라고 합니다.
		//DB(oracle,mysql) -> DriverClass(java에서 제공하는 인터페이스가 기본)
		
		//직접 만든 클래스들로 DB연결을 가정해보기 DbConnect(부모),JavaOracle(자식),JavaMysql(자식)
		DbConnect conn = new JavaOracle(); //부모인터페이스클래스로 자식클래스 이용가능.
		conn.getConnection("URL제공","User제공","password제공");
		
		
		conn = new JavaMysql();
		conn.getConnection("URL제공","User제공","password제공");
		
		
		
	}

}

/*
 	즉, 인터페이스의 중요한점은 JDBC에도 나타난다 각 데이터베이스(oracle,Mysql,Mssql)들에서 모두 다 java와 연결하기위해 
 	자바에서 프로그래밍을 하는것을 불가능 하다. 각 데이터베이스 별로 접속방법,CRUD방법이 다르기 때문이다. 
 	즉, 각 데이터베이스별로 따로 진행하는것은 불가능에 가깝다.
 	이러한 어려움을 해결하기위해 인터페이스로 부모클래스를 만든뒤 구현하는 메서드도 만들어 데이터베이스로 규약(인터페이스클래스)를 넘겨준뒤
 	직접 규약에 맞게 설정하게 한다. 설정된파일은 자바 개발자가 몰라도 된다. 
 	부모인터페이스 클래스로 자식클래스들의 기능을 몰라도 다 사용이 가능하기 때문. 
 
 */


