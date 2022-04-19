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

	//이미지파일을 자바에서 읽어들이고 다른 엑셀파일로 내보내기. -> 엑셀에 이미지 저장하기.
	public static void main(String[] args) {
		
		try {
			
			//자바 메모리안에 가상의 엑셀파일을 만들기.
			Workbook wb = new HSSFWorkbook();
			//가상의 엑세파일안에 sheet만들기 이름지정
			Sheet sheet = wb.createSheet("My Sample Excel");
			//이미지 파일을 읽어오기 -> 파일이기에 FileInputStream
			InputStream is = new FileInputStream("pic.jpg");
			//파일을 읽어온것을 byte배열형태로 변환하여 저장.
			byte[] bytes = IOUtils.toByteArray(is);
			//메모리에 가상으로 이미지를 생성하기. 가상으로 만들어진 이미지의 번지를 저장.
			int pictureIdx = wb.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
			is.close();
			
			
			//그림을 실질적으로 그리기 위해서는 앵커가 필요. 앵커를 사용하는대 필요한 객체는 2가지가 있습니다.
			CreationHelper helper = wb.getCreationHelper();
			//drawing 객체를 사용하여 sheet에 그림을 그리기.
			Drawing drawing = sheet.createDrawingPatriarch();
			//그림을 그리는 위치를 잡아주는 앵커 구현. -> 헬퍼사용.
			ClientAnchor anchor = helper.createClientAnchor();
			
			//anchor를 이용하여 위치 지정.
			//시작앵커
			anchor.setCol1(1);
			anchor.setRow1(2);
			//끝 앵커.
			anchor.setCol2(2);
			anchor.setRow2(3);
			
			
			//지정 위치에 그림 위치시키기.
			Picture pict= drawing.createPicture(anchor, pictureIdx);
			
			//그림을 그릴 위치만 지정하여 가상으로 만든상태에서 실질적으로 cell을 만들어 그림 위치시키기.
			//cell크기 지정하기.
			
			//cell만들기. cell은 sheet에 위치하게 합니다. 3행2열의 cell만들기.
			Cell cell = sheet.createRow(2).createCell(1);
			
			//cell의 크기 지정하기 w/h
			int w = 20*256;
			sheet.setColumnWidth(1, w);
			
			short h = 20*120;
			cell.getRow().setHeight(h);
			
			//실제로 엑셀 파일에 저장하기.
			FileOutputStream fileOut = new FileOutputStream("myFile.xls"); //스트림 연결, 파일 생성.
			wb.write(fileOut); //이미지 데이터 내보내기.
			fileOut.close();
			System.out.println("이미지 생성 성공.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}







