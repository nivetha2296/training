package com.cts.automation.package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day10Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//	WebDriverManager.Chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
	    List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
		for(int i=0;i<rows.size();i++) {
			String eachRowColCount="(//table//tbody//tr)["+(i+1)+"]//td";
			List<WebElement> eachRowColElement=driver.findElements(By.xpath(eachRowColCount));
			for(int j=0;j<eachRowColElement.size();j++) {
				String eachCell= "((//table//tbody//tr)["+(i+1)+"]//td)["+(j+1)+"]";
				String value= driver.findElement(By.xpath(eachCell)).getText();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
