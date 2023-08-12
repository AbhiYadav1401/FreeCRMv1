package com.login;

import org.testng.annotations.Test;

public class Login_TC 
{ 
	// Setup - browser launch url launch
	// login
	//close
	
	@Test(priority = 0)
	public void setup()
	{
		System.out.println("launch browser and appln");
	}
	
	@Test(priority =1)
	public void login()
	{
		System.out.println("appln login");
	}
	@Test(priority =2)
	public void close()
	{
		System.out.println("closed");
	}
}
