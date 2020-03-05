package com.qtx.testcases;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "http://google.com";
		driver.navigate().to(url);
	}

	@Test
	public void myFirstTest() {
		System.out.println("Hello World");
		File imageCheck = new File("/Users/user/Documents/spravka.jpg");
		if (imageCheck.exists())
		    System.out.println("Image file found!");
		else
		   System.out.println("Image doesn't exists");
	}

	@AfterTest

	public void afterTest() {
		driver.quit();

	}

	@Test
	public void launchChromeDriver() {

		Assert.assertEquals(driver.getTitle(), "Google", "an Incorrect match");

		}

}
