package com.testng;

import org.testng.annotations.Test;

public class Demo6_Priority
{
	@Test(priority =4)
	public void X()
	{
		System.out.println("A");
	}

	@Test(priority = 1)
		public void A()
		{
			System.out.println("A");
		}
	
	@Test(priority =3)
	public void f()
	{
		System.out.println("f");
	}

	@Test(priority =2)
		public void m()
		{
			System.out.println("m");
		}
	}
