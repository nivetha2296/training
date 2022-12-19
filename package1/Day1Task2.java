package com.cts.automation.package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/login/identify");
		driver.findElement(By.name("email")).sendKeys("nivi123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.id("identify_email")).sendKeys("nivi123@gmail.com");
		driver.close();
	}

}
