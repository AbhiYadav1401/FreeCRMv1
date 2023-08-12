 package com.login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
	
	@Test
	public void testlogin1()
	{
		App app = new App();
		Assert.assertEquals(0,app.userLogin("abc","xyz"));
	}
	
	@Test
	public void testlogin2()
	{
		App app = new App();
		Assert.assertEquals(1, app.userLogin("abc","abc@123"));
	}
}
