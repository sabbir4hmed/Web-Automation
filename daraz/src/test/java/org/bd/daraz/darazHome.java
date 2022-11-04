package org.bd.daraz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class darazHome extends BaseDriver{

	public static String baseurl = "https://www.daraz.com.bd/";
	
	@Test (priority = 0)
	public static void openurl()
	{
		try {
			driver.get(baseurl);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Test (priority = 1)
	public static void login() throws InterruptedException 
	{
			//
			WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
			login.click();
			Thread.sleep(5000);
		
	}
	@Test(priority =2)
	public static void logininfo() throws InterruptedException
	{
		WebElement username = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		WebElement password = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]"));
		username.sendKeys("sbbrcse@gmail.com");
		password.sendKeys("wm213286");
		loginbtn.click();
		Thread.sleep(5000);
	
	}	
	@Test (priority = 3)
	public static void searchproduct() throws InterruptedException
	{
		WebElement searchprdct = driver.findElement(By.xpath("//input[@id='q']"));
		WebElement searchbtn = driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]"));
		searchprdct.sendKeys("samsung 47 inch tv");
		Thread.sleep(1500);
		searchbtn.click();
		
		Thread.sleep(5000);
		
	}
	@Test (priority = 4)
	public static void pricedropdown() throws InterruptedException
	{
		WebElement dropdown =  driver.findElement(By.cssSelector(".ant-select-selection__rendered"));
		//WebElement select = driver.findElement(By.xpath("//div[contains(text(),'Price low to high')]"));
		dropdown.click();
		
		Thread.sleep(1500);
		WebElement select =driver.findElement(By.cssSelector("div[data-spm-click='gostr=/lzdse.result.sort;locaid=d2']"));
		select.click();
		
		Thread.sleep(7000);
	}
	
	@Test (priority = 5)
	public static void selectproduct() throws InterruptedException
	{
		WebElement slctprdct = driver.findElement(By.cssSelector("img[alt='Samsung N4010 32 Inch HD LED TV']"));
		slctprdct.click();
		
		Thread.sleep(3000);
	}
	@Test  (priority = 6)
	public static void cartproduct() throws InterruptedException
	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1500)", " ");
//		Thread.sleep(1500);
//		js.executeScript("window.scrollBy(0,-1500)", " ");
//		
//		Thread.sleep(1500);
		WebElement quantity = driver.findElement(By.cssSelector(".next-number-picker-handler-up-inner"));
		for(int i =1;i<=3;i++)
		{
			quantity.click();
			
			Thread.sleep(1500);
		}
		
		Thread.sleep(1500);
		
		WebElement location = driver.findElement(By.cssSelector(".location-link.location-link_size_xs.automation-location-link-change"));
		location.click();
		
		Thread.sleep(1500);
		
		WebElement dhaka = driver.findElement(By.cssSelector("div[data-tag='gateway-wrapper'] li:nth-child(3)"));
		dhaka.click();
		
		Thread.sleep(1500);
		
//		WebElement searchloc = driver.findElement(By.cssSelector("input[placeholder='Select Address']"));
//		searchloc.sendKeys("Tangail - Town");
//		
//		Thread.sleep(1000);
		
//		WebElement chat = driver.findElement(By.cssSelector(".im-app__minimize-title']"));
//		chat.click();
//		
//		Thread.sleep(1000);
		
//		WebElement input = driver.findElement(By.cssSelector(".message-fileds__autosize"));
//		input.sendKeys("Hello");
//		input.sendKeys(Keys.ENTER);
		
		WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
		cart.click();
		
		Thread.sleep(1500);
		
		WebElement proceed = driver.findElement(By.cssSelector(".next-btn.next-btn-secondary.next-btn-large.checkout-order-total-button.automation-checkout-order-total-button-cartButton"));
		proceed.click();
		
		Thread.sleep(1500);
		
		WebElement checkbox = driver.findElement(By.cssSelector("div[id='shop_1571'] div[id='shop-title-wrap'] input[value='on']"));
		checkbox.click();
		
		Thread.sleep(1500);
		
		WebElement deletecart = driver.findElement(By.cssSelector(".list-header-operation-text"));
		deletecart.click();
		
		Thread.sleep(1500);
		
		WebElement confirm = driver.findElement(By.xpath("//button[@class='ok']"));
		confirm.click();
		
		Thread.sleep(1500);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", " ");
		Thread.sleep(1500);
		
		WebElement darazhome = driver.findElement(By.cssSelector(".drz-footer-sprit.drz-footer-country.icon-yatra-v-bd"));
		darazhome.click();
		
		
		Thread.sleep(3000);
		
		
		
		
	}
	@Test(priority = 7)
	public static void darazmart() throws InterruptedException
	{
		WebElement mart = driver.findElement(By.cssSelector("div[class='hp-mod-card-content card-channels-content'] div:nth-child(1) a:nth-child(1) div:nth-child(2) div:nth-child(1)"));
		mart.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i=1;i<=50;i++)
		{
			js.executeScript("window.scrollBy(0,350)", " ");
			Thread.sleep(1500);
		}
		
		Thread.sleep(3000);
	}
}
