package javaCodingNovember2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\Users\\mtali\\eclipse-workspace\\my-chapter\\src\\main\\resources\\config.properties";
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		
		String name = prop.getProperty("name");
		String mobile = prop.getProperty("mobile");
		System.out.println(name +" "+mobile);
	}
}
