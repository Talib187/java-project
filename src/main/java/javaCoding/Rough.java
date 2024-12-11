package javaCoding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rough {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\mtali\\eclipse-workspace\\my-chapter\\src\\main\\resources\\ExcelFiles\\New Microsoft Excel Worksheet.xlsx";
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				Sheet sh = wb.getSheetAt(0);
				
				for(Row row:sh) {
					
					for(Cell cell : row) {
						if(cell.getCellType()==CellType.BLANK) {
							
							System.out.println("Blank");
						}
						else {
							System.out.print(cell.toString()+" ");
						}
						
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
