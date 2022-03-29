import kr.tpc.MemberVO;

public class TPC15 {
	
	//MemberVO클래스의 활용.
	public static void main(String[] args) {
		
		//객체생성과 동시에 초기화 까지 하기 -> 초기화란? 값을 정해주는것.
		MemberVO m1=new MemberVO("홍길순",50,"010-0000-1111","서울");
		System.out.println(m1.toString());
		
		//setter,getter메소드 이용하여 초기화 하기.
		MemberVO m2=new MemberVO();
		m2.setName("홍길이");
		m2.setAge(55);
		m2.setTel("010-1111-1111");
		m2.setAddr("부산");
		System.out.println(m2.toString());
		
	}

}
