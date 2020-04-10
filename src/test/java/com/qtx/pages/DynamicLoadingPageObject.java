package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class DynamicLoadingPageObject extends SuperPageObject {
	
	String url = "/dynamic_loading";

	public DynamicLoadingPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public DynamicLoadingPageObject openDynamicLoadingPage() {
		Navigate(url);
		return this;
	}

	public DynamicLoadingPageObject handleDynamicLoading() {

		return this;
	}

	public boolean getConfirmation() {
		return true;
	}

}
