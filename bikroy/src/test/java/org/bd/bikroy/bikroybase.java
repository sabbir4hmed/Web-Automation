package org.bd.bikroy;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class bikroybase {

	public static WebDriver driver;
	
	@BeforeSuite
	public void open()
	{
		if(Browser.CHROME.browserName().contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.FIREFOX.browserName().contains("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Browser.EDGE.browserName().contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(Browser.IE.browserName().contains("Htmlunit"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(Browser.OPERA.browserName().contains("Opera"))
		
		{
			WebDriverManager.operadriver();
			driver = new OperaDriver();
			
		}
		else if(Browser.SAFARI.browserName().contains("Safari"))
		{
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
		}
	}
	@AfterSuite
	public void stop()

	{
		driver.close();
	}
	
	public List<LogEntry> logtracker()
	{
		LogEntries log = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs = log.getAll();
		return logs;
	}
	
}
