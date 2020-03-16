package com.qtx.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DownloadPageObject;

public class DownloadTest extends TestSuperClass {

	@Test
	public void downloadFileTest() {
		
		boolean expectedResult = new DownloadPageObject(driver, url)
				.openDowloadPage()
				.downloadFile()
				.readDownloadedFile()
				.getConfirmation();
		
		Assert.assertTrue(expectedResult, "Something went wrong !!!");
		System.out.println("Hover test has been executed successfully !!!");
		
	}
				
}
