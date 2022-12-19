package com.cts.automation.package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Actions ac= new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement dismiss=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		dismiss.click();
		WebElement search=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("iphone");
		WebElement searchIcon= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchIcon.click();
		
		List<WebElement> iphoneName=driver.findElements(By.xpath("//div[@class='_3pLy-c row']//div[@class='_4rR01T']"));
		List<WebElement> iphoneRate=driver.findElements(By.xpath("//div[@class='_3pLy-c row']//div[@class='_3tbKJL']"));

//		for(WebElement eachval:iphoneName) 
//		 
//		{
//			System.out.println("Phone name is :" +eachval.getText());
//		}
//		for(WebElement eachRate:iphoneRate) {
//			System.out.println("Phone Rate is :" + eachRate.getText());
//		}
		for(int i=0;i<iphoneName.size();i++) {
			String name=iphoneName.get(i).getText();
			String rate=iphoneRate.get(i).getText();
			System.out.println("Phone name is :" +name+"Phone Rate is :" + rate);
		}
		driver.close();
		
	}
		

}
