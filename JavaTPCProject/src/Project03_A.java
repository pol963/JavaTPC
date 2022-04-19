import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import kr.Inflearn.ExcelVO;

public class Project03_A {

	//����1. �����ǵ����͸� �ڹٷ� ó���غ���. 
	//���������� �����͸� arraylist�� ��� ����.
	public static void main(String[] args) {
		
		String fileName ="bookList.xls";
		
		//data = List������ ������ü.
		List<ExcelVO> data = new ArrayList<ExcelVO>();
		
		//������ �о �ڵ鸵�ϱ����� ����ó�� �ϱ�.
		//fileName�� ���� -> ��Ʈ��.
		try(FileInputStream fis = new FileInputStream(fileName)) {
			//fis�� �̿��ؼ� �޸𸮿� �ε��� ��Ű��. 
			// fis�� ����Ǿ��ִ�(bookList)������ HSSFWirkbook�����ڸ޼ҵ尡 �о �޸𸮿� �ε�.
			HSSFWorkbook workbook = new HSSFWorkbook(fis); //�ش� �����Ͱ� �޸𸮿� �ε��Ȱ��� WorkBook��� �մϴ�.
			
			//workbook�� bookList���������� ���󿡼� ����� �ִ� ��ü.
			
			//�����ǿ����� �޸𸮿� ������ �ִ� workbook��ü�� 0��° sheet�� sheet�� ����.
			HSSFSheet sheet = workbook.getSheetAt(0);
			//sheet�� ��� �����͸� �������� ���� row���θ� �����;� �մϴ�. -> ������.
			Iterator<Row> rows = sheet.rowIterator();
			//rows�� �����Ϳ� ù��° row�� title...�� �������� �����Ͱ� �ƴϱ⿡ next�޼���� �ο� �ϳ��� �ǳʶ�.
			rows.next();
			
			//�ݺ����� ����Ͽ� rows.hasNext�޼��带 �̿��ؼ� row�� �ִٸ� next()�������� row�� ����.
			while(rows.hasNext()) {
				HSSFRow row = (HSSFRow) rows.next(); 
				
				//cell���� �����;� �ڵ鸵 �� ���ֽ��ϴ�. �ݺ��ڸ� ���� cell���� �����ͼ� cells�� ���.
				Iterator<Cell> cells = row.cellIterator();
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}












