package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class Drop_Down extends Base_Class {
	public static void main(String[] args) throws InterruptedException {

		property_Set();
		url("https://demoqa.com/select-menu");
		Thread();
		maxi();
		WebElement single = driver.findElement(By.id("oldSelectMenu"));
		drop_down("index", single, "1");
		//drop_down("value", single, "5");
		//drop_down("text", single, "Black");
		
  
	}
	

}
