import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
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
  
  
@AfterTest

	  public void afterTest() {
			driver.quit();
		  
	  }	
  @Test
  public void myFirstTest() {
	System.out.println("Hello World");
	}
  

  
  @Test
  public void launchChromeDriver() {
	  
	  	
		
		Assert.assertEquals(driver.getTitle(),"Google", "an Incorrect match");
		
  }

}
