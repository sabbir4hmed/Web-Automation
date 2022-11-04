package org.bd.bikroy;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class bikroyhome extends bikroybase{

	public static String baseurl = "https://bikroy.com/";
	
	
	@Test
	public void openurl() throws InterruptedException
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logtracker();
		
		
	}
	@Test ( priority = 1)
	public void login() throws InterruptedException
	{
		
		
		WebElement login = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.only-desktop--2pxYG:nth-child(2) nav.nav--1qSMY.background--2lR9B div.justify-content-space-between--bjSys.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 ul.nav-bar-list--201Xv:nth-child(2) li.login-icon-container--3oQMU:nth-child(2) div.justify-content-flex-start--1Xozy.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 a.header-link--woAbP.title--1NHWk.gtm-login-click.active > span.title--1NHWk.gtm-login-click"));
		
		login.click();
		
		Thread.sleep(5000);
		
	}
	
	@Test (priority =2)
	public void loginemail() throws InterruptedException
	{
		WebElement email = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.row--3Vhjr.login-container--2z_9L.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.login--hZ65g.block--3v-Ow:nth-child(2) div.container--2mwdK div.gtm-email-login:nth-child(6) button.btn--1gFez.secondary--Os-e9.background--2lR9B.small--1MQ15.button--eCUEQ.gtm-email-login > span.email-text--FbASN"));
		email.click();
		Thread.sleep(5000);
	}
	@Test (priority = 3)
	public void loginnfo() throws InterruptedException
	{
		WebElement linfo = driver.findElement(By.cssSelector("#input_email"));
		WebElement pass = driver.findElement(By.cssSelector("#input_password"));
		linfo.sendKeys("sbbrcse@gmail.com");
		pass.sendKeys("wm085233");
		
		Thread.sleep(5000);
		
		
	}
	
	@Test (priority = 4)
	public void loginbutton() throws InterruptedException
	
	{
		WebElement lgnbtn = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.row--3Vhjr.login-container--2z_9L.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.login--hZ65g.block--3v-Ow:nth-child(2) div:nth-child(1) form.form--1G_Qn:nth-child(1) div.justify-content-flex-end--jceWj.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-12--1_BS_.block--3v-Ow > button.btn--1gFez.secondary--Os-e9.background--2lR9B.small--1MQ15.gtm-login"));
		
		lgnbtn.click();
		
		Thread.sleep(5000);
	}
	
	@Test (priority = 5)
	public void locationbtn() throws InterruptedException
	
	{
		WebElement location = driver.findElement(By.xpath("//span[contains(text(),'All of Bangladesh')]"));
		location.click();
		//select.click();
		
		Thread.sleep(5000);
	}
	
	@Test (priority = 6)
	public void locationslct() throws InterruptedException
	
	{
		//WebElement location = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.desktop-max-width-container--3xntY.main-content-area--o-zsx.skeleton-content--2JN5q:nth-child(3) div.search-container--1aaDi.justify-content-center--3YVEn.align-items-flex-end--Fg8OY.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1:nth-child(2) div.section--3qPXi.inner--2X7Be.justify-content-flex-end--jceWj.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 button.btn--1gFez.default--T8kE3.small--1MQ15.location-picker-btn--p3-uX.gtm-home-location-picker-click > span:nth-child(2)"));
		WebElement select = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z.all div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.container--317sx div.row--3Vhjr.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.block--3v-Ow div.list-container--1szlU div.col-wrapper--EHXhG:nth-child(3) div.item-list--1jgKI ul.list--uEf0L li.list-item-wrapper--2EIpW:nth-child(1) button.list-item--2dM7Z.item--OZFrC > div.justify-content-space-between--bjSys.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1"));
		select.click();
		Thread.sleep(5000);
	}
	
	@Test (priority = 7)
	public void locationclose() throws InterruptedException
	{
		WebElement close = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z.all div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 > button.btn--1gFez.default--T8kE3.small--1MQ15.button--2R5m5"));
		close.click();
		Thread.sleep(3000);
	}
	@Test (priority = 8)
	public void searchproduct() throws InterruptedException
	{
		WebElement search = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.desktop-max-width-container--3xntY.main-content-area--o-zsx.skeleton-content--2JN5q:nth-child(3) div.search-container--1aaDi.justify-content-center--3YVEn.align-items-flex-end--Fg8OY.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1:nth-child(2) div.section--3qPXi.inner--2X7Be.justify-content-flex-end--jceWj.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.search-bar-container--tnPU2 form.search-form--mexm- > input.search-input--PtfH8"));
		search.sendKeys("samsung");
		
		Thread.sleep(5000);
	}
	
	@Test (priority = 9)
	public void searchbutton() throws InterruptedException
	{
		WebElement searchbtn = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.desktop-max-width-container--3xntY.main-content-area--o-zsx.skeleton-content--2JN5q:nth-child(3) div.search-container--1aaDi.justify-content-center--3YVEn.align-items-flex-end--Fg8OY.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1:nth-child(2) div.section--3qPXi.inner--2X7Be.justify-content-flex-end--jceWj.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.search-bar-container--tnPU2 form.search-form--mexm- div.search-button-container--Ur5ku.gtm-home-search-click > button.btn--1gFez.default--T8kE3.small--1MQ15.search-button--1_VmY.gtm-home-search-click"));
		searchbtn.click();
		
		Thread.sleep(3000);
	}
	@Test (priority = 10)
	public void selectproduct() throws InterruptedException
	{
		WebElement product = driver.findElement(By.className("normal-ad--1TyjD"));
		product.click();
		
		Thread.sleep(3000);
	}
	
	@Test (priority = 11)
	public void Productview() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(3000);
		
		WebElement viewproduct = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.container--3Gaei.all div.main-section--34CB3:nth-child(2) div.details-section--2ggRy:nth-child(3) div.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1:nth-child(2) div.row--3Vhjr.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-8--3483a.block--3v-Ow:nth-child(1) div.left-section--PoAuT div.gallery--2V9wt div.gallery-wrapper--3DMhO > span.full-screen-icon--2UHAU"));
		viewproduct.click();
		
		Thread.sleep(3000);
	}
	
	@Test (priority = 12)
	public void productslide() throws InterruptedException
	{
		WebElement slide = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.modal-wrapper--3cz0w.justify-content-space-around--VJICC.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 div.next-navigation-control--3FOXd > button.navigation-button--Olabt"));
		WebElement slideclose = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 > button.btn--1gFez.default--T8kE3.small--1MQ15.button--2R5m5"));
		
		for(int i =1;i<= 6;i++)
		{
			slide.click();
				
			Thread.sleep(3000);
				
		}
		
		Thread.sleep(3000);
		
		slideclose.click();
		
		Thread.sleep(3000);
		
	}
	@Test (priority = 13)
	public void productchat() throws InterruptedException
	{
		WebElement chat = driver.findElement(By.className("chat-text--NpECZ"));
		
		chat.click();
		Thread.sleep(3000);
		WebElement typemsg = driver.findElement(By.cssSelector("#input_1"));
		typemsg.sendKeys("use kotodin");
		Thread.sleep(1500);
		typemsg.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		
	}
	@Test (priority = 14)
	public void chatclose() throws InterruptedException
	{
		WebElement close = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z.all div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 > button.btn--1gFez.default--T8kE3.small--1MQ15.button--2R5m5"));
		close.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(3000);
		
		
	}
	
	@Test (priority = 15)
	public void bikroyhomeurl() throws InterruptedException
	{
		WebElement home = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.container--3Gaei.all nav.nav--1qSMY.background--2lR9B div.justify-content-space-between--bjSys.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 ul.nav-bar-list--201Xv:nth-child(1) li.ghana-web-logo--2b3y_ div.logo-container--3W5L5 > a.gtm-market-logo"));
		//WebElement mobile = driver.findElement(By.className("info-title--3CkVD"));
		home.click();
		Thread.sleep(3000);
		//mobile.click();
		//Thread.sleep(3000);
		
	}
	
	@Test (priority = 16)
	public void Mobile() throws InterruptedException
	{
		
		WebElement mobile = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.desktop-max-width-container--3xntY.main-content-area--o-zsx.skeleton-content--2JN5q:nth-child(3) div.section--3qPXi.category-container--1RreD:nth-child(3) ul.category-list--2oS_W.right--WcHqY.left--2ndlm.hide-native-scrollbar--Nj_rv li.category-item--1h1A1:nth-child(1) a.link--1t8hM.gtm-home-category-link-click div.info--uF0qH > p.info-title--3CkVD"));
		mobile.click();
		Thread.sleep(3000);
		
	}
	
//	@Test (priority = 16)
//	public void Mobilefilter() throws InterruptedException
//	{
//		
////		WebElement locationfilter = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.container--297Nx.all div.main-section--3D6zE div.row--3Vhjr.main-container--28aG5.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1:nth-child(2) div.search-row-container--44CIO:nth-child(2) div.search-row--WRXiU div.row--3Vhjr.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-11--1ryqD.lg-col-6--g-Ot_.category-selector--3ei-V.block--3v-Ow div.sm-col-6--2MLq9.lg-col-6--g-Ot_.block--3v-Ow:nth-child(1) div:nth-child(1) > button.btn--1gFez.default--T8kE3.small--1MQ15.gtm-location-selector.category-button--3Q-ZO"));
////		WebElement locselect = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z.all div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.container--317sx div.row--3Vhjr.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.block--3v-Ow div.list-container--1szlU div.col-wrapper--EHXhG:nth-child(3) div.item-list--1jgKI ul.list--uEf0L li.list-item-wrapper--2EIpW:nth-child(1) button.list-item--2dM7Z.item--OZFrC div.justify-content-space-between--bjSys.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 > div.name--4feK3"));
////		WebElement mirpur = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z.all div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.container--317sx div.row--3Vhjr.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.block--3v-Ow:nth-child(2) div.sub-location--3QaxK div.item-list--1jgKI.col-wrapper--EHXhG:nth-child(2) ul.list--uEf0L li.list-item-wrapper--2EIpW.gtm-l2location-selection:nth-child(2) button.list-item--2dM7Z.item--OZFrC div.justify-content-space-between--bjSys.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 > div.name--4feK3"));
////		
////		locationfilter.click();
////		locselect.click();
////		mirpur.click();
//		Select pricefilter = new Select(driver.findElement(By.xpath("//span[contains(text(),'Date: Newest on top')]")));
//		pricefilter.selectByVisibleText("Price: Low to high");
//		pricefilter.selectByIndex(3);
//		Select poster = new Select(driver.findElement(By.xpath("//body/div[@id='app-container']/div[@id='app-wrapper']/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/span[1]/span[1]/button[1]")));
//		poster.selectByVisibleText("Non-members");
//		poster.selectByIndex(3);
//		
//		
//		//mobile.click();
//		Thread.sleep(3000);
//		
	//}
}
	
	
	
	
	
//}
