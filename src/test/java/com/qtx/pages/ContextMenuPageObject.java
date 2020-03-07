package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class ContextMenuPageObject extends SuperPageObject {

	String url = "/context_menu";
	
	public ContextMenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}
	
	public ContextMenuPageObject ContextMenuPageOpen() {
		
		Navigate(url);
		return this;
	}
	
	public ContextMenuPageObject ContextMenuPageHandle() {
		
		return this;
	}
	
	public boolean ContextMenuWorkVerification() {
		return true;
	}
	
	

}
