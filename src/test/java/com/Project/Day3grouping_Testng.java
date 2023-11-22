package com.Project;

import org.testng.annotations.Test;

public class Day3grouping_Testng {

	@Test(groups= {"b"})
	public void firstsenario() {
		System.out.println("day5");
	}
	@Test(groups= {"c"})
	public void secondsenario() {
		System.out.println("day6");
	}
	@Test(groups= {"a"})
	public void thirssenario() {
		System.out.println("day7");

	}
	@Test(groups= {"b"})
	public void forthsenario() {
		System.out.println("day8");
	}

}
