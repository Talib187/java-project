package excelRead;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWrite {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\excelRead\\createddata.xlsx";
		FileOutputStream fos = new FileOutputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("sheet1");
		
		XSSFRow row1 = sh.createRow(0);
		row1.createCell(0).setCellValue("Role");
		row1.createCell(1).setCellValue("Number");
		row1.createCell(2).setCellValue("Age");
		
		XSSFRow row2 = sh.createRow(1);
		row2.createCell(0).setCellValue("QA");
		row2.createCell(1).setCellValue("343");
		row2.createCell(2).setCellValue("28");
		
		
		wb.write(fos);
		
		wb.close();
		fos.close();

	}
}
