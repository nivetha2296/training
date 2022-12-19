package com.cts.automation.package1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Task3 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_P);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_E);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_P);
		robo.keyRelease(KeyEvent.VK_H);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_E);
		robo.keyPress(KeyEvent.VK_CONTROL);	
		robo.keyPress(KeyEvent.VK_A);	
		robo.keyPress(KeyEvent.VK_CONTROL);		
		robo.keyPress(KeyEvent.VK_C);		
		robo.keyPress(KeyEvent.VK_CONTROL);		
		robo.keyPress(KeyEvent.VK_V);		
		robo.keyPress(KeyEvent.VK_CONTROL);		
		robo.keyPress(KeyEvent.VK_V);		
		robo.keyPress(KeyEvent.VK_CONTROL);		
		robo.keyPress(KeyEvent.VK_V);	
		robo.keyRelease(KeyEvent.VK_CONTROL);	
		robo.keyRelease(KeyEvent.VK_A);	
		robo.keyRelease(KeyEvent.VK_CONTROL);		
		robo.keyRelease(KeyEvent.VK_C);		
		robo.keyRelease(KeyEvent.VK_CONTROL);		
		robo.keyRelease(KeyEvent.VK_V);		
		robo.keyRelease(KeyEvent.VK_CONTROL);		
		robo.keyRelease(KeyEvent.VK_V);		
		robo.keyRelease(KeyEvent.VK_CONTROL);		
		robo.keyRelease(KeyEvent.VK_V);			
	}

}
