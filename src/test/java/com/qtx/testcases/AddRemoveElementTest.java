package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.AddRemoveElementPageObject;

public class AddRemoveElementTest extends TestSuperClass {

	// http://the-internet.herokuapp.com/add_remove_elements/
	
	@Test
	public void addRemoveElementTest() {
		
		boolean actualResult = new AddRemoveElementPageObject(driver, url) 
				.openAddRemoveElementPage()
				.addElement()
				.removeElement();
		
			Assert.assertTrue(actualResult, "Something went wrong on Add Remove Element test !!!");
			System.out.println("Add Remove Element Test test has been executed successfully !!!");
			
	}
}
