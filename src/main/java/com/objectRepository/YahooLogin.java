package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class YahooLogin {
	
	@FindBy(xpath="//*[@id='uh-signin']") private WebElement signLink;
	@FindBy(xpath="//a[@id='createacc']") private WebElement signupLink;
	
	@FindBy(xpath="//*[@id=\"usernamereg-firstName\"]") private WebElement Firstname;
	@FindBy(xpath="//*[@id=\"usernamereg-lastName\"]") private WebElement Surname;
	@FindBy(xpath="//*[@id=\"usernamereg-phone\"]") private WebElement Phone;
	
	@FindBy(xpath="//*[@id=\"usernamereg-firstName\"]") private WebElement BrithMonth;
	@FindBy(xpath="//*[@id=\"usernamereg-day\"]") private WebElement Day;
	@FindBy(xpath="//*[@id=\"usernamereg-year\"]") private WebElement Year;
	
	@FindBy(xpath="//*[@id=\"usernamereg-freeformGender\"]")private WebElement Gender;
	
	@FindBy(xpath="//*[@id=\"usernamereg-month\"]") private WebElement emailTB;
	@FindBy(xpath="//*[@id=\"usernamereg-password\"]") private WebElement pwdTB;
	
	@FindBy(xpath="//*[@id=\"reg-submit-button\"]") private WebElement contTB; 
	
	@FindBy(xpath="//*[@id=\"verification-code-field\"]") private WebElement OTP;
	@FindBy(xpath="//*[@id=\"phone-verify-challenge\"]/form/div[2]/button") private WebElement TextAccountKey;
	
	@FindBy(xpath="//*[@id=\"phone-verify-challenge\"]/form/div[3]/button") private WebElement Verify;
	
	
	public YahooLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signLinkClick() {
		signLink.click();
	}
	public void signupLinkClick() {
		signLink.click();
	}
	
	public void enterFirstname() {
		Firstname.sendKeys("atul");
	}
	
	public void enterSurname() {
		Surname.sendKeys("awasthi");
	}
	
	public void enterPhone() {
		Phone.sendKeys("7355050884");
	}
	
	public void continueClick() {
		contTB.click();
	}
	public void enterEmail() {
		emailTB.sendKeys("atulawasthi990@yahoo.com");
	}
	
	public void enterPwd() {
		emailTB.sendKeys("mnbvcx1050");
	}
	
	public void clickTextAccountKey() {
		TextAccountKey.click();
	}
	
	public void clickverify() {
		Verify.click();
	}
	
	public void selectMonth() {
		Select s =new Select(BrithMonth);
		s.selectByVisibleText("May");
	}
	
	public void selectgender() {
		Select s =new Select(Gender);
		s.selectByVisibleText("Male");
	}
	public void enterDay() {
		Day.sendKeys("06");
	}
	public void enterYear() {
		Year.sendKeys("06");
	}
	
}
