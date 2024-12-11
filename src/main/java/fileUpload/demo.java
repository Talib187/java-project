package fileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 * 
		 * WebElement ele =
		 * driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		 * 
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click()", ele);
		 */
		
		
		
	    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement fileInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("filesToUpload")));
	    fileInput.click();

	}
}
