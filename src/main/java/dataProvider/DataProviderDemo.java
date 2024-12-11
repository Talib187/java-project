package dataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider (name = "loginData")
	public Object[][]  getDataProvdier() {
		Object data[][] = {     
										{"mngr601962", "sEvYmEq"},
										{"mngr601962", "sEYmEq"}
																							};
		return data;
	}
	
	@Test (dataProvider="loginData")
		public void getData(String user, String password) {
		
		WebDriver driver  = new ChromeDriver();
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

// Note: 1. @DataProvider annotation ad dataprovider attribute are different.
// Trick to remeber this: 
// 1. Define Data: in 2d array.
// Connect test method with Dataprovider using dataprovider attribute.
// TestNG will auto fetch the data from arrray.
// We dont need to use any for loop.