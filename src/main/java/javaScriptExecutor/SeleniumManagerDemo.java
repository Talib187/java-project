package javaScriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManagerDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // No need for System.setProperty
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}