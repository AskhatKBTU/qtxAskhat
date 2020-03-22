package com.qtx.testcases;


import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.ScrollPageObject;

public class ScrollTest extends TestSuperClass {

	
	@Test 
	public void printParagraph() { 
	 new ScrollPageObject(driver, url)
				.openScrollPage()
				.printParagraph();

		System.out.println("ScrollPage was printed successfully !");
	}
}
