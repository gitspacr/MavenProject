package com.qa.ecom.TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecom.Pages.SignInPage;
import com.qa.ecom.TestBase.TestBase;

public class VerifySigninLink extends TestBase {
	
	
	
	SignInPage siginPageclick;
	
	public VerifySigninLink() {

		super();
	}
	
	@BeforeMethod
	public void initBroswer() {
		initializeBrowser();
	}
	
	@Test
	public void signInTest() {
		
		try {
			
//			siginPageclick.clickOnSigin();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
