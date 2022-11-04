package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class Billingpage extends CommonMethods{

ExtentTest test;
	
	public Billingpage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	
	@FindAll({
		
		@FindBy(xpath = "//input[@id='billing_first_name']")
	})
	
	public WebElement fisrtname ;
	
	@FindAll({
		
		@FindBy(xpath = "//input[@id='billing_last_name']")
	})
	
	public WebElement secondname ;
	
	@FindAll({
		
		@FindBy(css = "#billing_address_1")
	})
	
	public WebElement address ;
	
	@FindAll({
		
		@FindBy(xpath = "//input[@id='billing_postcode']")
	})
	
	public WebElement postcode ;
	
	@FindAll({
		
		@FindBy(xpath = "//input[@id='billing_phone']")
	})
	
	public WebElement phone ;
	
	@FindAll({
		
		@FindBy(xpath = "//input[@id='billing_email']")
	})
	
	public WebElement email ;
	
	@FindBy(id = "place_order")
	
	public WebElement placeorder;
	
	
	@FindBy(css = "#select2-billing_country-container")
	
	public WebElement dropdown;

	
	public void personalinfo() throws IOException {
		
		
		test.info("Billing Information");
		try {
			if (placeorder.isDisplayed()) {
				timeOut();
				
				shippingelements();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Billing Information passed.</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Billing Information pass");
				String dest = System.getProperty("User.dir") + "\\screenshots\\" + "Billing Information pass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				timeOut(10000);
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Billing Information not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Billing Information Fail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Billing Information Fail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(placeorder.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		timeOut(10000);
	}

		public void shippingelements()
		{
			
			fisrtname.sendKeys("Sabbir");
			timeOut();
			secondname.sendKeys("Ahmed");
			timeOut();
			//selectItemByVisibleText(dropdown, "Bangladesh");
			address.sendKeys("Akur Takur Muslim Para, Tangail");
			timeOut();
			postcode.sendKeys("1216");
			timeOut();
			phone.sendKeys("01622290146");
			timeOut();
			email.sendKeys("sabbir4hmed@gmail.com");
			timeOut();
			
			
			
			
		}


	
}
