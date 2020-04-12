package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KeyPressesPageObject extends SuperPageObject {
	
	String url = "/key_presses?";
	WebDriverWait wait;
	
	@FindBy(id="result")
	WebElement result;
	

	public KeyPressesPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public KeyPressesPageObject openKeyPressesPage() {
		Navigate(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}

	public boolean handleKeyPresses() {
		
		//ENTER PRESS
		
		new Actions(driver).sendKeys(Keys.ENTER).perform();;
		WebElement firstResult = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.id("result")));
		
		
		String enter = driver.findElement(By.id("result")).getText();

		Assert.assertEquals(enter, "You entered: ENTER");
		
		//TAB PRESS
		
		new Actions(driver).sendKeys(Keys.TAB).perform();;
		
		WebElement secondResult = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.id("result")));	
		
		String tab = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(tab, "You entered: TAB");
		
		//ESCAPE PRESS
		
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();;
		
		WebElement thirdResult = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.id("result")));	
		String escape = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(escape, "You entered: ESCAPE");
		
		System.out.println(driver.findElement(By.id("result")).getText());
		return true;
	}



}
