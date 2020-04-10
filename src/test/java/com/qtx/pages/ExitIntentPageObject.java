package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class ExitIntentPageObject extends SuperPageObject {
String url = "/exit_intent";
	
	public ExitIntentPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}


	public ExitIntentPageObject openExitIntentPage() {
		Navigate(url);
		return this;
	}
	
	public ExitIntentPageObject handleExitIntent() {

		return this;
	}
	
	
	public boolean getConfirmation() {
		return true;
	}

}
