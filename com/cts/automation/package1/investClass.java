package com.cts.automation.package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class investClass {
static WebDriver driver;

		public void launch() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\jars\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("https://adactinhotelapp.com/");
		}

//	 public String loginValues() throws IOException 
//
//	{
//			FileInputStream fis = new FileInputStream("C:\\Users\\mammu\\eclipse-workspace\\Selenium\\testData\\login.xls");
//			//Creating a workbook
//			HSSFWorkbook workbook = new HSSFWorkbook(fis);
//			HSSFSheet sheet = workbook.getSheet("Sheet1");
//		HSSFRow row = sheet.getRow(0);
//		HSSFCell cell = row.getCell(0);
//		String userName = cell.toString();
//		System.out.println(userName);
//		cell = row.getCell(1);
//		String password = cell.toString();
//		System.out.println(password);
//		char c= 'a';
//		String s1= userName+c+password;
//		return s1;
//	}
	public void login()  
	{
		//String values= loginValues();
	  //  String[] login = values.split("a");
		WebElement userValue=driver.findElement(By.xpath("//input[@id='username']"));
		userValue.click();
		userValue.sendKeys("Nivi2296");
		WebElement passValue=driver.findElement(By.xpath("//input[@id='password']"));
		passValue.click();
		passValue.sendKeys("Saravanan@2296");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	public void dataFromWeb() throws IOException
	{
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\mammu\\eclipse-workspace\\Selenium\\testData\\ReadExcel.xlsx");
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sheet= w.createSheet("Data");
		WebElement text1=driver.findElement(By.xpath("(//td[@class='welcome_menu'])[1]"));
		String data1=text1.getText();
		WebElement text2=driver.findElement(By.xpath("(//td[@class='welcome_menu'])[2]"));
		String data2=text2.getText();
		XSSFRow excelRow = sheet.createRow(0); 
		XSSFCell excelCell = excelRow.createCell(0);                  
		excelCell.setCellValue(data1);
		XSSFRow excelRow1 = sheet.createRow(0); 
		XSSFCell excelCell1 = excelRow.createCell(1);                  
		excelCell1.setCellValue(data1);
	}

	public static void logOut()
	{
		driver.close();
	}
	public static void main(String[] args) throws IOException {
		investClass maven = new investClass();
		maven.launch();
	//	maven.loginValues();
		maven.login();
		maven.dataFromWeb();
		maven.logOut();
	}
	}

	

