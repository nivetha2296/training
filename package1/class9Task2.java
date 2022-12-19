package com.cts.automation.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class9Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement todaysDeal= driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", todaysDeal);
		WebElement element=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none'])[11]"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(3000);
		driver.close();
		
	}

}
