package com.cts.qa.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cts.qa.base.BaseClass;
import com.cts.qa.pageobject.HomePage;
import com.cts.qa.pageobject.SeatSelection;

public class FlightBooking extends BaseClass{

	@Test(dataProvider = "testData")
	public void booking(String from, String to) throws InterruptedException {
		HomePage home = new HomePage();
		home.searchFlight(from, to);
		System.out.println("search completed");
	}
	@Test(dataProvider = "testData1")
	public void selectData(String name,String last,String dateValue) throws InterruptedException {
		SeatSelection seat = new SeatSelection();
		seat.flightSelect(name, last,dateValue);
		System.out.println("search completed");
	}
	@Test(dataProvider = "testData2")
	public void fillData(String bfName,String blName,String baddress,String bcity,String bzip,String bphone,String bemail,String bremail ) throws InterruptedException {
		SeatSelection seat = new SeatSelection();
		seat.billingDetails(bfName, blName,baddress,bcity,bzip,bphone,bemail,bremail);
		System.out.println("search completed");
	}

	@DataProvider(name ="testData")
	public Object[][] dataValues() throws IOException{
		BaseClass base = new BaseClass();
		Object[][] allValues = base.readExcel("C:\\Users\\mammu\\eclipse-workspace\\FlyusTask\\testData\\inputDetails.xlsx", "inputs");
		return allValues;

	}
	@DataProvider(name ="testData1")
	public Object[][] dataValues1() throws IOException{
		BaseClass base = new BaseClass();
		Object[][] allValues = base.readExcel("C:\\Users\\mammu\\eclipse-workspace\\FlyusTask\\testData\\travellerDetails.xlsx", "details");
		return allValues;

	}
	@DataProvider(name ="testData2")
	public Object[][] dataValues2() throws IOException{
		BaseClass base = new BaseClass();
		Object[][] allValues = base.readExcel("C:\\Users\\mammu\\eclipse-workspace\\FlyusTask\\testData\\billingDetails.xlsx", "billing");
		return allValues;

	}
}

