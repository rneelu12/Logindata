package com.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day4timeout_Testng {
	
	@Test(timeOut=3000)
	public void amaz() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NEELU .S\\eclipse-workspace\\Neelu_Project\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
	}
	}




