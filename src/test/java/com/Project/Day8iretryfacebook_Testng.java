package com.Project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8iretryfacebook_Testng {
	WebDriver driver;
	@BeforeTest
	private void beforetest() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");

	}
	@Test(retryAnalyzer=Day8Retryauto_Testng.class)
	private void test() 
	{
		String title = driver.getTitle();
		assertEquals(title,"google");
		//assertEquals(title,"Facebook-log in or sign up");

	}
	@AfterTest
	private void aftertest() 
	{
		driver.quit();
	}

}
