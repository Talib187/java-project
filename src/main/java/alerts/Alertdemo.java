package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alertdemo {

	@Test
		public void testAlert() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement btnAlert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
		btnAlert.click();
		
		// First method:
		/*
		 * Alert alert = driver.switchTo().alert();
		 *  alert.accept();
		 */
		
		// Second technique using explicitly wait
		
	/*	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		*/
		
		// 3rd technique using Javascript executor.
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			js.executeScript("window.alert=function{};");

		} catch (Exception e) {
			System.out.println("Issue in java script executor");
		}
		driver.close();
	}
}
