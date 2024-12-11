package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDemo {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup(); We dont need now this webdriver
		// manager as New Selenim after 4.6 will do it itself
		// ChromeDriver driver = new ChromeDriver();
	
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize(); // We add parenthese because these are the method being called from the
												// internal class. variable can be called without parenthese.


		//JavascriptExecutor js1 = driver;  // if instead of WebDriver we are declaring ChromeDriver then typecasting is not required.

		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		// Sendkey using javascript
		WebElement ele = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		js.executeScript("arguments[0].setAttribute('value', 'Mohammad Talib')", ele);
		
		// Element click using JavaScript
		WebElement clickEle = driver.findElement(By.xpath("//input[@id=\"female\"]"));
		js.executeScript("arguments[0].click()", clickEle);
		
		// Scroll to a Specific Element:
		WebElement scrollEle = driver.findElement(By.xpath("//label[normalize-space()='Sorted List:']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollEle);
		
		// Scroll to the Bottom of the Page:
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		// Explanation: window.scrollTo(x, y), 
		// This method scrolls the browser window to the specified x (horizontal) and y (vertical) coordinates.
		//x = 0: No horizontal scrolling.
		//y = document.body.scrollHeight: Scrolls to the maximum vertical position, i.e., the bottom of the page.
		// y=0, it will go to top of the page.
		
		// Scroll to the Top of the Page
		js.executeScript("window.scrollTo(0, 0); ");
		
		// Zooming the page.
		js.executeScript("document.body.style.zoom='50%'; ");
	}
}
