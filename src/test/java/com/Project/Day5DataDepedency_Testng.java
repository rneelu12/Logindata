package com.Project;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Day5DataDepedency_Testng 
{
	@Test
	 public void first_case() 
	{
		
		//System.out.println("first case");
		Assert.assertTrue(false);
	}
	@Test (dependsOnMethods = {"first_case"})
	public void second_case() 
	{
		
		System.out.println("second case");
	}
	@Test
	public void Third_case() 
	{
		
		System.out.println("Third case");
	}
	
}
