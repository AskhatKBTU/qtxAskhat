package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageObject extends SuperPageObject {
	
	String url = "/dynamic_loading/1";
	WebDriverWait wait=new WebDriverWait(driver, 10);

	public DynamicLoadingPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public DynamicLoadingPageObject openDynamicLoadingPage() {
		Navigate(url);
		return this;
	}

	public boolean handleDynamicLoading() {
	
		
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
	
		WebElement waitText = wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Hello World!")));
	
		
		System.out.println(waitText.getText());
		
		return true;
	}


}
