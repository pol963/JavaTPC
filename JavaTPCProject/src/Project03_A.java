import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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
			new HSSFWorkbook(fis); //�ش� �����Ͱ� �޸𸮿� �ε��Ȱ��� WorkBook��� �մϴ�.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
