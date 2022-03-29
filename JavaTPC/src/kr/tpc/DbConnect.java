package kr.tpc;

//java에서 DB에 해당 인터페이스를 제공 java에서 제공하기에 따로 만들필요가 없습니다.
//제공해주는 인터페이스로 해당되는 DB를 CRUD......등을 할 수 있습니다.
public interface DbConnect {

	//데이터베이스연결할때는 해당 메소드를 이용해서 구현하게끔하기위해 제공
	public void getConnection(String url,String user,String password);
	
	
}
