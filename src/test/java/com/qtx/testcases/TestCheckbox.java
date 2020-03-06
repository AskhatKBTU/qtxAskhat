package com.qtx.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.CheckBoxPageObject;

public class TestCheckbox extends TestSuperClass {

	@Test
	void test() {
		List<WebElement> checkboxes = new CheckBoxPageObject(driver, url)
				.navigate("checkboxes")
				.getCheckbox()
				.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement element : checkboxes) {
			boolean wasSelected = element.isSelected();
			element.click();
			Assert.assertTrue(wasSelected != element.isSelected(), "Clicking the button did nothing.");
			System.out.println("Clicked on checkbox successfully.");
		}
	}

}
