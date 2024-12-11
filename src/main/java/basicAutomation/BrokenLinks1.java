package basicAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrokenLinks1 {

	@Test

	public void links() throws IOException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.browserstack.com/");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		int linksNumber = list.size();
		System.out.println("Total number of URL found: " + linksNumber);

		for (WebElement li : list) {

			String url = li.getAttribute("href");

			if (url == null || url.isEmpty()) {

				System.out.println("URL is null or blank");
			}

			else {
				checkBrokenLinks(url);
			}
		}
	}

	public void checkBrokenLinks(String url) throws IOException {

		URL u = new URL(url);
		HttpURLConnection httpUrl = (HttpURLConnection) u.openConnection();
		httpUrl.setConnectTimeout(5000);
		httpUrl.connect();

		// To remeber this: Think of it as "URL → Open Connection → Set Timeout →
		// Connect".

		int resCode = httpUrl.getResponseCode();
		if (resCode == 200) {

			System.out.print(httpUrl.getResponseMessage() + "  ");
		}

		else {
			System.out.println(url + " is broken due to response message: " + httpUrl.getResponseMessage());
		}
	}
}
