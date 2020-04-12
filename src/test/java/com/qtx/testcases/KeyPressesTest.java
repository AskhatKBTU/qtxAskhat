package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.KeyPressesPageObject;

public class KeyPressesTest extends TestSuperClass{
	//http://the-internet.herokuapp.com/key_presses?
	
	
	
	@Test
	public void keyPressesTest() {
	
	boolean actualResult = new KeyPressesPageObject(driver, url) 
			.openKeyPressesPage()
			.handleKeyPresses();
	
		Assert.assertTrue(actualResult, "Something went wrong on KeyPresses test !!!");
		System.out.println("KeyPresses test has been executed successfully !!!");
		
}
}
