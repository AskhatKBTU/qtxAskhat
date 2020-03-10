package com.qtx.data;

import org.testng.annotations.DataProvider;;

public class DataProviderClass {
	
	@DataProvider (name = "data-provider-inputs")
	public Object [][] dataProviderMethod() {
		return new Object[][] {
			{ "1" }, {"2"}, {"3"}, {"4"}, {"5"}
		};
	}

}
