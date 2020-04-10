package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.ExitIntentPageObject;
import com.qtx.pages.FloatingMenuPageObject;

public class ExitIntentTest extends TestSuperClass {
		
	@Test
	public void exitIntentHandleTest() {
		
		boolean actualResult = new ExitIntentPageObject(driver, url) 
				.openExitIntentPage()
				.handleExitIntent()
				.getConfirmation();
		
		Assert.assertTrue(actualResult, "Something went wrong on Exit Intent test !!!");
		System.out.println("Exit Intent test has been executed successfully !!!");
		
	}
	

}
