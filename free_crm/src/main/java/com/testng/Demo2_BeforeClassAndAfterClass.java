package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2_BeforeClassAndAfterClass 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This method excue before class ");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("this method excute after class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before mothod well excute evry actual Test Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method well excute after every Actual method ");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Actual Test1 method");
	}
	@Test
	public void Test2()
	{
		System.out.println("Actual Test2 method");
	}
}
