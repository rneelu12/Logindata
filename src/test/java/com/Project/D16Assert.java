package com.Project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D16Assert {
	WebDriver driver;
	@Test 
	private void login() 
	{
	   /*WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.instagram.com/?hl=en");// hardassert 
	   String expect_Title = "insta";
	   String actual_Title = driver.getTitle();
	   assertEquals(expect_Title, actual_Title);
	   driver.quit();*/
		
		WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com/?hl=en");
		   SoftAssert s = new SoftAssert();
		   String expect_Title = "Instagram";
		   String actual_Title = driver.getTitle();
		   s.assertEquals(expect_Title, actual_Title);
		   driver.quit();
		   s.assertAll();

}
}
