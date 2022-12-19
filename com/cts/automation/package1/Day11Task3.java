package com.cts.automation.package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11Task3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\mammu\\eclipse-workspace\\Selenium\\testData\\login.xls");
		//Creating a workbook
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell = row.getCell(0);
		String userName = cell.toString();
		System.out.println(userName);
		cell = row.getCell(1);
		String password = cell.toString();
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys(userName);
		WebElement pw=driver.findElement(By.xpath("//input[@id='pass']"));
		pw.click();
		pw.sendKeys(password);


	}

	}


