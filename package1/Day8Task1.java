package com.cts.automation.package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement todaysScrollBar= driver.findElement(By.xpath("(//span[@class='feed-scrollbar-thumb'])[1]"));
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",todaysScrollBar);
		Actions acc= new Actions(driver);
		acc.moveToElement(todaysScrollBar).build().perform();
		jse.executeScript("window.scrollTo(0,document.body.scrollLeft);" );
		for(WebElement eachLink: links) {
			System.out.println(eachLink.getText());
		}
		driver.close();
		
		
	}

}
