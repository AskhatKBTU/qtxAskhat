package com.qtx.driver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

	

		driver = new FirefoxDriver(options);
	}
	


}
