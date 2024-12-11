package listener;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test99Bank {
	WebDriver driver;
	@BeforeClass // this will run before class.
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userId = driver.findElement(By.name("uid"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.name("btnLogin"));

		userId.sendKeys("mngr601962");
		pwd.sendKeys("sEvYmEq");
		submit.click();
	}

	@Test(priority=1)
	  public void testUrl() {
	        String expectedUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
	        String actualUrl = driver.getCurrentUrl();
	        Assert.assertEquals(actualUrl, expectedUrl, "URL does not match expected value.");
	    }

	    @Test(priority = 2)
	    public void testTitle() {
	        String expectedTitle = "GTPL Bank Manager HomePage Not correct";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected value.");
	        
	        // failing this to capture this in listener.
	    }
	    
	    @Test (priority=3, dependsOnMethods = {"testTitle"})
	    	public void isRealyLoggedIn() {
			
	    	String logInfo = driver.findElement(By.xpath("//h2[normalize-space()='Gtpl Bank']")).getText();
	    	Assert.assertEquals(logInfo, "Gtpl Bank", "User is not logged in");	
	    	
	    	// Skipping this to capture this in listener.
	    	}
	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
