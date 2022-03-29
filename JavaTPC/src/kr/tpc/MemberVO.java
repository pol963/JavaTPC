package kr.tpc;

//잘설계된 클래스의 조건 1. private 으로 객체의 상태를 보호한다. -> 정보은닉
//2. 디폴트 생성자를 명시적으로 만들며 오버로딩 생성자 또한 만들어 적절하게 초기화 한다.
//3. private으로 보호된 맴버변수에게 접근하기위하여 setter,getter메소드를 만든다 -> 데이터 할당,가져오기.
//4. 객체가 가지고있는 값 전체를 출력하기 위한 toString() 메소드를 재정의 하기. 
public class MemberVO {

	private String name;
	private int age;
	private String tel;
	private String addr;

	//디폴트생성자명시.
	public MemberVO() {
	}
	
	//오버로딩생성자.
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

	//문자열 형태로 재정의
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}

	
	
}

/*
 * 기본적으로 잘 만든 클래스란 맴버변수에 직접적으로 접근하여 데이터를 넣을 수 는없는 클래스입니다. -> 정보은닉의 목적.
 * 잘못된 정보를 직접적으로 넣을 수 있기때문에 이러한 위험을 방지하기위해 맴버변수를 은닉하고 이 맴버변수에 간접적으로 접근할 수 있는 메서드를 만듭니다.
 * 이 메서드가 getter,setter입니다. 해당 메서드들을 이용하여 간접적으로 변수에 접근합니다. 
 * setter -> 데이터할당 getter데이터 가져오기.
 * 
 * private setter,getter메서드가 안전한 이유는 각 메서드안에 조건문과같은 안전장치를 해놓을 수 있기 때문이다 
 * ex) 나이 입력시 setter메서드에 나이제한 조건문 걸기 등등......
 * 
 * */
