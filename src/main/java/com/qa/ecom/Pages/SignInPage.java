package com.qa.ecom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecom.TestBase.TestBase;

public class SignInPage extends TestBase {
	
	WebDriver driver;
	//object repository
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="email")
	WebElement emailIDTxt;
	
	@FindBy(linkText="Sign in")
	WebElement signInlnk;
	
	
	@FindBy(xpath="//h1[@class='page-heading']")
	WebElement getTextName;
	
	
	
	
	//Actions
	public void clickOnSigin() {
		
		try {
			
			System.out.println("clickon signin");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	//Selinum commands
	//click, get, select
	//browser command
	//maximize, forward, refresh
	
	

}
