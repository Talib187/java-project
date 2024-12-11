package actionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement srcEle = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trgEle = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, trgEle).build().perform();
		
		


			}
}
//If you don’t include .build ().perform () in your actions, the actions will not be executed. 
//The build () method generates a composite action containing all the actions in the chain12. 
//The perform () method executes the composite action34. You can also use perform () without build (), as perform () includes build () internally