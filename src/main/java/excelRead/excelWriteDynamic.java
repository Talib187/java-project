package excelRead;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWriteDynamic {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\excelRead\\dynamic-data.xlsx";
		FileOutputStream fos = new FileOutputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("Dynamic-data");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of desired rows:");
		int numRow = sc.nextInt();
		System.err.println("Enter number of desired cell:");
		int numCell = sc.nextInt();
		
		for(int r=0; r<=numRow; r++) {
			
			XSSFRow currentRow = sh.createRow(r);
			
			for(int c=0; c<numCell; c++) {
				
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
			
		}
		
		wb.write(fos);
		fos.close();
		sc.close();
		
	}
}
