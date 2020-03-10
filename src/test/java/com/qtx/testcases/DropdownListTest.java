package com.qtx.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DropDownPageObject;


public class DropdownListTest extends TestSuperClass{

	// As a user
	// I want to select option 2 from a dropdown list
	// So that some option is selected
	@Test
	public void canSelectFromDrowdown() {
		
		

		String expectedSelection = "Option 2";
		
		//act
		String actualSelection = new DropDownPageObject(driver, url)
				.OpenDropdownPage()
				.setDropDownList(expectedSelection)
				.getDropDownListValue();

		Assert.assertEquals(actualSelection, expectedSelection, "Failed to click Option 2!");
	}

}
