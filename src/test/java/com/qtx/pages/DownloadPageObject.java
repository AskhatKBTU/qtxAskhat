package com.qtx.pages;

import org.openqa.selenium.WebDriver;

public class DownloadPageObject extends SuperPageObject {
	
	String url = "/download";
	
	public DownloadPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}


	public DownloadPageObject openDowloadPage() {
		Navigate(url);
		return this;
	}
	
	public DownloadPageObject downloadFile() {
		return this;
	}
	
	public DownloadPageObject readDownloadedFile() {
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}

}
