package com.cts.automation.package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
	    List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr)"));
		for(int i=0;i<=row.size();i++) {
			System.out.println(row.get(i));
		}
		
	}

}
