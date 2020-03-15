package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.JSAlertPageObject;


public class JSAlertsTest extends TestSuperClass {
	
	@Test
	public void JSAlertTest() 
	{
		boolean expectedResult = true;
		
		boolean actualResult =  new JSAlertPageObject(driver, url) 
				.OpenJSAlertPage()
				.ClickAndHandleJS()
				.GetVerificationOnJSAlerts();
		
		Assert.assertEquals(actualResult, expectedResult, "Something went wrong !!!");
		System.out.println("Test was successfully executed");
		
	}
}
