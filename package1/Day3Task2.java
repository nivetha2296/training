package com.cts.automation.package1;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form/");
		String practice= driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']")).getText();
		System.out.println(practice);
		String studentDetail= driver.findElement(By.xpath("//h5[text()='Student Registration Form']")).getText();
		System.out.println(studentDetail);
		String name= driver.findElement(By.xpath("(//label[@class='form-label'])[1]")).getText();
		System.out.println(name);
		String email= driver.findElement(By.xpath("(//label[@class='form-label'])[2]")).getText();
		System.out.println(email);
		String mobile= driver.findElement(By.xpath("(//label[@class='form-label'])[3]")).getText();
		System.out.println(mobile);
		String dateOfBirth= driver.findElement(By.xpath("(//label[@class='form-label'])[4]")).getText();
		System.out.println(dateOfBirth);
		String subject= driver.findElement(By.xpath("(//label[@class='form-label'])[5]")).getText();
		System.out.println(subject);
		String hobbies= driver.findElement(By.xpath("(//label[@class='form-label'])[6]")).getText();
		System.out.println(hobbies);
		String picture= driver.findElement(By.xpath("(//label[@class='form-label'])[7]")).getText();
		System.out.println(picture);
		String currentAddress= driver.findElement(By.xpath("(//label[@class='form-label'])[8]")).getText();
		System.out.println(currentAddress);
		String stateAndCity= driver.findElement(By.xpath("(//label[@class='form-label'])[9]")).getText();
		System.out.println(stateAndCity);
		String elements= driver.findElement(By.xpath("(//div[@class='header-text'])[1]")).getText();
		System.out.println(elements);
		String forms= driver.findElement(By.xpath("(//div[@class='header-text'])[2]")).getText();
		System.out.println(forms);
		String alerts= driver.findElement(By.xpath("(//div[@class='header-text'])[3]")).getText();
		System.out.println(alerts);
		String widgets= driver.findElement(By.xpath("(//div[@class='header-text'])[4]")).getText();
		System.out.println(widgets);
		String interaction= driver.findElement(By.xpath("(//div[@class='header-text'])[5]")).getText();
		System.out.println(interaction);
		String bookStore= driver.findElement(By.xpath("(//div[@class='header-text'])[6]")).getText();
		System.out.println(bookStore);
		}
}

