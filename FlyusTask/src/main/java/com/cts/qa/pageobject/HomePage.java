package com.cts.qa.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.qa.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='flys-dpt-0']")
	WebElement departurePoint;
	@FindBy(xpath="//input[@id='flys-arr-0']")
	WebElement arrivalPoint;
	@FindBy(xpath="//a[@id='flys-paxes']")
	WebElement count;
	@FindBy(xpath="//div[@class='inline pull-right']//a[@class='incr-btn increase-adt']")
	WebElement increaseBtn;
	@FindBy(xpath="//button[text()='Search']")
	WebElement searchBtn;
	@FindBy(xpath="//a[@class='incr-btn incrase-adt decrease-adt']")
	WebElement decreaseBtn;
	
	public void searchFlight(String fromLocation,String toLocation) throws InterruptedException {
		Actions acc= new Actions(driver);
		departurePoint.click();
		departurePoint.sendKeys(fromLocation);
		acc.sendKeys(Keys.DOWN).perform();
		acc.sendKeys(Keys.ENTER).perform();
		arrivalPoint.click();
		arrivalPoint.sendKeys(toLocation);
		acc.sendKeys(Keys.DOWN).perform();
		acc.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		acc.sendKeys(Keys.ENTER).perform();
		count.click();
		acc.moveToElement(increaseBtn).click().build().perform();
		acc.moveToElement(decreaseBtn).click().build().perform();
		acc.sendKeys(Keys.ENTER).perform();
		searchBtn.click();
		Thread.sleep(5000);
		

	
		
	}
}

