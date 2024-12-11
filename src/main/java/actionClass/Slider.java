package actionClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/demo-site/sliders/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		WebElement slider1 = driver.findElement(By.cssSelector(
				"div[id='red'] div[class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']"));
		// WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions act = new Actions(driver);

//		act.clickAndHold(slider1).build().perform();
//		act.moveByOffset(-100, 0).build().perform();
//		act.release().build().perform();

		// act.clickAndHold().moveByOffset(-100, 0).release().build().perform();

		act.dragAndDropBy(slider1, -100, 0).build().perform();

	}
}

/*
 * //If you take -100 instead of 100, the slider element will slide by 100
 * pixels to the left instead of the right. The offset values represent the
 * horizontal and vertical distance from the current position of the element.
 * Positive values move the element right or down, while negative values move
 * the element left or up.
 */
