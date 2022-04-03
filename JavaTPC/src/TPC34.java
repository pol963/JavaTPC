
public class TPC34 {

	public static void main(String[] args) {
		String str = new String("APPLE"); //import java.lang.*가 생략되어 있습니다. String은 클래스입니다.
		String ls = str.toLowerCase(); //소문자변경
		System.out.println("ls : " + ls);
		System.out.println("str.charAt(3) : " + str.charAt(3)); //해당 인덱스 문자가져오기.
		System.out.println("str.length() : " + str.length());
		
	}

}
