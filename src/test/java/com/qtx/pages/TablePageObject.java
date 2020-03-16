package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class TablePageObject extends SuperPageObject {

	String url = "/tables";
	
	public TablePageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}
	
	public TablePageObject openTablePage() {
		Navigate(url);
		return this;
	}
	
	public TablePageObject getCellData() {
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}

}
