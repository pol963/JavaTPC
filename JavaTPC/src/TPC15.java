import kr.tpc.MemberVO;

public class TPC15 {
	
	//MemberVOŬ������ Ȱ��.
	public static void main(String[] args) {
		
		//��ü������ ���ÿ� �ʱ�ȭ ���� �ϱ� -> �ʱ�ȭ��? ���� �����ִ°�.
		MemberVO m1=new MemberVO("ȫ���",50,"010-0000-1111","����");
		System.out.println(m1.toString());
		
		//setter,getter�޼ҵ� �̿��Ͽ� �ʱ�ȭ �ϱ�.
		MemberVO m2=new MemberVO();
		m2.setName("ȫ����");
		m2.setAge(55);
		m2.setTel("010-1111-1111");
		m2.setAddr("�λ�");
		System.out.println(m2.toString());
		
	}

}
