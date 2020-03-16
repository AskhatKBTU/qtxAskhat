package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class WindowsPageObject extends SuperPageObject {
	
	String url = "/windows";
	
	public WindowsPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	public WindowsPageObject openWindowsPage() {
		Navigate(url);
		return this;
	}
	
	public WindowsPageObject windowsHandleTestProcess() {
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}



}
