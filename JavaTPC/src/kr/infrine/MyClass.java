package kr.infrine;

//MyClass의 접근제어자 public가 존재하지 않는다면 default접근제어가 붙는다
//default접근제어자의 의미는 같은 패키지내에서는 접근이 가능하나 패키지 외부에서는 접근이 불가능.
public class MyClass {

	//인자로 정수 2개를 받고 각 숫자까지의 합을 구하는 메서드 구현하기.
	public int sum(int a,int b) {
		int total = 0;
			for(int i = a; i<=b ; i++) {
				total += i;
			}
		return total;
	}
}
