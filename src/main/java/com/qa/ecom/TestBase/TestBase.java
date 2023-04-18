package com.qa.ecom.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.ecom.Utilities.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		
		try {
			
			File file=new File("./Resources/config.properties");
			System.out.println(file.exists());
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initializeBrowser() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumIDE\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumIDE\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

}
