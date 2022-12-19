package com.cts.automation.package1;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;                                                                                                                      
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form/");
		//Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Saravanan");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mani");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("saravanan@gmail.com");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
		Thread.sleep(3000);
		
		
		WebElement addDropDown= driver.findElement(By.xpath("//img[@title=\"Ad.Plus Advertising\"]"));
		
		if(addDropDown != null)
		{
			addDropDown.click();
		}
		
		WebElement subject= driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value')]//input"));
		subject.click();
		subject.sendKeys("hello");
		WebElement hobbies1= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
		WebElement hobbies2= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
		WebElement hobbies3= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
		hobbies1.click();
		hobbies2.click();
		hobbies3.click();
		WebElement address= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Vellore");

		//String value="physics";
		//subject.sendKeys("value",Keys.ENTER);
		//subject.sendKeys("physics");
		
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", subject);
//		
		//subject
		//driver.findElement(By.id("firstName")).sendKeys("Nivetha");
		
	}

}
