package com.testscript;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectRepository.Google;



public class TestURL {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Google g =new Google();
		g.verifyElement(driver);
		g.verifyURL(driver);
		g.takePhoto(driver);
		g.verifyLinkActive("https://www.google.com/");
		
}


}
