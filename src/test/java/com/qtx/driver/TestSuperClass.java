package com.qtx.driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestSuperClass {

	protected WebDriver driver;
	protected String url;
	protected DriverManager driverManager;
	private ConfigurationManager configurationManager;

	protected TestSuperClass() {
		this.configurationManager = ConfigurationManager
				.getInstance()
				.getConfiguration();
	}
	
	protected TestSuperClass (String url) {
		this();
		this.configurationManager.SetIfValueNotNull(Settings.baseUrl, url);
	}

	@Parameters({
		Settings.baseUrl,
		Settings.browserType, 
		Settings.databaseConnectionString, 
		Settings.implicitWaitMilliseconds, 
		Settings.pageLoadTimeoutMilliseconds
	})
	@BeforeTest
	public void readSettings(
			@Optional String baseUrl,
			@Optional String browserType, 
			@Optional String databaseConnectionString, 
			@Optional String implicitWaitMilliseconds, 
			@Optional String pageLoadTimeoutMilliseconds) {
		
		configurationManager.SetIfValueNotNull(Settings.baseUrl, baseUrl)
							.SetIfValueNotNull(Settings.browserType, browserType)
							.SetIfValueNotNull(Settings.databaseConnectionString, databaseConnectionString)
							.SetIfValueNotNull(Settings.implicitWaitMilliseconds, implicitWaitMilliseconds)
							.SetIfValueNotNull(Settings.pageLoadTimeoutMilliseconds, pageLoadTimeoutMilliseconds);	
	}

	@BeforeMethod
	public void setup() {
		this.driverManager = DriverManagerFactory.getManager(configurationManager.getValueAsString(Settings.browserType));
		this.driver = driverManager.getDriver();	
		
		this.driver.manage().timeouts().implicitlyWait(configurationManager.getValueAsLong(Settings.implicitWaitMilliseconds), Settings.timeoutTimeUnit);
		this.driver.manage().timeouts().pageLoadTimeout(configurationManager.getValueAsLong(Settings.pageLoadTimeoutMilliseconds), Settings.timeoutTimeUnit);
		this.url = configurationManager.getValueAsString(Settings.baseUrl);
	}

	@AfterMethod
	public void tearDown() {
		driverManager.quitDriver();
	}

	
}
