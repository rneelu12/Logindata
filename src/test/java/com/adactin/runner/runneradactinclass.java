package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.pro.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin\\feature", glue = "com.adactin.step")
public class runneradactinclass extends Base_Class {
	public static WebDriver driver;

	@BeforeClass
 public static void setup() throws IOException 
 {
	 property_Set();
	 url("https://adactinhotelapp.com/index.php");
	 maxi();
	 WebElement name = driver.findElement(By.id("username"));
	 send_Key(name, "neeluravi");
     WebElement pass = driver.findElement(By.id("password"));
	 send_Key(pass, "Sami@22");
	 WebElement ck = driver.findElement(By.xpath("//input[@type='Submit']"));
	 click_Button(ck);
	 WebElement Location = driver.findElement(By.xpath("//select [@name='location']"));
	 drop_down("index", Location, "8");
	 WebElement hotel = driver.findElement(By.xpath("//select [@name='hotels']"));
	 drop_down("value", hotel, "Hotel Sunshine");
	 WebElement roomtype = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
	 drop_down("text", roomtype, "Super Deluxe");
	 WebElement roomno = driver.findElement(By.name("room_nos"));
	 drop_down("value", roomno, "4");
	 WebElement indate = driver.findElement(By.name("datepick_in"));
	 send_Key(indate, "02/12/2023");
	 WebElement outdate = driver.findElement(By.name("datepick_out"));
     send_Key(outdate, "04/12/2023");
     WebElement adroom = driver.findElement(By.id("adult_room"));
     drop_down("text", adroom, "2 - Two");
     WebElement childro = driver.findElement(By.xpath("//select[@id='child_room']"));
     drop_down("value", childro, "2");
     WebElement sub = driver.findElement(By.id("Submit"));
     click_Button(sub);
     WebElement rbutton = driver.findElement(By.name("radiobutton_0"));
     click_Button(rbutton);
     WebElement bt = driver.findElement(By.id("continue"));
     click_Button(bt);
     WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
     send_Key(fname,"Neelu");
	 WebElement lname = driver.findElement(By.id("last_name"));
     send_Key(lname,"sami");
     
	WebElement address = driver.findElement(By.name("address"));
	send_Key(address,"11-66 Blk 607 common wealth");
	WebElement ccno = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	send_Key(ccno, "1234567890987654");
	WebElement CCT = driver.findElement(By.id("cc_type"));
	drop_down("index", CCT, "2");
	WebElement ED = driver.findElement(By.id("cc_exp_month"));
	drop_down("index", ED, "11");
	WebElement EY = driver.findElement(By.name("cc_exp_year"));
	drop_down("text", EY, "2023");
	WebElement ccv = driver.findElement(By.id("cc_cvv"));
	send_Key(ccv, "234");
	WebElement clik = driver.findElement(By.xpath("//input[@id='book_now']"));
	click_Button(clik);
	screenshot("adactin");
	
	
	
     
 }
}
