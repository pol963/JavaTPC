package kr.tpc;

//java���� DB�� �ش� �������̽��� ���� java���� �����ϱ⿡ ���� �����ʿ䰡 �����ϴ�.
//�������ִ� �������̽��� �ش�Ǵ� DB�� CRUD......���� �� �� �ֽ��ϴ�.
public interface DbConnect {

	//�����ͺ��̽������Ҷ��� �ش� �޼ҵ带 �̿��ؼ� �����ϰԲ��ϱ����� ����
	public void getConnection(String url,String user,String password);
	
	
}
