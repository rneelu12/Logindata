package com.Project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day15iretryanalyser {
	WebDriver driver;
	@BeforeTest
	private void beforetest() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	     driver.get("https://www.instagram.com/?hl=en");

	}
	@Test(retryAnalyzer= D15Auto.class)
	private void test() 
	{
		String title = driver.getTitle();
		assertEquals(title,"Instagram");
	

	}
	@AfterTest
	private void aftertest() 
	{
		driver.quit();
	}

}
