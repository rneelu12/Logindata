package com.pro;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static void property_Set() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NEELU .S\\eclipse-workspace\\Neelu_Project\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void url(String u) // get URL
	{
		driver.get(u);
	}

	public static void maxi()// maximize window
	{
		driver.manage().window().maximize();
	}

	public static void to(String t) {
		driver.navigate().to(t);
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void send_Key(WebElement e, String input) {
		e.sendKeys(input);

	}

	public static void click_Button(WebElement e1) {
		e1.click();

	}

	// screenshot
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\NEELU .S\\eclipse-workspace\\Neelu_Project\\ScreenShot\\" + name + ".png");
		org.openqa.selenium.io.FileHandler.copy(source, des);
	}

	// java Script scroll down
	public static void jsscroll_down(WebElement sdown) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}

	// javascrollup
	public static void jsscroll_up(WebElement sup) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy()");
	}

	// java script click
	public static void js_click(WebElement ck) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ck);
	}

	// switch Windows handle`
	public static void windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String s : windowHandles) {

			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);

		}
	}

//thread.sleep
	public static void Thread() throws InterruptedException {
		Thread.sleep(2000);
	}

	// Alert accept,dismiss,sendkeys
	public static void a_popup(String option) {
		if (option.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (option.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void a_sendkeys(String val) {
		driver.switchTo().alert().sendKeys(val);
	}

//Drop down 
	
	public static void drop_down(String option , WebElement element , String value) 
	{
		Select s = new Select(element);
		if(option.equalsIgnoreCase("value")) 
		{
			s.selectByValue(value);
		}
		else if (option.equalsIgnoreCase("text")) 
		{
			s.selectByVisibleText(value);
			
		}
		else if(option.equalsIgnoreCase("index")) 
		{
			int n =Integer.parseInt(value);   
			s.selectByIndex(n);
		}
	
	}
	
	public static void Deselect_dropdown(String option, WebElement element, String value)
	{
		Select s = new Select (element);
		if (option.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		}
		else if (option.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		}
		else if(option.equalsIgnoreCase("index")) 
		{
		int n =Integer.parseInt(value);
		s.deselectByIndex(n);
		}
	}
	//frames
	public static void frameind(int index) 
	{
		driver.switchTo().frame(index);
	}
	public static void frameid(String idvalue)
	{
		driver.switchTo().frame(idvalue);
	}
	public static void frameelement(WebElement element) 
	{
		driver.switchTo().frame(element);
	}
	public static void backtoframe()
	{
		driver.switchTo().defaultContent();
	}
}

