package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Find loactors:

	By userId = (By.xpath("//input[@name='uid']"));
	By password = (By.xpath("//input[@name='password']"));
	By submit = (By.xpath("//input[@name='btnLogin']"));

	// Action Method

	public void setUserId(String username) {

		driver.findElement(userId).sendKeys(username);
	}

	public void setPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(submit);
	}
}
