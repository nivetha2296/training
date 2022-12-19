package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class LoginClass extends TestBase{
	
	//Page Factory -Object Repository
	@FindBy(xpath= "//input[@class'icon icon-xs mdi-chart-bar']")
	WebElement LoginButton;
	
	@FindBy(name= "email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath= "//input[@class'ui fluid large blue submit button']")
	WebElement LoginBtn;
	

}
