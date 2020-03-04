import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TheInternet extends TestSuperClass {


	// As a User
		// I want to login
		// So users can do staff
	@BeforeTest
	public void navigateTo () {
		String url = "http://the-internet.herokuapp.com/login";
		driver.navigate().to(url);
	}
	
	
	@Test
	public void canLogin () {
		
		//Arrange
		String userName = new String("tomsmith");
		String password = new String("SuperSecretPassword!");
		//Act
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.tagName("button"));
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		submit.click();
		//Assert
		WebElement greenBox = driver.findElement(By.id("flash"));
		String expectedText = new String("You logged into a secure area\nx");
		String greenBoxText = new String(greenBox.getText());
		System.out.println(greenBoxText);
		Assert.assertEquals(greenBoxText, expectedText, "Cannot login!!!");
		
	}
	
	
	
	//As a user
	// I want to select option 2 from the dropdown list
	//So that some option is selected
	
	@Test
	public void dropdownSelect() {
		
		driver.get("http://the-internet.herokuapp.com/dropdown");
		//Arrange
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select select = new Select(dropdown);
		//Act
		select.selectByVisibleText("Option 2");
		//Assert
		WebElement dropdownOptionText = driver.findElement(By.id("flash"));
		String dropdownExpectedText = new String("Option 2");
		String dropdownActualText = new String(dropdownOptionText.getText());
		Assert.assertEquals(dropdownActualText, dropdownExpectedText, "Cannot login!!!");
		
	}
	

	

}
