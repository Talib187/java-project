package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PartialScreensShots {

	@Test(enabled = true)
	public void getFullScreenshot() throws IOException {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.pexels.com/");

		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\Screenshots\\full image.jpeg");
		FileUtils.copyFile(src, trg);
		
	}

	@Test(enabled = false)
	public void getPartialScreenshots() throws IOException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.pexels.com/search/beautiful%20girl/");
		List<WebElement> ele = driver.findElements(By.tagName("img"));

		TakesScreenshot ts = driver;
		int count = 0;
		for (WebElement e : ele) {

			File src = e.getScreenshotAs(OutputType.FILE);
			File trg = new File("D:\\Screenshots\\image.png\\" + count + ".png");
			FileUtils.copyFile(src, trg);
			count++;
		}
	}
}
