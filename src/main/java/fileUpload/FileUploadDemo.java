package fileUpload;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		// Upload Single file:

		WebElement fileEle = driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]"));
	
		fileEle.sendKeys("C:\\Program Files\\Notepad++\\readme.txt");

		WebElement uploadedFileNameEle = driver.findElement(By.xpath("//ul[@id=\"fileList\"]"));

		if (uploadedFileNameEle.getText().equals("readme.txt")) {

			System.out.println("Correct file");
		} else {
			System.out.println("Incorrect Correct file");

		}

		// Upload Multiple file:

		String file1 = "C:\\Program Files\\Notepad++\\readme1.txt";
		String file2 = "C:\\Program Files\\Notepad++\\readme2.txt";

		fileEle.sendKeys(file1 + "\n" + file2);

		List<WebElement> allFileName = driver.findElements(By.xpath("//ul[@id=\"fileList\"]/li"));

		System.out.println("Total files upload: " + allFileName.size());

		// Print uploaded file name
		for (WebElement ele : allFileName) {

			System.out.println(ele.getText());
		}
	}

}
