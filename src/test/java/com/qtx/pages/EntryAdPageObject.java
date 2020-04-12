package com.qtx.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	public EntryAdPageObject handleEntryAd() {

		driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
		return this;
	}

	public boolean getConfirmation() {
		return true;
	}

}
