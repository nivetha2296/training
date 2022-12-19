package com.cts.automation.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends TestBase{
	@FindBy (className="inventory_item_price")
	WebElement productprize;
	
	@FindBy(className="inventory_item_name")
	WebElement productname;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutBtn;
	
	public void cart() {
		PageFactory.initElements(driver, this);
		String s1= productname.getText();
		String s2= productprize.getText();
		if(s1.equals("Sauce Labs Backpack")) {
			System.out.println("The Rate of Sauce Labs Backpack is :"+s2);
		}else
		{
			System.out.println("The selected product is different");
		}
		}
	public void logOut() {
		PageFactory.initElements(driver, this);
		menu.click();
		logoutBtn.click();
		
	}
	}


