package com.cts.automation.package1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Task1 {

public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		WebElement promptKey= driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptKey.click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("Nivetha");
		a.accept();
		TakesScreenshot shot=(TakesScreenshot)driver;
		File srcFile=shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\mammu\\eclipse-workspace\\Selenium Sessions\\ScreenShots\\shots1.jpeg"));
		String t1= driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println(t1);
	}

}
