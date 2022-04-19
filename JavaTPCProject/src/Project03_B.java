import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;

public class Project03_B {

	//�̹��������� �ڹٿ��� �о���̰� �ٸ� �������Ϸ� ��������. -> ������ �̹��� �����ϱ�.
	public static void main(String[] args) {
		
		try {
			
			//�ڹ� �޸𸮾ȿ� ������ ���������� �����.
			Workbook wb = new HSSFWorkbook();
			//������ �������Ͼȿ� sheet����� �̸�����
			Sheet sheet = wb.createSheet("My Sample Excel");
			//�̹��� ������ �о���� -> �����̱⿡ FileInputStream
			InputStream is = new FileInputStream("pic.jpg");
			//������ �о�°��� byte�迭���·� ��ȯ�Ͽ� ����.
			byte[] bytes = IOUtils.toByteArray(is);
			//�޸𸮿� �������� �̹����� �����ϱ�. �������� ������� �̹����� ������ ����.
			int pictureIdx = wb.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
			is.close();
			
			
			//�׸��� ���������� �׸��� ���ؼ��� ��Ŀ�� �ʿ�. ��Ŀ�� ����ϴ´� �ʿ��� ��ü�� 2������ �ֽ��ϴ�.
			CreationHelper helper = wb.getCreationHelper();
			//drawing ��ü�� ����Ͽ� sheet�� �׸��� �׸���.
			Drawing drawing = sheet.createDrawingPatriarch();
			//�׸��� �׸��� ��ġ�� ����ִ� ��Ŀ ����. -> ���ۻ��.
			ClientAnchor anchor = helper.createClientAnchor();
			
			//anchor�� �̿��Ͽ� ��ġ ����.
			//���۾�Ŀ
			anchor.setCol1(1);
			anchor.setRow1(2);
			//�� ��Ŀ.
			anchor.setCol2(2);
			anchor.setRow2(3);
			
			
			//���� ��ġ�� �׸� ��ġ��Ű��.
			Picture pict= drawing.createPicture(anchor, pictureIdx);
			
			//�׸��� �׸� ��ġ�� �����Ͽ� �������� ������¿��� ���������� cell�� ����� �׸� ��ġ��Ű��.
			//cellũ�� �����ϱ�.
			
			//cell�����. cell�� sheet�� ��ġ�ϰ� �մϴ�. 3��2���� cell�����.
			Cell cell = sheet.createRow(2).createCell(1);
			
			//cell�� ũ�� �����ϱ� w/h
			int w = 20*256;
			sheet.setColumnWidth(1, w);
			
			short h = 20*120;
			cell.getRow().setHeight(h);
			
			//������ ���� ���Ͽ� �����ϱ�.
			FileOutputStream fileOut = new FileOutputStream("myFile.xls"); //��Ʈ�� ����, ���� ����.
			wb.write(fileOut); //�̹��� ������ ��������.
			fileOut.close();
			System.out.println("�̹��� ���� ����.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}







