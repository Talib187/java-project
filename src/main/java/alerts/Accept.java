package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Accept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// switch to the frame containing the elements
		driver.switchTo().frame("iframeResult");

		// find and click the "Try it" button
		WebElement confirmButton = driver.findElement(By.cssSelector("html>body>button"));
		confirmButton.click();

		// switch to the alert and dismiss it
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
}
