package com.qa.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ecom.Pages.LaunchingPage;

public class TestScript {

	@Test
	public void test1() throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
