package org.bd.daraz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	public static WebDriver driver;
	
	@BeforeSuite
	public static void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterSuite
	public static void driverclose()
	{
		driver.close();
	}
	
	
	
	
	
}
