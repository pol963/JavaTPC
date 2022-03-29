package kr.tpc;

//메서드 오버로드란 ? 메소드의 이름은 같으나 매개변수의 갯수와 자료형이 다른 동작을 하는 메소드를 여러개 정의 하는것. 
public class OverLoad {
	//동작(method)으로만 이루어진 객체
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(float a,int b) {
		System.out.println(a+b);
	}
	public void sum(float a,float b) {
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
}

/*
 *메소드 오버로드시에 메소드 이름은 다 같아보이지만 컴파일시에는 메소드의 이름이 다 변경됩니다.
 *따라서 이름이 같은 메소드라고 하여도 찾느라 시간이 오래걸려 메모리가 소모되는 경우는 없습니다.
 *같은 sum이여도 컴파일시 sum_int_int 처럼 다 다르게 컴파일 됩니다. 
 * 
 * 
 */
 