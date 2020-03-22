package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.MenuPageObject;

public class MenuTest extends TestSuperClass{

	@Test
	public void TestMenu() {
		
		
		boolean expectedResult = new MenuPageObject(driver, url)
				.openMenuPage()
			      .dowloadFile()
			    .getConfirmation();
		
		Assert.assertTrue(expectedResult, "Something went WRONG in Menu Test !!!");
		
		System.out.println("Menu test was executed successfully !");
		
	}

	
	
}
