package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.TablePageObject;

public class TableTest extends TestSuperClass {

	@Test
	public void getDataFromCell() {

		
		boolean actualResult = new TablePageObject(driver,url)
				.openTablePage()
				.getCellData()
				.getConfirmation();
		
		
		Assert.assertTrue(actualResult, "Something went wrong on TableTest");
		
		System.out.println("Getting data from due cell: " + "expectedResult.getCellData()");
	}
	
}
