package com.qtx.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.ContextMenuPageObject;

public class ContextMenuTest extends TestSuperClass {
	
	@Test
	public void ContextMenuWorkTest() {
		
		//Arrange
		boolean expectedContextResult = true;
		//Act
		boolean actualContextResult = new ContextMenuPageObject(driver, url) 
				.ContextMenuPageOpen()
				.ContextMenuPageHandle()
				.ContextMenuWorkVerification();
		//Assert
		Assert.assertEquals(actualContextResult, expectedContextResult, "Something went wrong !!!");
		
	}

}
