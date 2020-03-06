package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPageObject extends SuperPageObject {

	
	
     public CheckBoxPageObject(WebDriver driverInstance, String url) {
		
		super(driverInstance, url);
		
	}

	public CheckBoxPageObject navigate(String path) {
		String url = "http://the-internet.herokuapp.com/checkboxes";
		driver.navigate().to(url);
		return this;
	}
	
	public WebElement getCheckbox() {
		return driver.findElement(By.id("checkboxes"));
	}
	
}
