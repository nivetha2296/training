package com.cts.automation.package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void chrome() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\jars\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	public  void readExcel(String path,String info) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\mammu\\eclipse-workspace\\Selenium\\testData\\info.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("info");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			HSSFRow row = sheet.getRow(i);

			for (int j=0;j<row.getPhysicalNumberOfCells();j++) 
			{
				HSSFCell cell = row.getCell(j);
				String eachValue = cell.toString();
				System.out.println(eachValue);
			}
		}

	}
	
	}
