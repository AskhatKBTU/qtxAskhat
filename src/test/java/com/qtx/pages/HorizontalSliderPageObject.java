package com.qtx.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HorizontalSliderPageObject extends SuperPageObject {

	public HorizontalSliderPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	String url = "/horizontal_slider";
	WebDriverWait wait = new WebDriverWait(driver, 10);

	By SliderLocator  = By.xpath("//*[@id=\"content\"]/div/div/input");

	public WebElement findElement(By locator) {
		  return 
			wait.until(ExpectedConditions.
			  elementToBeClickable(locator));
		}

	
	public HorizontalSliderPageObject OpenHorizontalSliderPage() {
		
		Navigate(url);
		return this;
	}
	
	public HorizontalSliderPageObject MoveHorizontalSlider() {
		
		WebElement priceSlider = 
				   findElement(SliderLocator);
		
		assertTrue(priceSlider.isDisplayed());
		
		Dimension sliderSize = priceSlider.getSize();
		int sliderWidth = sliderSize.getWidth();
		
		int xCoord = priceSlider.getLocation().getX();
						
		Actions builder = new Actions(driver);   
		builder.moveToElement(priceSlider)
			   .click()
			   .dragAndDropBy
			     (priceSlider,xCoord + sliderWidth, 0)
			   .build()
			   .perform();
		return this;
	}

	
	public double VerifyHorizontalSlider() {
		return 0;
	}
}
