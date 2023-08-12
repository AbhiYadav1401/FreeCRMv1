package com.parameter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter
{		
	 WebDriver driver;
	 @BeforeMethod
		public void setup(String url )
		{
		
		 System.setProperty("chrome.driver.driver","C:\\Selenium Imp File\\chromedriver_win32.zip");
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(option);
			 driver.get("https://classic.freecrm.com/");
			 driver.manage().window().maximize();
			
		}
	
		
		@Test
		@Parameters({"username","password"})
		public void LoginTest(  String username ,String password)
		{
			 
			
			 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abhijeet");  // enter user-name
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abhijeet1401yadav");  // enter password
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 
			 
		}
		@AfterMethod
		public void tearDown()
		{
			System.out.println("tesr dwon");
			//driver.close();
		}
}
