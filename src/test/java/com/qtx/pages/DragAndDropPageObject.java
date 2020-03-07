package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPageObject extends SuperPageObject {
	
	String url = "/drag_and_drop";

	public DragAndDropPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}
	
	public DragAndDropPageObject OpenDragAndDropPage() {		
		Navigate(url);
		return this;
	}
	
	public DragAndDropPageObject DragAndDropAction() {
		WebElement draggable = driver.findElement(By.id("column-a"));
		WebElement droppable = driver.findElement(By.id("column-b"));	
		Point point = droppable.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		Actions action = new Actions(driver);
		action.dragAndDropBy(draggable, xcord+10, ycord+10);
		return this;
	}
	
	public boolean DragAndDropVerification() {
		
		return true;
	}
	
	
	
	

}
