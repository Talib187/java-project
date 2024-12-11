package basicAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void verifiyLinks(String linkurl) throws IOException, InterruptedException {

		try {

			URL url = new URL(linkurl);

			HttpURLConnection htconn = (HttpURLConnection) url.openConnection();

			htconn.setConnectTimeout(5000);
			htconn.connect();

			int rescode = htconn.getResponseCode();

			if (rescode >= 400) {
				System.out.println(url + " is broken");
			} else {

				System.out.println(url + " is valid");
			}

		} catch (Exception e) {

			System.out.println("issue in getverifylink " + e);
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/broken");

		List<WebElement> li = driver.findElements(By.tagName("a"));

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {

			// WebElement ele = li.get(i);
			String url = li.get(i).getAttribute("href");

			verifiyLinks(url);

		}

		driver.quit();
	}
}
