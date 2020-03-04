import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuperClass {

	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeTest() {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
	}
	
	@AfterSuite

	public void afterTest() {
		driver.quit();

	}


	
}
