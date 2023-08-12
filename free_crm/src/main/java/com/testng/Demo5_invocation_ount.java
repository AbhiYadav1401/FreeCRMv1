package com.testng;

import org.testng.annotations.Test;

public class Demo5_invocation_ount 
{
	@Test(invocationCount = 10)
	public void Test1()
	{
		System.out.println("Test1");
	}
}
