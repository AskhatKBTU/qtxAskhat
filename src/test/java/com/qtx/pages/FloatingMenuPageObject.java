package com.qtx.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FloatingMenuPageObject extends SuperPageObject {
	
String url = "/floating_menu";
	
	public FloatingMenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}


	public FloatingMenuPageObject openFloatingMenuPage() {
		Navigate(url);
		return this;
	}
	
	public boolean handleFloatingMenu() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/floating_menu#about");
		return true;
	}
	
	
}
