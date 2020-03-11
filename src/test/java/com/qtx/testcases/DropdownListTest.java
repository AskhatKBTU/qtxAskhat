package com.qtx.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DropdownListPage;


public class DropdownListTest extends TestSuperClass{

	
	//As a user
	//I want select option 2 from the dropdownlist 
	//so that an option is selected
	@Test
	public void canSelectDropdownListItem() {
		//arrange
		String expectedSelection = "Option 2";
		
		//act
		String selectionOptionText = new DropdownListPage(driver, url)
			.navigate()
			.selectOption(expectedSelection)
			.getSelectedDropdownlistItemText();			
		
		//assert
		Assert.assertEquals(selectionOptionText,  expectedSelection, "Cannot select a dropdown list value.");
	}

}
