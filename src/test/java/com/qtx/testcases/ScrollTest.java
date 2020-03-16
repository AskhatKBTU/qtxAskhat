package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.ScrollPageObject;

public class ScrollTest extends TestSuperClass {

	
	@Test 
	public void printParagraph() { 
		boolean expectedResult = new ScrollPageObject(driver, url)
				.openScrollPage()
				.printParagraph()
				.getConfirmation();	
		
		Assert.assertTrue(expectedResult, "Something went wrong in Scroll Test");
		System.out.println("ScrollPage was printed successfully !");
	}
}
