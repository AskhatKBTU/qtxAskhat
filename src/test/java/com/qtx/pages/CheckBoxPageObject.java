package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qtx.extensions.CheckboxGroup;
import com.qtx.extensions.Checkbox;


public class CheckBoxPageObject extends SuperPageObject{

	public CheckBoxPageObject (WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	// this is an alternative to using the Page Factory
	private By checkboxGroup = By.id("checkboxes");

	public CheckBoxPageObject navigate() {
		super.Navigate("/checkboxes");

		return this;
	}

	private WebElement getCheckbox(int index) {	
		return driver.findElements(By.cssSelector("input[type='checkbox']")).get(index);
	}

	public CheckBoxPageObject setCheckbox1(boolean isChecked) {	
		setCheckbox(0, isChecked);

		return this;
	}

	public CheckBoxPageObject setCheckbox2(boolean isChecked) {
		setCheckbox(1, isChecked);

		return this;
	}

	private void setCheckbox(int index, boolean shouldBeChecked) {
		WebElement checkBox =  getCheckbox(index); 		
		boolean isChecked = checkBox.isSelected();

		if((shouldBeChecked && !isChecked) || (!shouldBeChecked && isChecked)) {
			checkBox.click(); 		
		}
	}

	public boolean getCheckbox1Checked() {

		return getCheckbox(0).isSelected(); 
	}	

	public boolean getCheckbox2Checked() {

		return getCheckbox(1).isSelected();
		
	}	
}