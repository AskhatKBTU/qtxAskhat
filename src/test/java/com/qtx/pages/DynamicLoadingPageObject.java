package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DynamicLoadingPageObject extends SuperPageObject {
	
	String url = "/dynamic_loading/2";
	

	public DynamicLoadingPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public DynamicLoadingPageObject openDynamicLoadingPage() {
		Navigate(url);
		return this;
	}

	public boolean handleDynamicLoading() {
		
		driver.findElement(By.cssSelector("button")).click();
	
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeSelected(By.id("finish")));
		
		Assert.assertEquals(driver.findElement(By.id("finish")).getText(), "Hello World!");
		
		return true;
	
	}
	


}
