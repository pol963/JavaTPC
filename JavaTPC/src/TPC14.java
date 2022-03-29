import kr.tpc.MemberVO;

public class TPC14 {
	//회원정보 저장을 위해 객체생성후 데이터 집어넣고 빼기 -> 정보은닉된 클래스에서 정보 가져오기.
	public static void main(String[] args) {

		MemberVO m = new MemberVO();
		
		m.setName("홍길동");
		m.setAge(25);
		m.setTel("010-1111-2222");
		m.setAddr("서울");
		
		
		System.out.println("Name : " + m.getName());
		System.out.println("Age : " + m.getAge());
		System.out.println("Tel : " + m.getTel());
		System.out.println("Addr : " + m.getAddr());
		
		
		
	}

}

/*
 * MemberVO클래스의 맴버변수들은 은닉되어 있기에 직접적으로 접근이 불가능 합니다. 따라서 해당 변수들에 간접적으로 접근할 수 있는 getter,setter메서드를 이용합니다.
 * setter -> 할당 , getter - > 가져오기. 
 * */
 