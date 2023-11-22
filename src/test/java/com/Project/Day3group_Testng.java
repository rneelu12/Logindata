package com.Project;

import org.testng.annotations.Test;

public class Day3group_Testng {

	
	@Test (groups= {"a"})
	public void firstsenario() {
		System.out.println("day1");
	}
	@Test(groups= {"b"})
	public void secondsenario() {
		System.out.println("day2");
	}
	@Test(groups= {"c"})
	public void thirssenario() {
		System.out.println("day3");

	}
	@Test(groups= {"a"})
	public void forthsenario() {
		System.out.println("day4");
	}
	
}
// <include name="a"></include> in html page 
