package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DynamicLoadingPageObject;


public class DynamicLoadingTest extends TestSuperClass {	
	
	
	@Test
	public void dynamicLoadingTest() {
	
	boolean actualResult = new DynamicLoadingPageObject(driver, url) 
			.openDynamicLoadingPage()
			.handleDynamicLoading();
	
		Assert.assertTrue(actualResult, "Something went wrong on Dynamic Loading test !!!");
		System.out.println("Dynamic Loading test has been executed successfully !!!");
		
}

}
