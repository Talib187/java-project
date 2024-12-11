package fileUpload;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobotClass {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		// Upload Single file:

		String path = "C:\\Program Files\\Notepad++\\readme.txt";     // forward slas / or backward slash works same.
		
		// Now I will copy the file path in the clipboard.
		StringSelection st = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		
	WebElement ele = driver.findElement(By.xpath("//input[@id='filesToUpload']"));

		ele.click(); // this code is correct however it is not working due to elemetn not working.
		
		// Now will paste the copy path in the upload dialog box using Robot Class.
		Robot robot = new Robot();
		
		// Press the control+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release the control+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		// Now will Press and Release Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("end");
	}

}
