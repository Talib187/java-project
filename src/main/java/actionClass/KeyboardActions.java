package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("https://www.google.com/");

		// Element which needs to receive keyboard input.
		WebElement searchBox = driver.findElement(By.name("q"));

		// Using Action class for keyboard actions.
		Actions act = new Actions(driver);

		// Typed "Hello" in the search box.
		act.sendKeys(searchBox, "Hello").perform();

		// Pressed the Enter key to submit the search query.
		act.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
		// Pressed the Backspace key to delete the last character of the query.
		act.sendKeys(Keys.BACK_SPACE).perform();

		// Pressed the Ctrl+A keys to select all the text in the search box.
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

		// Pressed the Ctrl+C keys to copy the selected text to the clipboard.
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		// Pressed the Ctrl+V keys to paste the copied text from the clipboard.
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		// Pressed the F5 key to refresh the current page.
		act.sendKeys(Keys.F5).perform();
		
		

	}
}
