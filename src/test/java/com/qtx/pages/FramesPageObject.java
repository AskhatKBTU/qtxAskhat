package com.qtx.pages;

import java.util.ArrayList;
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
	
	
	public boolean getTextFromAllFrames() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ArrayList<WebElement> frames = new ArrayList<WebElement> (driver.findElements(By.tagName("frame")));
	    driver.switchTo().frame(frames.get(0));
	    System.out.println(driver.findElement(By.tagName("body")).getText());
	    driver.switchTo().frame(frames.get(1));
	    System.out.println(driver.findElement(By.tagName("body")).getText());
	    driver.switchTo().frame(frames.get(2));
	    System.out.println(driver.findElement(By.tagName("body")).getText());
	    driver.switchTo().frame(frames.get(3));
	    System.out.println(driver.findElement(By.tagName("body")).getText());

		return true;
	}
	


	
	
	
}