package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.EntryAdPageObject;
import com.qtx.pages.ExitIntentPageObject;

public class EntryAdTest extends TestSuperClass {
	
	//http://the-internet.herokuapp.com/entry_ad
	@Test
	public void entryAdHandleTest() {
		
		boolean actualResult = new EntryAdPageObject(driver, url) 
				.openEntryAdPage()
				.handleEntryAd();
		
			Assert.assertTrue(actualResult, "Something went wrong on Entry Ad test !!!");
			System.out.println("Entry Ad test has been executed successfully !!!");
			
	}
}
