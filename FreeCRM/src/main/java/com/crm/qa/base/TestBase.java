package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	public TestBase() {
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\mammu\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\Desktop\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT_20,TimeUnit.SECONDS);
		// driver.manage().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get(prop.getProperty("url"));
		}
	
	

}
