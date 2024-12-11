package dropDownHadleDmeo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

 public static void main(String[] args) {
	 

	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	 
	 WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"country\"]"));
	 
	 Select sel = new Select(dropdown);
	 
	 WebElement firstEle = sel.getFirstSelectedOption();
	 
	 System.out.println(firstEle.getText());
	 
//	 sel.selectByValue("AMERICAN SAMOA");
	 
		/*
		 * // List<WebElement> li = sel.getOptions(); //
		 * System.out.println("Total number of countries: "+ li.size()); //
		 * for(WebElement option : li) { // // System.out.println(option.getText()); //
		 * }
		 */	
	
	
 }
}
