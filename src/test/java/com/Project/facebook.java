package com.Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class facebook extends Base_Class {
	public static void main(String[] args) throws IOException {
		property_Set();
		url("https://www.facebook.com/login.php");
		maxi();
	to("https://www.amazon.in/");
    back();
forward();
    refresh();
    back();
//	close();
		// quit();
		WebElement email = driver.findElement(By.id("email"));
		send_Key(email, "abi@gmail.com");

		WebElement pass = driver.findElement(By.id("pass"));
		send_Key(pass, "134253647");

		WebElement button = driver.findElement(By.name("login"));
		click_Button(button);

		screenshot("facebook");

	}
}
