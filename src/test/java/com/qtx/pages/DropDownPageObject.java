//create one for each web page

package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPageObject {
	
	WebDriver driver;
	
	public DropDownPageObject(WebDriver driverInstance){
		driver = driverInstance;
	}
	
	public DropDownPageObject OpenDropdownPage() {
		String url = "http://the-internet.herokuapp.com/dropdown";
		driver.get(url);
		return this;
	}
	
	public DropDownPageObject setDropDownList(String value) {

		getDropDown().selectByVisibleText(value);
		return this;
	}
	
	public String getDropDownListValue() {
		
		return getDropDown().getFirstSelectedOption().getText();
		
	}
	
	//maps one UI control, the drop down and the second option.
	public Select getDropDown() {
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		Select customerDropDownList = new Select(dropDown);
		return customerDropDownList;
	}
	
	
}
