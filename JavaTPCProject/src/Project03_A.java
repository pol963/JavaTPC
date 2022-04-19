import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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
			HSSFWorkbook workbook = new HSSFWorkbook(fis); //해당 데이터가 메모리에 로딩된것을 WorkBook라고 합니다.
			
			//workbook는 bookList엑셀파일을 가상에서 만들고 있는 객체.
			
			//가상의엑셀을 메모리에 가지고 있는 workbook객체의 0번째 sheet를 sheet에 저장.
			HSSFSheet sheet = workbook.getSheetAt(0);
			//sheet의 모든 데이터를 가져오기 위해 row전부를 가져와야 합니다. -> 열거형.
			Iterator<Row> rows = sheet.rowIterator();
			//rows의 데이터에 첫번째 row는 title...등 실질적인 데이터가 아니기에 next메서드로 로우 하나를 건너뜀.
			rows.next();
			
			//반복문을 사용하여 rows.hasNext메서드를 이용해서 row가 있다면 next()리턴으로 row에 저장.
			while(rows.hasNext()) {
				HSSFRow row = (HSSFRow) rows.next(); 
				
				//cell또한 가져와야 핸들링 할 수있습니다. 반복자를 통해 cell들을 가져와서 cells에 담기.
				Iterator<Cell> cells = row.cellIterator();
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}












