package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.FloatingMenuPageObject;

public class FloatingMenuTest extends TestSuperClass {
	
	@Test
	public void floatingMenuHandleTest() {
		
		boolean actualResult = new FloatingMenuPageObject(driver, url) 
				.openFloatingMenuPage()
				.handleFloatingMenu()
				.getConfirmation();
		
		Assert.assertTrue(actualResult, "Something went wrong on Floating Menu test !!!");
		System.out.println("Floating Menu test has been executed successfully !!!");
		
	}


}
