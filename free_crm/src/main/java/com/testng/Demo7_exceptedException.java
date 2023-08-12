package com.testng;

import org.testng.annotations.Test;

public class Demo7_exceptedException {
//if Exception is occur then test case well passed by using expectedExceptions key word

	@Test(expectedExceptions = NumberFormatException.class)
	public void demoTest()
	{
		String value ="100A";
		Integer.parseInt(value);
		System.out.println(value);
	}
}
