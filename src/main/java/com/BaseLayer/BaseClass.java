package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass() {
		 prop= new Properties();
		 try {
			FileInputStream fis= new FileInputStream
					("C:\\Users\\Admin\\Desktop\\java\\Cucumber\\src\\main\\java\\ConfigPackage\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	
	public static void initilization() {
		String BrowserName= prop.getProperty("BrowserName");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Desktop\\java\\Cucumber\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Admin\\Desktop\\java\\Cucumber\\Drivers\\msedgedriver.exe");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadTime"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("URL"));
}
}