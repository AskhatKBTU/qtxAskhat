package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ExitIntentPageObject extends SuperPageObject {
String url = "/exit_intent";
	
	public ExitIntentPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}


	public ExitIntentPageObject openExitIntentPage() {
		Navigate(url);
		return this;
	}
	
	public boolean handleExitIntent() {
		Actions action = new Actions(driver);
		action.moveByOffset(100, 100).perform();
		driver.switchTo().activeElement().findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]/div[3]/p")).click();
		driver.switchTo().defaultContent();
		Assert.assertEquals(driver.getTitle(), "The Internet");
		return true;
	}
	
	

}
