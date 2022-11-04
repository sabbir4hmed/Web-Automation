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

public class Bookpage extends CommonMethods{

ExtentTest test;
	
	public Bookpage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		
		@FindBy(xpath = "(//img[contains(@class,'wp-post-image')])[2]"),
		@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/img[1]")
	})
	
	public WebElement bookselect;
	
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	
	public WebElement cart;
	
public void clickOnBook() throws IOException {
		
		
		test.info("Click on Book");
		try {
			if (bookselect.isDisplayed()) {
				timeOut();
				bookselect.click();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Book Button Clicked.</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Book Button Clicked pass");
				String dest = System.getProperty("User.dir") + "\\screenshots\\" + "Book Button Clicked pass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				timeOut(10000);
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Book Button location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Book Button Fail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Book Button Fail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(bookselect.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		timeOut(10000);
	}

public void clickOncart() throws IOException {
	
	
	test.info("Click on Cart");
	try {
		if (cart.isDisplayed()) {
			timeOut();
			cart.click();
			timeOut();
			test.pass("<p style=\"color:green; font-size:13px\"><b>Cart Button Clicked.</b></p>");
			timeOut(5000);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Cart Button Clicked pass");
			String dest = System.getProperty("User.dir") + "\\screenshots\\" + "Cart Button Clicked pass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			timeOut(10000);
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>Cart Button location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Cart Button Fail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Cart Button Fail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(cart.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	
	timeOut(10000);
}
	
}
