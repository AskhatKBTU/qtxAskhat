package com.qtx.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EntryAdPageObject extends SuperPageObject {

	String url = "/entry_ad";

	public EntryAdPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public EntryAdPageObject openEntryAdPage() {
		Navigate(url);
		return this;
	}

	public boolean handleEntryAd() {

		driver.switchTo().activeElement().findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
		driver.switchTo().defaultContent();
		Assert.assertEquals(driver.getTitle(), "The Internet");
		return true;
	}



}
