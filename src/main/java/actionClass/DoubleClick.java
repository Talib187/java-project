package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	
	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		
		WebElement ele = driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).build().perform();
	}
}
