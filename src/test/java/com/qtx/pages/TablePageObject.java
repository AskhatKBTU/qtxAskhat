package com.qtx.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePageObject extends SuperPageObject {

	String url = "/tables";
	
	public TablePageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}
	
	public TablePageObject openTablePage() {
		Navigate(url);
		return this;
	}
	

	public String getCellData() {

			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WebElement baseTable = driver.findElement(By.id("table1"));
			  
			 List <WebElement> cells = baseTable.findElements(By.tagName("tr"));
			 
			 
			 String data = null;
			 
			 for (WebElement cell : cells) {
				 if (cell.getText().startsWith("Doe")) {
					data = cell.getText();
			 }		
				
			 }
			 
			 
			    return data;

	    }
	
	public boolean getConfirmation() {
		return true;
	}

}
