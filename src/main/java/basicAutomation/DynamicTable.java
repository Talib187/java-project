package basicAutomation;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicTable {

	@Test
	public void getTableData() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-table");

		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("Number of total rows: " + rows.size());

		for (int r = 1; r <= rows.size(); r++) {

			WebElement rowEle = driver.findElement(By.xpath("//tbody/tr[" + r + "]/td[1]"));
			// System.out.println(rowEle.getText());

			if (rowEle.getText().equalsIgnoreCase("Chrome")) {

				List<WebElement> eleChrome = driver.findElements(By.xpath("//tbody/tr[" + r + "]/td"));

				for (WebElement ele : eleChrome) {
					System.out.print(ele.getText() + " ");

				}

			}
		}

		driver.close();
	}
}
