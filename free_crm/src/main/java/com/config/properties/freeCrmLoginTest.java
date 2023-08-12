package com.config.properties;

import java.sql.Connection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class freeCrmLoginTest
{
	WebDriver driver;
	ReadConfigFile readconfigData;
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("chrome.driver.driver","C:\\Selenium Imp File\\chromedriver_win32.zip");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 
	}
	
	@Test
	public void loginTest() throws Exception
	{
		 readconfigData = new ReadConfigFile();		   
		 driver.get(readconfigData.getUrl());
		 driver.findElement(By.xpath("//input [@name='username']")).sendKeys(readconfigData.getUserName());
		 driver.findElement(By.xpath("//input [@name='password']")).sendKeys(readconfigData.getPassword());
		 driver.findElement(By.xpath("//input [@type='submit']")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
