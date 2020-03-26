package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.FramesPageObject;

public class FramesTest extends TestSuperClass {
	
	@Test
	public void TestNestedFrames() {
		boolean expectedResult = true;
		
		
		boolean actualResult = new FramesPageObject(driver, url)
				.openFramesPage()
				.openNestedFrames()
				.getTextFromAllFrames()
				.getVerificationOnFrames();
		
		
		Assert.assertEquals(actualResult, expectedResult, "Something went wrong on Nested Frames Test!!!");
		System.out.println("Nested Frames Test Passed Successfully!");
	}
	


}
