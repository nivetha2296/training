package com.cts.automation.saucedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass extends TestBase{
	
	
	public static void main(String[] args) throws Exception  {
		
		LoginPage l1= new LoginPage();
		HomePage h1= new HomePage();
		AddToCartPage a1= new AddToCartPage();
		l1.testbase();
		l1.login();
		h1.add();
		a1.cart();
		a1.logOut();
		driver.quit();
		System.out.println("Process Completed");
		
		
	}

		
}


