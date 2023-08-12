package com.testng;

import org.testng.annotations.Test;

public class Demo4_depandencey 
{
	@Test
	public void loginpageTest()
	{
		System.out.println("login page");
		System.out.println(10/0);
	}
	
	@Test(dependsOnMethods = "loginpageTest")
	public void homePageTest()
	{
		System.out.println("home page");
	}
	
	@Test(dependsOnMethods ="loginpageTest")
	public void searchpageTest() 
	{
		System.out.println("Search page");
	}
	
	@Test(dependsOnMethods ="loginpageTest")
	public void logOutTest()
	{
		System.out.println("logout page");
		
	}
}
