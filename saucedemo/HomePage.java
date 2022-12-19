package com.cts.automation.saucedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
	
	

	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement product1;
	
	@FindBy(className="shopping_cart_link")
	WebElement addtocart;
	
	public void add() {
		PageFactory.initElements(driver, this);
		product1.click();
		addtocart.click();
		System.out.println(addtocart);
	}

}
