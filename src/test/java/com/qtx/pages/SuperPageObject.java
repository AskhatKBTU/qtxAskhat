package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qtx.extensions.CheckboxGroup;
import com.qtx.extensions.Checkbox;

public abstract class SuperPageObject {

	protected WebDriver driver;
	private String bassUrl;
	
	protected SuperPageObject(WebDriver driverInstance, String baseUrl) {
		
		driver = driverInstance;
		PageFactory.initElements(driver, this);
		bassUrl = baseUrl;
	}
	
	protected void Navigate(String url) {
			
		driver.get(bassUrl + url);
		
	}
	
	public Select getSelect(WebElement element) {
		return new Select(element);
	}

	public CheckboxGroup getCheckboxGroup(By locator) {
		return new CheckboxGroup(driver.findElement(locator));
	}
	

}
