package com.testng;

import org.testng.annotations.Test;

public class Demo3_Groupping 
{
	@Test(groups = "loginpagetest")
	public void loginTest()
	{
		System.out.println("Login Test");
	}
	
	@Test(groups = "loginpagetest")
	public void SearchTest()
	{
		System.out.println("SearchTest");
	}
	
	@Test(groups = "loginpagetest")
	public void HomepageTest()
	{
		System.out.println("homepage Test");
	}
	
	@Test(groups = "loginpagetest")
	public void logoutButtonTest()
	{
		System.out.println("LogoutButton Test");
	}
	@Test(groups = "Homepagetest")
	public void Test1()
	{
		System.out.println("tset1");
	}
	@Test(groups = "Homepagetest")
	public void Test2()
	{
		System.out.println("Test2");
	}
	@Test(groups = "Homepagetest")
	public void Test3()
	{
		System.out.println("Test3");
	}
}
