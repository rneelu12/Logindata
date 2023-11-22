package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D3Priority {

	WebDriver driver;
	@Test
	public void setproperty() {
	WebDriverManager.chromedriver().setup();
	}
	@Test(priority =1)
	public void chrome() {
		driver= new ChromeDriver();
	}
	@Test(priority =2)
	public void maximize() {
		driver.manage().window().maximize();

	}
	@Test(priority =3)
	public void url() {
		driver.get("https://www.imdb.com/");
	}
	@Test (priority = 4)
	public void searchfilm() {
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("billa");
	}
	@Test (priority = 5)
	public void click() {
		 WebElement click = driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
		   click.click();
	}
	@Test (priority = 6)
	public void picclick() {
		 WebElement p = driver.findElement(By.xpath("(//a[text()='Billa'])[1]"));
		   p.click();
	}
	
	@Test(priority=7)
	public void starrate() {
	driver.findElement(By.xpath("(//a[@role='button'])[14]")).click();
		

	}
}

