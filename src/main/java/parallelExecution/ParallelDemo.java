package parallelExecution;

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

public class ParallelDemo {

	WebDriver driver;

	@BeforeClass // this will run before class.
	@Parameters({"browser"})
	void setUp(String br) {

		switch(br){
			
		case "chrome": driver = new ChromeDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		case "firefox": driver = new FirefoxDriver();
		break;
		default: System.out.println("Invalid Browser Value");
		return;
			
		}
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
	        String expectedTitle = "GTPL Bank Manager HomePage";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected value.");
	    }
	    
	    @Test (priority=3)
	    	public void isRealyLoggedIn() {
			
	    	String logInfo = driver.findElement(By.xpath("//h2[normalize-space()='Gtpl Bank']")).getText();
	    	Assert.assertEquals(logInfo, "Gtpl Bank", "User is not logged in");		
	    	}
	@AfterClass
	public void tearDown() {

		driver.quit();
	}
}
