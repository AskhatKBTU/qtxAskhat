package com.qtx.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRemoveElementPageObject extends SuperPageObject {
	
	String url = "/add_remove_elements/";
	WebDriverWait wait;

	public AddRemoveElementPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public AddRemoveElementPageObject openAddRemoveElementPage() {
		Navigate(url);
		return this;
	}

	public AddRemoveElementPageObject addElement() {
		

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();		 
		return this;
	}
	
	public boolean removeElement() {
		System.out.println(driver.findElement(By.className("added-manually")).getText());	
		driver.findElement(By.className("added-manually")).click();
		
		return true;
	}



}
