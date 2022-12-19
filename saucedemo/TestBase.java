package com.cts.automation.saucedemo;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	static WebDriver driver;
	
	public void testbase() throws Exception {
		FileReader reader=new FileReader("C:\\Users\\mammu\\eclipse-workspace\\SauceDemo\\config.property");  

		Properties p=new Properties();  
		p.load(reader);  

		String browserName = p.getProperty("browser");
		System.out.println(browserName);
		String burl=p.getProperty("curl");
		System.out.println(burl);
		String appurl=p.getProperty("aurl");
		System.out.println(appurl);

		System.setProperty("webdriver.chrome.driver",burl);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//if(url.equals("data:,")) {
		//driver.findElement(By.id("details-button")).click();
		//WebElement element = driver.findElement(By.linkText("Proceed to www.saucedemo.com (unsafe)"));
		//js.executeAsyncScript("arguments[0].ScrollIntoView()", element);
		//element.click();
	//	}
		driver.get(appurl);
		driver.findElement(By.id("details-button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		WebElement element= driver.findElement(By.id("proceed-link"));
		System.out.println(element.getText());
		element.click();
		//js.executeScript("window.scroll(0,1500)");
		Thread.sleep(5000);
		//driver.quit();
		//element.click();
		//String url=driver.getCurrentUrl();
		//System.out.println(url);

	}


}
