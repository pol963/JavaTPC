import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import kr.Inflearn.ExcelVO;

public class Project03_A {

	//Excel파일의 데이터를 자바에서 Reading해보기.
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
			
			//셀의 데이터를 가져왔다면 arrayList에 넣기위해 -> vo구조로 셀의 데이터를 모아서 arrayList에 넣기위해
			//임시 배열의 형태로 셀의 데이터를 받아주기.
			String[] imsi = new String[5];
			//반복문을 사용하여 rows.hasNext메서드를 이용해서 row가 있다면 next()리턴으로 row에 저장.
			while(rows.hasNext()) {//엑셀의 row를 읽어들이기 위한 반복문.
				HSSFRow row = (HSSFRow) rows.next(); 
				
				//cell또한 가져와야 핸들링 할 수있습니다. 반복자를 통해 cell들을 가져와서 cells에 담기.
				Iterator<Cell> cells = row.cellIterator();
				
				int i = 0; //imsi에 데이터를 하나씩넣어주기 위한 변수. 반복문.
				while(cells.hasNext()) {
					HSSFCell cell = (HSSFCell) cells.next();
					imsi[i] = cell.toString(); //cell로 하나씩 가져온 cell데이터를 배열에 넣어주기.
					i++;
				}
				
				//묶기->vo 담기->list
				//임시배열의 cell값을(5개의 데이터 반복문의 의해 범위 지정) ExcelVO로 묶어주기.
				ExcelVO vo = new ExcelVO(imsi[0],imsi[1],imsi[2],imsi[3],imsi[4]);
				data.add(vo);
				
			}
			
			showExcelData(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showExcelData(List<ExcelVO> data) {
		for(ExcelVO vo : data ) {
			System.out.println(vo);
		}
	}

}












