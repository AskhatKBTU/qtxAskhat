package com.qtx.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.CheckBoxPageObject;

public class CheckboxTest extends TestSuperClass {

	@Test
	public void CanToggleCheckboxes() {
		//arrange
		boolean isChecked1expected = true;
		boolean isChecked2expected = false;

		//act
		CheckBoxPageObject page = new CheckBoxPageObject (driver, url)
			.navigate()
			.setCheckbox1(isChecked1expected)
			.setCheckbox2(isChecked2expected);

		boolean actual1 = page.getCheckbox1Checked();
		boolean actual2 = page.getCheckbox2Checked();

		//assert	
		AssertJUnit.assertEquals(actual1, isChecked1expected);
		AssertJUnit.assertEquals(actual2, isChecked2expected);
	}

}
