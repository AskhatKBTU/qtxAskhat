package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class ScrollPageObject extends SuperPageObject{

	String url = "/infinite_scroll";
	public ScrollPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}
	
	public ScrollPageObject openScrollPage() {
		Navigate(url);
		return this;
	}
	
	public ScrollPageObject printParagraph() {
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}

	
}
