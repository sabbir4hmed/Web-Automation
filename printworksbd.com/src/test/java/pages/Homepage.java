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

public class Homepage extends CommonMethods{

ExtentTest test;
	
	public Homepage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		
		@FindBy(xpath = "//ul[@id='menu-menu']//a[.='বাংলা']"),
		@FindBy(xpath = "//div[@class='menu-center']/ul/li[5]")
	})
	
	public WebElement bangla;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[2]/ul[1]/li[5]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	
	public WebElement uponnash;
	
public void clickOnUponnash() throws IOException {
		
		
		test.info("Click on Bangla");
		try {
			if (bangla.isDisplayed()) {
				hover(bangla);
				timeOut();
				uponnash.click();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Uponnash Button Clicked.</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Uponnash Button Clicked pass");
				String dest = System.getProperty("User.dir") + "\\screenshots\\" + "Uponnash Button Clicked pass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				timeOut(10000);
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Uponnash location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Uponnash Button Fail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Uponnash Button Fail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(bangla.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		timeOut(10000);
	}
	
}
