package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7parameter_Testng {
	WebDriver driver;
@Parameters({"browser"})
@Test 
private void property(String browser) 
{
if(browser.equals("chrome")) 
{
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
}
else if (browser.equals("firefox")) 
{
	WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
}
else if (browser.equals("edge")) 
{
	WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver();
}
driver.get("https://www.facebook.com/");
}
/*@Parameters({"username"})
@Test
private void login(String user)
{
driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);	

}*/


}