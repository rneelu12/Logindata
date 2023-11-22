package com.Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Day1simannotation_facebookTestng 

{
	WebDriver driver;
  @Test
  public void face() {
	  
	  driver.findElement(By.id("email")).sendKeys("neelu@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("neelu");
	
  }
  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.id("loginbutton")).click();
  }
  
  @Test
  public void beforeMethod() {
	  driver.manage().window().maximize();
  }
  @BeforeClass
  public void beforeClass() {
	  driver.get("https://www.facebook.com/login.php");
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Users\\NEELU .S\\eclipse-workspace\\"
			  + "Neelu_Project\\WebDriver\\chromedriver.exe");
  }
@Ignore
@AfterSuite(enabled = false)
  public void afterSuite() {
	  driver.close();
  }

}
