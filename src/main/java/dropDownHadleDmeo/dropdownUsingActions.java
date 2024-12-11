package dropDownHadleDmeo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownUsingActions {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        // Disable JavaScript
        chromeOptions.addArguments("--disable-javascript");
		WebDriver driver = new ChromeDriver(chromeOptions); 
		driver.get("https://www.w3schools.com/howto/howto_custom_select.asp");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div[3]/div[1]/select")));
		WebElement opt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div[3]/div[1]/select/option[7]")));


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("arguments[0].scrollIntoView();", opt);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", ele);
		js1.executeScript("arguments[0].click();", opt);
		
		// Not working.




	}
}
