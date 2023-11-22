package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6DataProvider_Testng {
	WebDriver driver;

	@Test(dataProvider = "Login_Data")
	public void gpage(String userid, String pass) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userid);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Marketplace']")).isDisplayed());
		driver.quit();
	}

	@DataProvider
	public Object[][] Login_Data() {

		Object[][] data = new Object[3][2];

		data[0][0] = "98851581";
		data[0][1] = "Vasanthineelu@12";

		data[1][0] = "98851581";
		data[1][1] = "erfsgfsdg";

		data[2][0] = "rsdnvnsadf@gmail.com";
		data[2][1] = "Vasanthineelu@12";
		return data;

	}
}
