package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.WindowsPageObject;

public class WindowsTest extends TestSuperClass {
	
	@Test
	public void windowsHandleTest() {
		
		boolean actualResult = new WindowsPageObject(driver, url) 
				.openWindowsPage()
				.windowsHandleTestProcess()
				.getConfirmation();
		
		Assert.assertTrue(actualResult, "Something went wrond on Windows test !!!");
		System.out.println("Windows test has been executed successfully !!!");
		
	}

}
