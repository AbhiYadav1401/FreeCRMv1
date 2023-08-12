package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo1 
{		
	
			
		WebDriver driver;
		@Test
		
		public void loginTest()
		{
			System.out.println("Set up method");
			 System.setProperty("chrome.driver.driver","C:\\Selenium Imp File\\chromedriver_win32.zip");
				
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				 driver = new ChromeDriver(option);
				 driver.get("https://classic.freecrm.com/");
				 driver.manage().window().maximize();

			 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc");  // enter user-name
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abhijeet");  // enter password
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		}
		
}
