package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Homepage;
import utilities.ExtentFactory;

public class UponnashSelection extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Uponnash Selection</b></p>")
				.assignAuthor("Sabbir Ahmed").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	
	@Test(priority = 0)
	public void ClickOnAuthor() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Uponnash.</b></p>");
		Homepage homePage = new Homepage(childTest);
		homePage.clickOnUponnash();
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
