package com.qtx.driver;

public class DriverManagerFactory {

	public static DriverManager getManager(String browserType) {
		
		if(browserType.equals(BrowserTypes.Chrome)) {
			return new ChromeDriverManager();
		}
		
		if(browserType.equals(BrowserTypes.Firefox)) {
			return new FirefoxDriverManager();
		}
		
		if(browserType.equals(BrowserTypes.Opera)) {
			return new OperaDriverManager();
		}
			
		throw new RuntimeException(browserType + " is not a supported browser.");
	}
}