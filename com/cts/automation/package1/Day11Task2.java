package com.cts.automation.package1;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Day11Task2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\mammu\\eclipse-workspace\\Selenium\\testData\\info.xls");
		//Creating a workbook
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