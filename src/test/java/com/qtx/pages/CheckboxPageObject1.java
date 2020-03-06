package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckboxPageObject1  {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"checkboxes\"]/input[1]")
	public WebElement checkbox1;
	@FindBy(xpath="//*[@id=\"checkboxes\"]/input[2]")
	public WebElement checkbox2;
	
	//public boolean isCheck = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
	
	
	public CheckboxPageObject1(WebDriver driverInstance){
		driver = driverInstance;
	}
	
	public CheckboxPageObject1 OpenCheckboxPage() {
		String url = "http://the-internet.herokuapp.com/checkboxes";
		driver.get(url);
		return this;
	}
	
	
	
	/* public CheckboxPageObject makeCheckboxActive() {
		if (checkbox1.isSelected()==false)
		{
		checkbox1.click();
		}
		return this;
	} */
	
	public boolean isChecked(boolean isCheck1) {
		
		
		return isCheck1;
	}
	
	
	
}
