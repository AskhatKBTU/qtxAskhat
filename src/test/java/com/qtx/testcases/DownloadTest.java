package com.qtx.testcases;



import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DownloadPageObject;

public class DownloadTest extends TestSuperClass {

	@Test
	public void downloadFileTest() throws FileNotFoundException {
		
		boolean expectedResult = new DownloadPageObject(driver, url)
				.openDowloadPage()
				.downloadFile()
				.getConfirmationAndPrint();
		
		Assert.assertTrue(expectedResult, "Something went wrong !!!");
		System.out.println("Hover test has been executed successfully !!!");
		
	}
				
}
