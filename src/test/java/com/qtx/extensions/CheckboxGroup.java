package com.qtx.extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxGroup {

	private WebElement mappedElement;

	public CheckboxGroup(WebElement mappedElement) {
		this.mappedElement = mappedElement;
	}

	public void set(boolean doCheck) {
		if(doCheck != getIsChecked()) {
			mappedElement.click();

			waitUntilIsSelected(doCheck);
		}
	}

	private void waitUntilIsSelected(boolean isSelected) {
		WebDriver driver = ((WrapsDriver)mappedElement).getWrappedDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementSelectionStateToBe(mappedElement, isSelected));
	}

	public boolean getIsChecked() {
		return mappedElement.isSelected();	
	}
}