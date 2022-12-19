package com.cts.automation.package1;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		// To handle proxysite
		driver.findElement(By.id("details-button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		WebElement element= driver.findElement(By.id("proceed-link"));
		System.out.println(element.getText());
		element.click();
		WebElement selectDdn1=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		WebElement selectDdn2=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
		WebElement selectDdn3=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
		Actions acc= new Actions(driver);
		acc.moveToElement(selectDdn1).click().build().perform();
		acc.sendKeys("A roo").perform();
		acc.sendKeys(Keys.DOWN).perform();
		acc.sendKeys(Keys.ENTER).perform();
		acc.moveToElement(selectDdn2).click().build().perform();
		acc.sendKeys("M").perform();
		acc.sendKeys(Keys.DOWN).perform();
		acc.sendKeys(Keys.DOWN).perform();
		acc.sendKeys(Keys.ENTER).perform();
		js.executeScript("window.scrollBy(0,500)");
		acc.moveToElement(selectDdn3).click().build().perform();
		acc.sendKeys("G").perform();
		acc.sendKeys(Keys.ENTER).perform();
		acc.sendKeys("B").perform();
		acc.sendKeys(Keys.DOWN).perform();
		acc.sendKeys(Keys.ENTER).perform();
		acc.sendKeys("R").perform();
		acc.sendKeys(Keys.ENTER).perform();
		Thread.sleep(6000);
		driver.close();
		System.out.println("*****************Task Completed ***************");
	}

}
