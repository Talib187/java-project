package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {

	

	
	@Test
	public void getLogin(String user, String password) {

		String path = System.getProperty("user.dir")+"\\src\\main\\java\\dataProvider\\LoginData.xlsx"; 

		System.out.println(path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userId = driver.findElement(By.name("uid"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.name("btnLogin"));

		userId.sendKeys(user);
		pwd.sendKeys(password);
		submit.click();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.equalsIgnoreCase("GTPL Bank Manager HomePage"));

	}

}
