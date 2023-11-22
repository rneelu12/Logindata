package com.Project;

import org.apache.commons.exec.LogOutputStream;
import org.testng.annotations.Test;

public class Day2Priority_Testng {
   @Test (priority =-1)
	public void signup() 
        {
		System.out.println("signup");
		}
	@Test(priority = -2)
	public void login() {
		System.out.println("login");
	}
	@Test (priority = 0)
	public void searchflight() {
		System.out.println("search flight");
    }
	@Test(priority = 1)
	public void bookthefight() 
	{
      System.out.println("bookflight");
	}
    @Test(priority = 2)
    public void saveticket()
    {
	System.out.println("save ticket");
	
    }
	@Test(priority = 1)
     private void logOut() 
	{
	System.out.println("logout");
     }
	
}


