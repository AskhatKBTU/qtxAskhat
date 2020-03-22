package com.qtx.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPageObject extends SuperPageObject {

	String url = "/jqueryui/menu";
	WebDriverWait wait;
	By categories = By.id("ui-id-2");
	By downloads = By.id("ui-id-4");
	By excelFile = By.id("ui-id-8");

	public MenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public WebElement findElement(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public MenuPageObject openMenuPage() {

		Navigate(url);
		return this;
	}

	public MenuPageObject dowloadFile() {
//Instantiate Action Class     
		//findElement(categories);
		WebElement menuOption = driver.findElement(By.id("ui-id-2"));
		new Actions(driver).moveToElement(menuOption).perform();
		WebElement subMenuOption = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("ui-id-4")));
		new Actions(driver).moveToElement(subMenuOption).perform();
		WebElement clickMenuOption = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("ui-id-8")));
		clickMenuOption.click();
		System.out.println("Selected 'Alternative' from Menu");
		return this;
	}

	public boolean getConfirmation() {
		File tempFile = new File("/Users/user/Downloads/menu.xls");	
		boolean exists = tempFile.exists();
		return exists;
	}	

}
