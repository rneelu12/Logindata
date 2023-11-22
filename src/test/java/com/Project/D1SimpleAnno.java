package com.Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class D1SimpleAnno
{
	WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	WebDriverManager.chromedriver().setup();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }
  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	 
  }
  @BeforeMethod
  
  public void beforeMethod() {
	  driver.get("https://www.imdb.com/");
	 
  }
  @Test
  public void search() 
  {
	  WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("billa");
	  WebElement click = driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
	   click.click();
  }
  @AfterMethod
  public void afterMethod() {
	  WebElement p = driver.findElement(By.xpath("(//a[text()='Billa'])[1]"));
	   p.click();
  }
  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
