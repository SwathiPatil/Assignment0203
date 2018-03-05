package com.testscript;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectRepository.YahooLogin;



public class TestYahoo {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		
		YahooLogin yl=new YahooLogin(driver);
		yl.signLinkClick();
		Thread.sleep(4000);
		yl.signupLinkClick();
		Thread.sleep(2000);
//		
//		yl.enterFirstname();
//		Thread.sleep(2000);
//		yl.enterSurname();
//		Thread.sleep(2000);
//		yl.enterEmail();
//		Thread.sleep(2000);
//		yl.enterPwd();
//		Thread.sleep(2000);
//		yl.enterPhone();
//		Thread.sleep(2000);
//		yl.selectMonth();
//		Thread.sleep(2000);
//		yl.enterDay();
//		Thread.sleep(2000);
//		yl.enterYear();
//		Thread.sleep(2000);
//		yl.selectgender();
//		Thread.sleep(2000);
//		yl.continueClick();
}



}
