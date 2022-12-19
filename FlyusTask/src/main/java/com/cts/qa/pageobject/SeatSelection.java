package com.cts.qa.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.qa.base.BaseClass;

public class SeatSelection extends BaseClass{

	public SeatSelection(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@ng-click='paModalCtrl.close()']//img[@class='thumb']")
	WebElement popupBtn;
	@FindBy(xpath="(//a[@class='btn btn-purple btn-sm no-radius font-bold text-lg ng-scope'])[8]")
	WebElement selectedFlight;
	@FindBy(xpath="//input[@id='fname-pax-0']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='lname-pax-0']")
	WebElement lastName;
	@FindBy(xpath="//select[@id='title-pax-0']")
	WebElement titleTab;
	@FindBy(xpath="//select[@id='title-pax-0']//option[text()='Ms.']")
	WebElement titleValue;
	@FindBy(xpath="//select[@id='gender-pax-0']//option[text()='Female']")
	WebElement genderTab;
	@FindBy(xpath="//select[@id='gender-pax-0']//option[text()='Female']")
	WebElement genderValue;
	@FindBy(xpath="//input[@id='paxes-ADULT-0-dob']")
	WebElement dateOfBirth;
	@FindBy(xpath="//a[text()='1996']")
	WebElement year;
	@FindBy(xpath="//a[text()='February']")
	WebElement month;
	@FindBy(xpath="//a[text()='02']")
	WebElement date;
	@FindBy(xpath="(//td[@style='text-align: center;']//a[text()='Select'])[2]")
	WebElement schemeSelect;
	@FindBy(xpath="(//div[@class='radio m-l-md'])[2]")
	WebElement flexibleBookingBtn;
	@FindBy(xpath="(//label[@class='i-checks'])[4]")
	WebElement smsBtn;
	@FindBy(xpath="//input[@id='cc-first-name']")
	WebElement billingFirstName;
	@FindBy(xpath="//input[@id='cc-last-name']")
	WebElement billingLastName;
	@FindBy(xpath="//input[@id='billing-address1']")
	WebElement billingAddress;
	@FindBy(xpath="//input[@id='cc-city']")
	WebElement billingCity;
	@FindBy(xpath="//input[@id='cc-zip']")
	WebElement billingZip;
	@FindBy(xpath="//input[@id='cc-phone']")
	WebElement billingPhone;
	@FindBy(xpath="//input[@name='paymentData[mail]']")
	WebElement billingEmail;
	@FindBy(xpath="//input[@name='paymentData[repMail]']")
	WebElement billingRepeatEmail;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement acceptBox;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement agreeBox;
	@FindBy(xpath="//table[@class='table flyus-table-seats m-b-none text-center small font-bold']//img[@src='img/sm/seat-available.svg']")
	List<WebElement> seats;
	@FindBy(xpath="(//a[text()='Select seat'])[1]")
	WebElement selectionBtn;
	@FindBy(xpath="//select[@id='cc-country']")
	WebElement billingCountry;
	@FindBy(xpath="//option[text()='India']")
	WebElement billingCountryValue;
	
	
	public void flightSelect(String name,String last,String dateValue) {
		Actions acc= new Actions(driver);
		popupBtn.click();
		acc.moveToElement(selectedFlight).perform();
		firstName.click();
		firstName.sendKeys(name);
		lastName.click();
		lastName.sendKeys(last);
		titleTab.click();
		acc.moveToElement(titleValue).click().build().perform();
		genderTab.click();
		acc.moveToElement(genderValue).click().build().perform();
		dateOfBirth.click();
		dateOfBirth.sendKeys(dateValue);
		acc.moveToElement(year).click().build().perform();
		acc.moveToElement(month).click().build().perform();
		acc.moveToElement(date).click().build().perform();
		schemeSelect.click();
		flexibleBookingBtn.click();
		smsBtn.click();
		seats.get(2).click();
		selectionBtn.click();
	}
	
	public void billingDetails(String bfName,String blName,String baddress,String bcity,String bzip,String bphone,String bemail,String bremail ) {
		Actions acc= new Actions(driver);
		billingFirstName.click();
		billingFirstName.sendKeys(bfName);
		billingLastName.click();
		billingLastName.sendKeys(blName);
		billingAddress.click();
		billingAddress.sendKeys(baddress);
		billingCountry.click();
		acc.moveToElement(billingCountryValue).build().perform();
		billingCity.click();
		billingCity.sendKeys(bcity);
		billingZip.click();
		billingZip.sendKeys(bzip);
		billingPhone.click();
		billingPhone.sendKeys(bphone);
		billingEmail.click();
		billingEmail.sendKeys(bemail);
		billingRepeatEmail.click();
		billingRepeatEmail.sendKeys(bremail);
		acceptBox.click();
		agreeBox.click();
	}

	
}
