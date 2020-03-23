package com.qtx.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
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
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.findElement(By.tagName("body")).getText());
		//Close current tab
		driver.close();
	    driver.switchTo().window(tabs2.get(0));
		return this;
	}
	
	public boolean getConfirmation () {
		if (driver.getTitle().contentEquals("The Internet"))
			return true;
		else 
			return false;
	}
	



}
