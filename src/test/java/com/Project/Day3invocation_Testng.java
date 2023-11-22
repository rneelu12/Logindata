package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3invocation_Testng {
	//(invocationCount = 5,invocationTimeOut = 10000)
	//(invocationCount = 4,threadPoolSize =2)
	@Test(invocationCount = 6,threadPoolSize=2)
 public void User_name_emailid() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://randomuser.me/");
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		Thread.sleep(2000);
		System.out.println("user name"+driver.findElement(By.id("user_value")).getText());
        driver.findElement(By.xpath("//li[@data-title='My email address is']")).click();
        System.out.println("mail id"+driver.findElement(By.id("user_value")).getText());
	}
	

}
