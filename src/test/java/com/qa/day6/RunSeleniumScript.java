package com.qa.day6;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunSeleniumScript {
	WebDriver driver;
	
	@BeforeMethod
	public void a_set_up() {
	
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumIDE\\chromedriver_win32\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			//Browser Commands
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public void clickOnSearch() {
		
		try {
			driver.findElement(By.linkText("Contact us")).click();
			String actualResult_currURL=driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
			String expectedResult="CUSTOMER SERVICE - CONTACT US";
			Assert.assertEquals(actualResult_currURL, expectedResult);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@abc.com");
			System.out.println("clickOnSearch");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=2)
	public void browserBack() {
		
		try {
			driver.navigate().back();
			System.out.println("browserBack");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=3)
	public void browserForward() {
		
		try {
			driver.navigate().forward();
			System.out.println("browserForward");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=4)
	public void browserReferesh() {
		
		try {
			driver.navigate().refresh();
			System.out.println("browserReferesh");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=1)
	public void getTitle() {
		
		try {
			String actual=driver.getTitle();
			String expected="My Store";
			Assert.assertEquals(actual, expected);
			System.out.println("getTitle");

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@DataProvider
	public void loginData() {
		driver.quit();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
