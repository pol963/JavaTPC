import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import kr.Inflearn.ExcelVO;

public class Project03_A {

	//예제1. 엑셀의데이터를 자바로 처리해보기. 
	//엑셀파일의 데이터를 arraylist에 담아 보기.
	public static void main(String[] args) {
		
		String fileName ="bookList.xls";
		
		//data = List형태의 변수객체.
		List<ExcelVO> data = new ArrayList<ExcelVO>();
		
		//파일을 읽어서 핸들링하기위해 예외처리 하기.
		//fileName과 연결 -> 스트림.
		try(FileInputStream fis = new FileInputStream(fileName)) {
			//fis를 이용해서 메모리에 로딩을 시키기. 
			// fis에 연결되어있는(bookList)파일을 HSSFWirkbook생성자메소드가 읽어서 메모리에 로딩.
			new HSSFWorkbook(fis); //해당 데이터가 메모리에 로딩된것을 WorkBook라고 합니다.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
