package com.genericLib;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseClass {
	static public  WebDriver driver;
	ExtentReports extent;
	@BeforeSuite
	public void beforeSuite()
	{
		
	}

}
