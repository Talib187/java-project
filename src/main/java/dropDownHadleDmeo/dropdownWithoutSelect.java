package dropDownHadleDmeo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownWithoutSelect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_custom_select.asp");

		// • Using click() and sendKeys() methods:

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/select"));
		dropdown.click();
		dropdown.sendKeys("Citroen" + Keys.ENTER);

		// Using findElements() and for loop:

		List<WebElement> dropdowns = driver.findElements(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/select/option"));

		for (WebElement opt : dropdowns) {

			if (opt.getText().equals("BMW")) {

				opt.click();
			}

		}

		// Using custom locators:

		WebElement dropVolvo = driver
				.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/select/option[@value=\"3\"]"));

		dropVolvo.click();
	}

}
