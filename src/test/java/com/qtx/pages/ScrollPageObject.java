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
		 js.executeScript("scroll(0, 5000);");
		 WebElement firstParagraph = driver.findElement(By.className("jscroll-added"));
		System.out.println(firstParagraph.getText()); 
		return this;
	}
	

	
}
