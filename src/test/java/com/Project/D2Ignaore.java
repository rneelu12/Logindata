package com.Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class D2Ignaore {
	@Test
	private void firstcase() {
		System.out.println("case1");
	}

	@Test
	private void secondcase() {

		System.out.println("case2");
	}
   // @Ignore
	@Test//(enabled =false)// method level ignore
	private void thirdcase() {
		System.out.println("case3");
	}
}
