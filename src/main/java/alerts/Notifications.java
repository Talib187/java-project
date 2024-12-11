package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Notifications {

	@Test
	
	public void disableNotification() {
		
		WebDriver driver  = new EdgeDriver();
		EdgeOptions edge = new EdgeOptions();
		edge.addArguments("--disable-notifications");
		
		driver.get("https://www.justdial.com/");
	}
}
