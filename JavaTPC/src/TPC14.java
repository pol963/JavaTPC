import kr.tpc.MemberVO;

public class TPC14 {
	//ȸ������ ������ ���� ��ü������ ������ ����ְ� ���� -> �������е� Ŭ�������� ���� ��������.
	public static void main(String[] args) {

		MemberVO m = new MemberVO();
		
		m.setName("ȫ�浿");
		m.setAge(25);
		m.setTel("010-1111-2222");
		m.setAddr("����");
		
		
		System.out.println("Name : " + m.getName());
		System.out.println("Age : " + m.getAge());
		System.out.println("Tel : " + m.getTel());
		System.out.println("Addr : " + m.getAddr());
		
		
		
	}

}

/*
 * MemberVOŬ������ �ɹ��������� ���еǾ� �ֱ⿡ ���������� ������ �Ұ��� �մϴ�. ���� �ش� �����鿡 ���������� ������ �� �ִ� getter,setter�޼��带 �̿��մϴ�.
 * setter -> �Ҵ� , getter - > ��������. 
 * */
 