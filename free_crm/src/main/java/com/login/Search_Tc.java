package com.login;

import org.testng.annotations.Test;

public class Search_Tc
{
	//setup
	//search customer
	// add customer
	//closed browser
	@Test (priority = 0)
	public void setup()
	{
		System.out.println("Browser launch and application ");
	}
	
	@Test(priority = 1)
	public void searchCustomer()
	{
		System.out.println("Search customer ");           
	}
	
	@Test(priority = 2)
	public void addcustomer()
	{
		System.out.println("Add Customer");
	}
	
	@Test(priority =3)
	public void closeBrowser()
	{
		System.out.println("Closed the browser");
	}
}
