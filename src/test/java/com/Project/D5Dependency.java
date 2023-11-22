package com.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class D5Dependency {
	WebDriver driver;
	@Test
	 public void First() 
	{
		
	System.out.println("first");
		//Assert.assertTrue(false);
	}
	@Test (dependsOnMethods = {"First"})
	public void Second() 
	{
		
	System.out.println("second");
	}
	@Test
	public void Third() 
	{
	System.out.println("thirdcase");
	//driver.get("https://www.facebook.com/login.php");
	
	}
}
