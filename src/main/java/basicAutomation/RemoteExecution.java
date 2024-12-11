package basicAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RemoteExecution {

	@Test(invocationCount = 5)

	public void remoteDemo() throws MalformedURLException {

		// URL of the Selenium Grid Hub
		String gridURL = "http://localhost:4444/"; // Replace with your Grid Hub URL


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		// Create RemoteWebDriver instance
		WebDriver driver = new RemoteWebDriver(new URL(gridURL), option);

		driver.get("https://www.google.com/");

		System.out.println("Current URL: " + driver.getCurrentUrl());

		// Close the driver
		driver.quit();
	}

}
