package dropDownHadleDmeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownJavaScritpExecutor {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_custom_select.asp");

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/select"));
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
        js.executeScript("document.getElementById('cars').value = 'Volvo';");
	}
}
