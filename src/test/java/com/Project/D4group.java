

package com.Project;

import org.testng.annotations.Test;

public class D4group {
	@Test (groups= {"a"})
	public void firstsenario() {
		System.out.println("case1");
	}
	@Test(groups= {"b"})
	public void secondsenario() {
		System.out.println("case2");
	}
	@Test(groups= {"c"})
	public void thirssenario() {
		System.out.println("case3");

	}
	@Test(groups= {"a"})
	public void forthsenario() {
		System.out.println("case4");
	}
}

