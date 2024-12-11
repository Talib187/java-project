package javaCoding;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReadTryCatch {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\mtali\\eclipse-workspace\\interview_prepration\\config.properties";

		Properties prop = new Properties();
		
		try {
			
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			
			String name = prop.getProperty("name");
			String mobile = prop.getProperty("mobile");
			
			System.out.println(name);
			System.out.println(mobile);
			
		} catch (Exception e) {
		
			System.out.println("Issue in reading config file.");
		}
	}
}
