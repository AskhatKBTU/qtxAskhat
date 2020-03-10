package com.qtx.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.data.DataProviderClass;
import com.qtx.driver.TestSuperClass;
import com.qtx.pages.CheckBoxPageObject;
import com.qtx.pages.InputsPageObject;

public class InputsTest extends TestSuperClass {

	@Test
	void open() {
		InputsPageObject inputs = new InputsPageObject(driver, url)
				.OpenInputsPage();
	}
	
	@Test (dataProvider ="data-provider-inputs", dataProviderClass = DataProviderClass.class)
	void test(String data) {
		boolean inputsVerify = new InputsPageObject(driver,url)
				.InputsTestProcess(data)
				.InputsVerification(data);
		Assert.assertTrue(inputsVerify);
	} 

}
