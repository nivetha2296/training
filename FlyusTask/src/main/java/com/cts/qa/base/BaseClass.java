package com.cts.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void chromeLaunch(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flyus.com/");

	}
	@AfterClass
	public static void logOut() {
		driver.close();
	}
	public void windowHandles(int value) {

		Set<String> tabs= driver.getWindowHandles();
		List<String> tabList= new ArrayList<String>(tabs);
		driver.switchTo().window(tabList.get(value));
	}
	public Object[][] readExcel(String path,String sheetName) throws IOException {
		
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet s = workbook.getSheet(sheetName);
		int rows= s.getPhysicalNumberOfRows();
		int colms=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] values = new Object[rows][colms];
		
		for(int i =0;i<rows;i++) 
		{
			XSSFRow row = s.getRow(i);
			for (int j=0;j<colms;j++) 
			{
				XSSFCell cell = row.getCell(j);
				String input = cell.getStringCellValue();
				values[i][j] = input;
				
			}
		}
		
		return values;
	}
}
