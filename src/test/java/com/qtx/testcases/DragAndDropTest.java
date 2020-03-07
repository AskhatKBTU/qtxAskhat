package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.DragAndDropPageObject;

public class DragAndDropTest extends TestSuperClass {
	
	@Test
	public void DragAndDropTest() {
		//Arrange
		
		//Act
	boolean dragSuccess = true;	
    boolean dragActual = new DragAndDropPageObject(driver, url)
    		.OpenDragAndDropPage()
    		.DragAndDropAction()
    		.DragAndDropVerification();
 
		//Assert
		Assert.assertEquals(dragActual, dragSuccess, "Drag and Drop failed!");
		System.out.println("Hello Check!");
		
	}

}
