package com.cts.automation.package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7Task1 {
	static Select select;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		//to handle proxy site
		driver.findElement(By.id("details-button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		WebElement element= driver.findElement(By.id("proceed-link"));
		System.out.println(element.getText());
		element.click();
		WebElement colourDdn= driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		colourDdn.click();
		select= new Select(colourDdn);
		select.selectByVisibleText("Yellow");
		colourDdn.click();
		WebElement multiDdn= driver.findElement(By.xpath("//select[@id='cars']"));
		select= new Select(multiDdn);
		select.selectByIndex(0);
		select.selectByIndex(2);
		select.selectByIndex(3);
		driver.close();

	
	}

}
