package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollPageObject extends SuperPageObject{
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	String url = "/infinite_scroll";
	public ScrollPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}
	
	public ScrollPageObject openScrollPage() {
		Navigate(url);
		return this;
	}
	
	public ScrollPageObject printParagraph() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[4]/text()"));
		  js.executeScript("arguments[0].scrollIntoView(true);", element);
		 System.out.println(element.getText());
		 
		return this;
	}
	
	public boolean getConfirmation() {
		return true;
	}

	
}
