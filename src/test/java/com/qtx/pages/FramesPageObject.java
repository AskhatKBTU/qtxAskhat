package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPageObject extends SuperPageObject {
	
	String url = "/frames";
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public FramesPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}
	

	public FramesPageObject openFramesPage() {
		
		Navigate(url);
		return this;
	}
	
	
	
	public FramesPageObject openNestedFrames() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		return this;
	}
	
	
	public FramesPageObject getTextFromAllFrames() {
		String [] frameNames = {"frame-left","frame-middle","frame-right", "frame-bottom"};
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
			driver.switchTo().frame("frame-left");
			WebElement body = driver.findElement(By.cssSelector("body"));
			System.out.println(body.getText());

		return this;
	}
	
	public boolean getVerificationOnFrames() {
		return true;
	}

	
	
	
}