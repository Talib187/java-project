package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPagepageFactory {

	WebDriver driver;
	
	public LoginPagepageFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "uid")
	WebElement txtUserId;
	
	@FindBy (name = "password")
	WebElement txtPwd;
	
	@FindBy (name = "btnLogin")
	WebElement loginBtn;
	
	@FindBy (tagName ="a")
	List<WebElement> links;	
	

	// Action Method

	public void setUserId(String userid) {

		txtUserId.sendKeys(userid);
	}

	public void setPassword(String pwd) {

		txtPwd.sendKeys(pwd);
	}

	public void clickLogin() {
		
		loginBtn.click();
	}
}
