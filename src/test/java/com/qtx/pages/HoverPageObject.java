package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class HoverPageObject extends SuperPageObject {

	String url = "/hovers";
	
	public HoverPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public HoverPageObject openHoverPage() {
		return this;
	}
	
	public HoverPageObject moveHoverAndClick() {
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}

	
}
