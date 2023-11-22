package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5crossbro_Testng {
	
	@Test
	public void chrome() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("billa");
	   WebElement click = driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
	   click.click();
	   WebElement p = driver.findElement(By.xpath("(//a[text()='Billa'])[1]"));
	   p.click();
	}
	@Test
	public void edge() 
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.imdb.com/");
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("billa");
   WebElement click = driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
   click.click();
   WebElement p = driver.findElement(By.xpath("(//a[text()='Billa'])[1]"));
   p.click();

	}

}
