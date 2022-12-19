package com.cts.automation.package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr"));
		for(int i=0;i<rows.size();i=i+2) 
		{
			String eachRowColCount="(//table[@class='ws-table-all']//tbody//tr)["+(i+1)+"]//td";
			List<WebElement> eachRowColElement=driver.findElements(By.xpath(eachRowColCount));
			for(int j=0;j<eachRowColElement.size();j=j+2) 
			{
				String eachCell= "((//table[@class='ws-table-all']//tbody//tr)["+(i+1)+"]//td)["+(j+1)+"]";
				String value= driver.findElement(By.xpath(eachCell)).getText();
				System.out.print(value +   "             ");
			}
			System.out.println();
		}
	}

	}


