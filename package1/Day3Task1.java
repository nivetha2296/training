package com.cts.automation.package1;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3Task1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mammu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		Actions ac= new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement dismiss=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		dismiss.click();
		WebElement search=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("rollex watches");
		WebElement enter= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		enter.click();
		WebElement homeandfurniture= driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		ac.moveToElement(homeandfurniture).perform();		
		WebElement floor= driver.findElement(By.xpath("(//a[text()='Floor Coverings'])[1]"));
		floor.click();
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("(//a[@title='SHF Cotton Door Mat'])[1]"));
		String t1=title.getText();
		if(t1.equals("SHF Cotton Door Mat")) {
			WebElement rating= driver.findElement(By.xpath("//span[@id='productRating_LSTMATFNZXS2C6CGCVYXXROQK_MATFNZXS2C6CGCVY_']"));
			ac.moveToElement(rating).perform();
			WebElement rating1= driver.findElement(By.xpath("//span[text()='7,486 Ratings &']"));
			System.out.println("rating of this product is :"+rating1.getText());
			WebElement review= driver.findElement(By.xpath("//span[text()='843 Reviews']"));
			System.out.println("review of this product is :"+review.getText());
			List<WebElement> starRate= driver.findElements(By.xpath("//div[@class='col-7-12']"));
			for(int i=0;i<starRate.size();i++) {
				String s=starRate.get(i).getText();
				System.out.print((5-i)+" star rating is "+s);
			}
			driver.close();
			



			
			}
		
		//span[text()='113 Ratings &']
		//span[@id='productRating_LSTCPGFN2DBZSGFPDFTI6LYEN_CPGFN2DBZSGFPDFT_']
			
		//Thread.sleep(2000);
		//WebElement product1= driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		//product1.click();
		//Thread.sleep(2000);
	//	WebElement rating= driver.findElement(By.xpath("(//div[text()='4.1'])[3]"));
		//rating.click();	
		


		

		

		
	}

}
