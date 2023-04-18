package com.qa.ecom.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingPage {
	WebDriver driver;
	
public void openURL() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium Webdriver\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}	

}
