package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;

public class Day6_Dataprovider_Testng

{
	WebDriver driver;

	@Test(dataProvider = "Login_Data")
	public void gpage(String userid, String pass) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/"
				+ "identifier?elo=1&ifkv=AVQVeyzswGWLo52eweoTbT-RkYulGgZ3uWBy1jklhM-cRCo5VhwryMkJyOmGhJYEey"
				+ "raI-gjnCeCbw&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys(userid);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//a[text()='Important']")).isDisplayed());
		driver.quit();
	}

	@DataProvider
	public Object[][] Login_Data() {

		Object[][] data = new Object[3][2];

		data[0][0] = "rneelu12@gmail.com";
		data[0][1] = "NeeluSami@22";

		data[1][0] = "rneelu12@gmail.com";
		data[1][1] = "erfsgfsdg";

		data[2][0] = "rsdnvnsadf@gmail.com";
		data[2][1] = "NeeluSami@22";
		return data;

	}
}
