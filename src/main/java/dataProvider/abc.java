package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abc {

	public static void main(String[] args) throws InterruptedException {	
		

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://demo.guru99.com/V1/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement userId = driver.findElement(By.name("uid"));
	WebElement pwd = driver.findElement(By.name("password"));
	WebElement submit = driver.findElement(By.name("btnLogin"));

	userId.sendKeys("mngr601962");
	pwd.sendKeys("sEvYmEq");
	submit.click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlToBe("https://demo.guru99.com/V1/html/Managerhomepage.php"));
	String title = driver.getTitle();
	System.out.println(title);	
}
}
