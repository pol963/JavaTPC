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

	//Excel������ cell�� ������ Ÿ���� �˾ƺ���.
	public static void main(String[] args) {

		String fileName = "cellDataType.xls";
		try(FileInputStream fis = new FileInputStream(fileName)) {
			//Excel������ �޸𸮿� �ø���.
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			//�ø� ������ �޸� Excel������ sheet�� �����Ͽ� ��������.
			Sheet sheet = workbook.getSheetAt(0);
			
			//Excel������ row�����͸� ����. �ش� sheet�� row�� ��ȯ.
			Iterator<Row> rows = sheet.rowIterator();
			
			while(rows.hasNext()) { //rows�� �����Ͱ� �ִٸ�
				//row�� rows�� row�� ����.
				HSSFRow row = (HSSFRow) rows.next();
				
				//�ϳ��� row�� ������ �Դٸ� row���� ��� ������ ��������.
				Iterator<Cell> cells = row.cellIterator();
				
				//cell�� ������ �ݺ� -> cell�� �ִ��������� �˾ƺ���.
				while(cells.hasNext()) {
					
					//cell�� �����Ͱ� �ִٸ� cell�� ����.
					HSSFCell cell = (HSSFCell) cells.next();
					
					//cell�� ������ Ÿ���� �˾ƺ���.
					CellType type = cell.getCellType();
					
					//type�� ����ִ� ������ Ÿ�� ��.
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
