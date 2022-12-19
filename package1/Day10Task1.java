package com.cts.automation.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/popup.php");
		WebElement clickBtn=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickBtn.click();
		Set<String> allTabs=driver.getWindowHandles();
		List<String> tabList= new ArrayList<String>(allTabs);
		driver.switchTo().window(tabList.get(1));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Nivi123@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.switchTo().window(tabList.get(0));
		System.out.println(clickBtn.getText());
		WebElement guru99Btn=driver.findElement(By.xpath("//h2[text()='Guru99 Bank']"));
		System.out.println(guru99Btn.getText());	
	}

}
