package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Billingpage;
import pages.Bookpage;
import pages.Checkout;
import pages.Homepage;
import utilities.ExtentFactory;

public class Shippingprocess extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Shipping Process</b></p>")
				.assignAuthor("Sabbir Ahmed").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	
	@Test(priority = 0)
	public void shippinginfo() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Shipping Information.</b></p>");
		Billingpage billing = new Billingpage(childTest);
		billing.shippingelements();
		}
	

	
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
