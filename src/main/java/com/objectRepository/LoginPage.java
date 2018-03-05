package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//span[text()='Sign In']") private WebElement signLink;
	@FindBy(xpath="//input[@id='emailId']") private WebElement emailTB;
	@FindBy(xpath="//div[@id='continueBtn']") private WebElement contTB;
	@FindBy(xpath="//input[@id='userPassword']") private WebElement pwdTB;
	@FindBy(xpath="//div[@id='loginCheck']") private WebElement loginBTN;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signLinkClick() {
		signLink.click();
	}
	
	public void continueClick() {
		contTB.click();
	}
	public void enterEmail() {
		emailTB.sendKeys("atulawasthi79@gmail.com");
	}
	
	public void enterPwd() {
		emailTB.sendKeys("mnbvcx1050");
	}
	public void clickLoginBTN() {
		loginBTN.click();
	}
}
