package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class multipledropdown extends Base_Class{

	public static void main(String[] args) throws InterruptedException {
		property_Set();
		url("https://demoqa.com/select-menu");
		Thread();
		maxi();
		WebElement c = driver.findElement(By.id("cars"));
		drop_down("index", c, "2");
		drop_down("value", c, "audi");
		drop_down("text", c, "Saab");
		Deselect_dropdown("index", c, "2");
		Deselect_dropdown("value", c, "audi");
		Deselect_dropdown("text", c, "Saab");

	}

}
