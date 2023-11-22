package com.Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore//class level ignore
public class Day2Ignore_Testng {
	
		 @Test
		  public void firstSenario() {
			  System.out.println("day1");
		  }
		  
		  @Test
		  private void secondsenario() {
			System.out.println("Day2");

		}
		  @Ignore
		  @Test
		  private void thirdsenario() {
			System.out.println("Day3");
		}
}
