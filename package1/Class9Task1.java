package com.cts.automation.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		//single Iframe
		WebElement singleIframeBtn= driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		singleIframeBtn.click();
		WebElement iframe1= driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Nivetha");
		driver.switchTo().defaultContent();
		
		//Multiple Iframe
		WebElement multipleIframeBtn= driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multipleIframeBtn.click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		//WebElement iframe2= driver.findElement(By.xpath("(//iframe)[3]"));
		driver.switchTo().frame(0);
		size= driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nivetha");
//		
//		driver.close();

		
		
	}

}
