package com.qtx.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InputsPageObject extends SuperPageObject {

	String url = "/inputs";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	public WebElement inputsObject;

	
	
	By inputsLocator = By.tagName("input");
	By inputsTextLocator = By.cssSelector("$0");
	
     public InputsPageObject(WebDriver driverInstance, String url) {
		
		super(driverInstance, url);
		
	}
     
     public WebElement findElement(By locator) {
		  return 
			wait.until(ExpectedConditions.
			  elementToBeClickable(locator));
		}
     
     public Boolean assertElement (By locator, String expectedText) {
    	 return 
    	    wait.until(ExpectedConditions.textToBe(locator, expectedText));
     }
   

	public InputsPageObject OpenInputsPage() {
		Navigate(url);
		return this;
	}
	
	public InputsPageObject InputsTestProcess(String data) {
		inputsObject = findElement(inputsLocator);
		inputsObject.sendKeys(data);
		String actualData = inputsObject.getAttribute("value");
		inputsObject.clear();
	    Assert.assertEquals(actualData, data, "Something went wrong!");
		return this;
	}
	
	
	public boolean InputsVerification(String data) {	  
		return true;
	}
	
	
	
}
