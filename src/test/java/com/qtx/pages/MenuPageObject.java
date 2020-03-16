package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class MenuPageObject extends SuperPageObject {

	String url = "/jqueryui/menu";
	
	public MenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public MenuPageObject openMenuPage() {
		
		Navigate(url);
		return this;
	}
	
	public MenuPageObject dowloadFile() {
		
		return this;
	}
	
	public MenuPageObject openDownloadedFile() {
		
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}
	
	

}
