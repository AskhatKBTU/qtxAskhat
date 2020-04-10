package com.qtx.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPageObject extends SuperPageObject {
	
String url = "/floating_menu";
	
	public FloatingMenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}


	public FloatingMenuPageObject openFloatingMenuPage() {
		Navigate(url);
		return this;
	}
	
	public FloatingMenuPageObject handleFloatingMenu() {

		return this;
	}
	
	
	public boolean getConfirmation() {
		return true;
	}

}
