package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class excelReader {

	public Workbook wb;
	public  Sheet sheet;
	
	public  Object loadExcel(String path, String xlSheet, int rowNum, int cellNum) throws IOException   {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = new SXSSFWorkbook();
		sheet = wb.getSheet(xlSheet);	
		Row row = sheet.getRow(rowNum);
		Cell cell  = row.getCell(cellNum);
		
		Object cellData = "";
		
		if(cell!=null) {
			switch (cell.getCellType()) {
			case STRING:
				cellData = cell.getStringCellValue();
				break;
			case NUMERIC:
				cellData = cell.getNumericCellValue();
				break;
			case BOOLEAN:
				cellData = String.valueOf(cell.getBooleanCellValue());
				break;
				default:
					cellData = ""; // Default value for unsupported data
			}
		}
		wb.close();
		fis.close();
		return cellData;
	}
	
}
