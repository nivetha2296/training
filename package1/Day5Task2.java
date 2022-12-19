package com.cts.automation.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement userName=driver.findElement(By.xpath("//div[@class='inputfield ibvt loginData']//input[@type='text']"));
		userName.sendKeys("Nivi");
		//driver.findElement(By.xpath("//a[@class=\"btn btn-primary login-btn\"]")).click();
		
	}

}
