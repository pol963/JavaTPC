package kr.infrine;

	//배열처럼 동작하는 클래스(API)만들기.
	//1.배열생성 2.배열인덱스에 값 넣기 3.배열 값 가져오기 4.배열 크키 알아보기. 를 구현하기.
public class ObjectArray {
	
	private int count=0; //데이터 체크.
	private Object[] arr; //배열형 변수.
	
	
	//배열생성 기본 생성자 -> 호출시에 인자값을 넘겨주지 않았을때를 대비.
	public ObjectArray() {
		this(10); //this는 자기자신을 호출 인자값을 받기때문에 다른 생성자메소드 호출.
	}
	
	//배열생성 객체생성시 인자를 넘겨받았을 때.
	public ObjectArray(int init) {
		arr = new Object[init]; //private int[] arr = new int[init] 의 형식. 
	}
	
	//배열인덱스에 값 넣기.
	public void add(Object data) {
		arr[count++] = data;
	}
	
	//배열 값 가져오기.
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		
		return count;
		//return arr.length;
		
	}
	
	

}
