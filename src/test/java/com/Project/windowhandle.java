package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class windowhandle extends Base_Class {

	public static void main(String[] args) throws InterruptedException  {
	property_Set();
	url("https://www.amazon.in/");
	maxi();
	refresh();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	send_Key(search, "iphone14");
	 WebElement find = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	 click_Button(find);
	 Thread();
    WebElement cbutton = driver.findElement(By.xpath("//span[text()='1,39,900']"));
    click_Button(cbutton);
     windowhandles();
	}

}
