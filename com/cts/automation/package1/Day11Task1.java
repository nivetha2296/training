package com.cts.automation.package1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11Task1 {

	public static void main(String[] args) throws Exception {
		File Book1= new File("C:\\Users\\mammu\\eclipse-workspace\\Selenium\\testData\\New Microsoft Office Excel Worksheet.xls");
		FileOutputStream fos= new FileOutputStream(Book1);
		//XSSFWorkbook w1= new XSSFWorkbook();
		HSSFWorkbook w= new HSSFWorkbook();
		HSSFSheet sheet= w.createSheet("Data");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
		List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
		List<WebElement> cols= driver.findElements(By.xpath("(//table//tbody//tr)[1]//td"));
		for(int i=0;i<rows.size();i++) 
		{
			HSSFRow excelRow = sheet.createRow(i);   
			for(int j=0;j<cols.size();j++) 
			{

				String eachCellVal= "((//table//tbody//tr)["+(i+1)+"]//td)["+(j+1)+"]";
				String valueFromUI= driver.findElement(By.xpath(eachCellVal)).getText();
				System.out.println(valueFromUI); 
				HSSFCell excelCell = excelRow.createCell(j);                  
				excelCell.setCellValue(valueFromUI);  
			}
		}   
		w.write(fos);     
		fos.close();
	}
}


