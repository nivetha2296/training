package com.cts.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{
	

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public void login() {
		
	
		PageFactory.initElements(driver, this);
		System.out.println(username);
		System.out.println(password);
		System.out.println(loginbtn);
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbtn.click();
	}
	public void validate() throws Exception{
		PageFactory.initElements(driver, this);
		username.sendKeys("standard_user");
		password.sendKeys("first_sauce");
		loginbtn.click();
		Thread.sleep(7000);
		System.out.println("username or password incorrect");
	}

}
