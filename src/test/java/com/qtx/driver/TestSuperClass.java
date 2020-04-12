package com.qtx.driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestSuperClass {

	public WebDriver driver;
	public String url = "http://the-internet.herokuapp.com";

	
	
	@BeforeTest
	public void beforeTest() throws ATUTestRecorderException {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();

	}
	
	@AfterTest

	public void afterTest() throws ATUTestRecorderException {

	//driver.quit();

	}


	
}
