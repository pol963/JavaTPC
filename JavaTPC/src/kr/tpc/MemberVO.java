package kr.tpc;

//�߼���� Ŭ������ ���� 1. private ���� ��ü�� ���¸� ��ȣ�Ѵ�. -> ��������
//2. ����Ʈ �����ڸ� ��������� ����� �����ε� ������ ���� ����� �����ϰ� �ʱ�ȭ �Ѵ�.
//3. private���� ��ȣ�� �ɹ��������� �����ϱ����Ͽ� setter,getter�޼ҵ带 ����� -> ������ �Ҵ�,��������.
//4. ��ü�� �������ִ� �� ��ü�� ����ϱ� ���� toString() �޼ҵ带 ������ �ϱ�. 
public class MemberVO {

	private String name;
	private int age;
	private String tel;
	private String addr;

	//����Ʈ�����ڸ��.
	public MemberVO() {
	}
	
	//�����ε�������.
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}



	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//���ڿ� ���·� ������
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}

	
	
}

/*
 * �⺻������ �� ���� Ŭ������ �ɹ������� ���������� �����Ͽ� �����͸� ���� �� �¾��� Ŭ�����Դϴ�. -> ���������� ����.
 * �߸��� ������ ���������� ���� �� �ֱ⶧���� �̷��� ������ �����ϱ����� �ɹ������� �����ϰ� �� �ɹ������� ���������� ������ �� �ִ� �޼��带 ����ϴ�.
 * �� �޼��尡 getter,setter�Դϴ�. �ش� �޼������ �̿��Ͽ� ���������� ������ �����մϴ�. 
 * setter -> �������Ҵ� getter������ ��������.
 * 
 * private setter,getter�޼��尡 ������ ������ �� �޼���ȿ� ���ǹ������� ������ġ�� �س��� �� �ֱ� �����̴� 
 * ex) ���� �Է½� setter�޼��忡 �������� ���ǹ� �ɱ� ���......
 * 
 * */
