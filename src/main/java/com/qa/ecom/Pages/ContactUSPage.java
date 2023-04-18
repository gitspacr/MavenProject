package com.qa.ecom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUSPage {
	
	//Defining web object
	
	WebDriver driver;
	
	WebElement contactUS=driver.findElement(By.xpath("//a[@title='Contact Us']"));
	
	WebElement searchText=driver.findElement(By.name("q"));
			
	
	
	
	public void clickOncontactUs() {
		
		contactUS.click();
		
	}
	
	public void searchText(String sechTxt) {
		
		searchText.sendKeys(sechTxt, Keys.ENTER);
		
	}
	
	

}
