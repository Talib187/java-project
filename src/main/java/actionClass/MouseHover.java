package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement eleDeveloper = driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		WebElement eleRelease = driver.findElement(By.xpath("//a[@title='Release Notes']//span[@class='item-text'][normalize-space()='Release Notes']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(eleDeveloper).moveToElement(eleRelease).click().build().perform();

	}
}