package com.qtx.pages;

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

		return this;
	}

	public boolean getConfirmation() {
		return true;
	}

}
