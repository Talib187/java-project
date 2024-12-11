package javaCoding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\mtali\\eclipse-workspace\\interview_prepration\\config.properties";
		String key;
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);

		String value1 = prop.getProperty("name");
		String value2 = prop.getProperty("mobile");

		System.out.println(value1);
		System.out.println(value2);
	}
}
