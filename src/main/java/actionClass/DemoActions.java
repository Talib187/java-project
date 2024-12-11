package actionClass;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoActions {

	@Test(enabled = false)
	public void setUpdData() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		WebElement ele = driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));

		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

	@Test(enabled = false)
	public void demoDragDrop() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		WebElement srcEle = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trgEle = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, trgEle).build().perform();

		// So builld() method is not necessary here if we are performing single action
		// here.
		// If we are combining multiple action like
		// act.clickAndHold().moveToElement(trgEle) then build will be necessary,

	}

	@Test(enabled = false)
	public void demoKeyboardAction() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");

		WebElement ele = driver.findElement(By.name("q"));

		Actions act = new Actions(driver);
		act.sendKeys("Mohammad").perform(); // Send Keys
		// act.sendKeys(Keys.ENTER).perform(); // Press Enter

		act.sendKeys(Keys.BACK_SPACE).perform(); // Press backspace.

	}

	@Test(enabled = true)
	public void mouseHover() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement eleDeveloper = driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		WebElement eleRelease = driver.findElement(By.xpath("//a[@title='Release Notes']//span[@class='item-text'][normalize-space()='Release Notes']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(eleDeveloper).moveToElement(eleRelease).click().build().perform();

	}
}
