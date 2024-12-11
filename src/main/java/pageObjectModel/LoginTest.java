package pageObjectModel;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// This is approach without Using the pageFactory.
public class LoginTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V1/index.php");
	}

	@Test()
	public void testLogin() {

		LoginPagepageFactory lp = new LoginPagepageFactory(driver);
		lp.setUserId("mngr601962");
		lp.setPassword("sEvYmEq");
		lp.clickLogin();

		String expectedURL = "https://demo.guru99.com/V1/html/Managerhomepage.php";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL, "Page title does not match expected value.");
	}

	@AfterClass
	public void teardown() {

		driver.quit();

	}
}
