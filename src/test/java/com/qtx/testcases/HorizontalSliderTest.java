package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.HorizontalSliderPageObject;

public class HorizontalSliderTest extends TestSuperClass {

	//As a User 
	// I want to move the slider to the max value
	// So I can prove that I know how the Actions builder works
	
	@Test
	public void HorizontalSliderMove() {
			//Arrange
			double expectedSliderResult = 5.0;
			//Act
			double actualSliderResult = new HorizontalSliderPageObject(driver, url)
					.OpenHorizontalSliderPage()
					.MoveHorizontalSlider()
					.VerifyHorizontalSlider();
			//Assert
			Assert.assertEquals(actualSliderResult, expectedSliderResult, "Something went wrong !!!");
		
	}
	
}
