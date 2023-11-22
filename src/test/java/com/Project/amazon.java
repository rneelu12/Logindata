package com.Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class amazon extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException {
		property_Set();
		url("https://www.amazon.in/");
		maxi();
		refresh();
		WebElement bsell = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		click_Button(bsell);
		WebElement bproducts = driver.findElement(By.xpath("//a[text()='Baby Products']"));
		click_Button(bproducts);

		jsscroll_down(bproducts);
jsscroll_up(bproducts);
		// WebElement huggies= driver.findElement(By.xpath("//span[text()='₹399.00']"));
		// jsscroll_down(huggies);
		Thread.sleep(2000);
		// WebElement moomypoko =
		// driver.findElement(By.xpath("//span[text()='₹1,495.00']"));
		// jsscroll_up(moomypoko);
		// WebElement mpants =
		// driver.findElement(By.xpath("//div[contains(text(),'Mam')]"));
		// click_Button(mpants);
		// WebElement add =
		// driver.findElement(By.xpath("(//input[@type='submit'])[18]"));
		// js_click(add);
		screenshot("mpant");

	}
}