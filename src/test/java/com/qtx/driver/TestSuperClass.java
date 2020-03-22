package com.qtx.driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuperClass {

	public WebDriver driver;
	public String url = "http://the-internet.herokuapp.com";
	
	@BeforeSuite
	public void beforeTest() {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
	}
	
	@AfterSuite

	public void afterTest() {
	//	driver.quit();

	}


	
}
