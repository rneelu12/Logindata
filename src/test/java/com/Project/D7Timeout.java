package com.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D7Timeout {

	@Test(timeOut=4000)
	public void amaz() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Thread.sleep(5000);

		driver.get("https://www.nykaa.com/");
		
	}

}
