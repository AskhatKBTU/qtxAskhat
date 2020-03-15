package com.qtx.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAlertPageObject extends SuperPageObject {

	String url = "/javascript_alerts";
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	By jsBtn1Locator = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
	By jsBtn2Locator = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
	By jsBtn3Locator = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
	


	
	
	public JSAlertPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}
	
	public WebElement findElement(By locator) {
		  return 
			wait.until(ExpectedConditions.
			  elementToBeClickable(locator));
		}
	
	public JSAlertPageObject OpenJSAlertPage() {	
		Navigate(url);
		return this;
	}
	
	public JSAlertPageObject ClickAndHandleJS() {
		findElement(jsBtn1Locator);
		driver.findElement(jsBtn1Locator).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		findElement(jsBtn2Locator);
		driver.findElement(jsBtn2Locator).click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		findElement(jsBtn3Locator);
		driver.findElement(jsBtn3Locator).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys(url);
		promptAlert.accept();
		return this;
	}
	
	public boolean GetVerificationOnJSAlerts() {
		String actualResult = driver.findElement(By.id("result")).getText();
		String expectedResult = "You entered: "+ url;
		if (actualResult.contentEquals(expectedResult)) {
		return true;
		}
		else
		return false;
	}
	
}
