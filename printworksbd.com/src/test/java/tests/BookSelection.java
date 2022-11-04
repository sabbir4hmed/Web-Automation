package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Bookpage;
import pages.Homepage;
import utilities.ExtentFactory;

public class BookSelection extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Book Selection</b></p>")
				.assignAuthor("Sabbir Ahmed").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	
	@Test(priority = 0)
	public void ClickOnbook() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Book.</b></p>");
		Bookpage bookpage = new Bookpage(childTest);
		bookpage.clickOnBook();
	}
	
	@Test(priority = 1)
	public void ClickOncart() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Cart.</b></p>");
		Bookpage bookpage = new Bookpage(childTest);
		bookpage.clickOncart();
	
	}
	
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
