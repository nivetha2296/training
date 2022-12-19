package com.cts.automation.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone");
		WebElement searchBtn= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBtn.click();
		WebElement midNight= driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']"));
		midNight.click();
		Set<String> allTabs=driver.getWindowHandles();
		List<String> tabList= new ArrayList<String>(allTabs);
		driver.switchTo().window(tabList.get(1));
		WebElement midNight1= driver.findElement(By.xpath("//span[text()='        Apple iPhone 13 (128GB) - Midnight       ']"));

		System.out.println(midNight1.getText());
		WebElement midNightRate= driver.findElement(By.xpath("(//span[contains(text(),'64,999')])[7]"));
		String rate1=midNightRate.getText();
		System.out.println(rate1);
		driver.switchTo().window(tabList.get(0));
		WebElement green= driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Green']"));
		green.click();
		allTabs.clear();
		tabList.clear();
		Set<String> allTabs1=driver.getWindowHandles();
		tabList.addAll(allTabs1);
		driver.switchTo().window(tabList.get(2));
		WebElement green1= driver.findElement(By.xpath("//span[text()='        Apple iPhone 12 (128GB) - Green       ']"));

		System.out.println(green1.getText());
		WebElement greenRate= driver.findElement(By.xpath("(//span[contains(text(),'60,990')])[7]"));
		String rate2=greenRate.getText();
		System.out.println(rate2);
		

		

		

		

		

		

	}

}
