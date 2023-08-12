package com.dataprovider.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class FaceBook
{
	WebDriver driver;
	//pri-condition
	@BeforeMethod
	public void setUp()
	{
			System.setProperty("chrome.driver.driver","C:\\Selenium Imp File\\chromedriver_win32.zip");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			 driver = new ChromeDriver(option);
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			 
			 driver.get("https://classic.freecrm.com/"); // enter url
	}
	
	public void freeCrmRegTest()
	{
		
	}
	
	
	// post condition
	@BeforeMethod
	public void tearDown()
	{
		driver.close();
	}
}
