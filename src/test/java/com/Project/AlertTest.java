package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class AlertTest extends Base_Class {

	public static void main(String[] args) throws InterruptedException {
	property_Set();
	maxi();
	url("https://demoqa.com/alerts");
	
	/*WebElement ck = driver.findElement(By.id("alertButton"));
	click_Button(ck);
	a_popup("ok");
	WebElement confirm = driver.findElement(By.cssSelector("button#confirmButton"));
	click_Button(confirm);
	a_popup("cancel");
	refresh();*/
	Thread();
	WebElement pro = driver.findElement(By.id("promtButton"));
	click_Button(pro);
	a_sendkeys("abc");
	a_popup("OK");
	}

}
