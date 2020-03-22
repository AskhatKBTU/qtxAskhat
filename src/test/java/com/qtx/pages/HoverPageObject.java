package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverPageObject extends SuperPageObject {

	String url = "/hovers";
	
	public HoverPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public HoverPageObject openHoverPage() {
		Navigate(url);
		return this;
	}
	
	public HoverPageObject moveHoverAndClick() {
		WebElement userProfile3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
		new Actions(driver).moveToElement(userProfile3).perform();
		WebElement userProfile3Page = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div/div[3]/div/a")));
		new Actions(driver).moveToElement(userProfile3Page).click().perform();
		return this;
	}
	
	public boolean getConfirmation() {
		WebElement newPageText = new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
		String correctUrl = "http://the-internet.herokuapp.com/users/3";
		String actualUrl = driver.getCurrentUrl();
		if (correctUrl.equals(actualUrl)) 
		return true;
		else
		return false;
	}

	
}
