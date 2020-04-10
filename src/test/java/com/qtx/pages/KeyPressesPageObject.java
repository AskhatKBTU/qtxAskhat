package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class KeyPressesPageObject extends SuperPageObject {
	
	String url = "/key_presses?";

	public KeyPressesPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public KeyPressesPageObject openKeyPressesPage() {
		Navigate(url);
		return this;
	}

	public KeyPressesPageObject handleKeyPresses() {

		return this;
	}

	public boolean getConfirmation() {
		return true;
	}


}
