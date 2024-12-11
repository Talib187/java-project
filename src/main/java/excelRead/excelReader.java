package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {

	public void getRead() throws IOException {

		 String path = System.getProperty("user.dir")+"\\src\\main\\java\\excelRead\\Test-data.xlsx";

		//String path = "C:\\Users\\mtali\\eclipse-workspace\\my-chapter\\src\\main\\java\\excelRead\\file_example_XLS_100.xlsx.xls";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("sheet1");

		int totalRows = sh.getLastRowNum();
		int totalCells = sh.getRow(1).getLastCellNum();

		System.out.println("Total row is:" + totalRows); // Rows are counting from 0
		System.out.println("Total cell is:" + totalCells);  // Cells are counting from 1.
		
		for(int r=0; r<=totalRows; r++) {  // For Rows
			
				XSSFRow currentRow =  sh.getRow(r);
			
			for(int c=0; c<totalCells; c++) {   // For cells
				
			XSSFCell cell = 	currentRow.getCell(c);
			
			System.out.print(cell.toString()+"                             ");
				
			}
			
			System.out.println();
		}

		wb.close();
		fis.close();
	}

	public static void main(String[] args) throws IOException {
		excelReader ex = new excelReader();
		ex.getRead();
	}
}
