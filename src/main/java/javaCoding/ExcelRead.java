package javaCoding;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {

		try {

			String path = "C:\\Users\\mtali\\eclipse-workspace\\my-chapter\\src\\main\\resources\\ExcelFiles\\New Microsoft Excel Worksheet.xlsx";
			FileInputStream fis = new FileInputStream(path);

	//		XssfWorkbook wb = WorkbookFactory.create(fis);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			Sheet sh = wb.getSheetAt(0);

			for (Row row : sh) {

				for (Cell cell : row) {

					System.out.print(cell.toString() + "\t");
				}
			}
		} catch (Exception e) {
			System.out.println("Issue in ExcelRead");
		}

	}
}
