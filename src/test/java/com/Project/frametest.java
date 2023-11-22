package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pro.Base_Class;

public class frametest extends Base_Class {

	public static void main(String[] args) {
	property_Set();
	maxi();
	url("https://demo.automationtesting.in/Frames.html");
	frameid("singleframe");
	 
	  WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   send_Key(text, "java");
	   backtoframe();
	   WebElement ck = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	   click_Button(ck);
	   frameind(1);
	   WebElement frame0 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	frameelement(frame0);
	  WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
	  send_Key(txt, "selenium");
	    

	}

}
