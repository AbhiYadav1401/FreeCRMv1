package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This well excute before every Actual method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This well excute after every Actual Test Method");
	}
	@Test
	public void Test1()
	{
		System.out.println("actual Test Method 1 "); 
	}
	
	@Test
	public void Test2()
	{
		System.out.println("actual Test Method 2 "); 
	}
}
