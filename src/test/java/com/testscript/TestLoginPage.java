package com.testscript;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectRepository.LoginPage;


public class TestLoginPage {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.signLinkClick();
		Thread.sleep(4000);
		lp.enterEmail();
		Thread.sleep(4000);
		lp.continueClick();
		Thread.sleep(20000);
		lp.enterPwd();
		lp.clickLoginBTN();

	}

}
