package com.qa.day6;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ecom.Pages.ContactUSPage;
import com.qa.ecom.Pages.LaunchingPage;

public class VerifySearchTextBox_TC2 {
	WebDriver driver;
	
	@BeforeTest
	public void launchURL() {
		
		
		LaunchingPage lp=new LaunchingPage();
		lp.openURL();
			
		
	}	
	
	@Test
	public void searchInformation() {
		
		ContactUSPage contactUs=new ContactUSPage();
		contactUs.searchText("Selenium");
		
	}

		
	@AfterTest
	public void closeBrowser() {
		
		
		driver.quit();
		
	}	
	
}
