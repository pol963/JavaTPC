import java.io.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Project03_C {

	//Excel파일의 cell의 데이터 타입을 알아보기.
	public static void main(String[] args) {

		String fileName = "cellDataType.xls";
		try(FileInputStream fis = new FileInputStream(fileName)) {
			//Excel파일을 메모리에 올리기.
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			//올린 가상의 메모리 Excel파일의 sheet를 지정하여 가져오기.
			Sheet sheet = workbook.getSheetAt(0);
			
			//Excel파일의 row데이터를 열거. 해당 sheet의 row를 반환.
			Iterator<Row> rows = sheet.rowIterator();
			
			while(rows.hasNext()) { //rows에 데이터가 있다면
				//row에 rows의 row를 저장.
				HSSFRow row = (HSSFRow) rows.next();
				
				//하나의 row를 가지고 왔다면 row안의 모든 셀들을 가져오기.
				Iterator<Cell> cells = row.cellIterator();
				
				//cell의 끝까지 반복 -> cell이 있는지없는지 알아보기.
				while(cells.hasNext()) {
					
					//cell에 데이터가 있다면 cell에 저장.
					HSSFCell cell = (HSSFCell) cells.next();
					
					//cell의 데이터 타입을 알아보기.
					CellType type = cell.getCellType();
					
					//type에 들어있는 데이터 타입 비교.
					if(type == CellType.STRING) {
						System.out.println("["+cell.getRowIndex()+ ","
								+ cell.getColumnIndex() +"] = STRING; Value = " 
								+ cell.getRichStringCellValue().toString());
					}else if(type == CellType.NUMERIC) {
						System.out.println("["+cell.getRowIndex()+ ","
								+ cell.getColumnIndex() +"] = NUMERIC; Value = " 
								+ cell.getNumericCellValue());
					}else if(type == CellType.BOOLEAN) {
						System.out.println("["+cell.getRowIndex()+ ","
								+ cell.getColumnIndex() +"] = BOOLEAN; Value = " 
								+ cell.getBooleanCellValue());
					}else if(type == CellType.BLANK) {
						System.out.println("["+cell.getRowIndex()+ ","
								+ cell.getColumnIndex() +"] = BLANK CELL" );
					}
					
					
				}
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
