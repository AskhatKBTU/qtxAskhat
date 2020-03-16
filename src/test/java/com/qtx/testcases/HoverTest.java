package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.HoverPageObject;

public class HoverTest extends TestSuperClass {

	@Test
	public void doHoverTest() {
		
		boolean actualResult = new HoverPageObject(driver, url)
				.openHoverPage()
				.moveHoverAndClick()
				.getConfirmation();
			
		Assert.assertTrue(actualResult, "Something went WRONG in Hover Test !!!");
		System.out.println("Hover Test was executed successfully !!!");
	}
}

