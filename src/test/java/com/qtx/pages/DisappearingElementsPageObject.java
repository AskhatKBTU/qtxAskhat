package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisappearingElementsPageObject extends SuperPageObject {

	
	String url = "/disappearing_elements";
	int a = 0;
	int b = 0;
	public DisappearingElementsPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public DisappearingElementsPageObject openDisappearingElementsPage() {
		Navigate(url);
		return this;
	}
	

	public DisappearingElementsPageObject handleDisappearingElements() {
		
		
		for (int i = 0; i<10; i++) {
		
		if (driver.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li[5]/a")).size() > 0) {
			driver.navigate().refresh();
			a++;
		}
		else  {
			driver.navigate().refresh();
			b++;
		}
		}
	
		return this;
	}



	public boolean getConfirmation() {
		if (a>0 && b>0) {
		return true;
		}
		else
		return false;
	}



}
