package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DisappearingElementsPageObject;


public class DisappearingElementsTest extends TestSuperClass {

	//http://the-internet.herokuapp.com/disappearing_elements
	
	@Test
	public void disappearingElementsTest() {
		
		boolean actualResult = new DisappearingElementsPageObject(driver, url) 
				.openDisappearingElementsPage()
				.handleDisappearingElements()
				.getConfirmation();
		
			Assert.assertTrue(actualResult, "Something went wrong on Disappearing Elements test !!!");
			System.out.println("Disappearing Elements test has been executed successfully !!!");
			
	}
}
