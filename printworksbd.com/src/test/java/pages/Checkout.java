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

public class Checkout extends CommonMethods{

ExtentTest test;
	
	public Checkout(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		
		@FindBy(css = ".dropdown-toggle.cart-head.cart-head4"),
		@FindBy(xpath = ".dropdown-toggle")
	})
	
	public WebElement carthover;
	
	@FindBy(xpath = "//a[contains(text(),'Checkout')]")
	
	public WebElement checkout;
	

	
public void clickOncheckout() throws IOException {
		
		
		test.info("Click on CheckOut");
		try {
			if (carthover.isDisplayed()) {
				timeOut();
				hover(carthover);
				timeOut();
				checkout.click();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Check Button Clicked.</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Check Button Clicked pass");
				String dest = System.getProperty("User.dir") + "\\screenshots\\" + "Check Button Clicked pass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				timeOut(10000);
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Check Button location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Check Button Fail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Check Button Fail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(checkout.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		timeOut(10000);
	}


	
}
