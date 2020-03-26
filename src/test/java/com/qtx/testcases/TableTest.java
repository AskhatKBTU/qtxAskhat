package com.qtx.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.driver.TestSuperClass;
import com.qtx.pages.TablePageObject;

public class TableTest extends TestSuperClass {

	@Test
	public void getDataFromCell() {


		String rowData = new TablePageObject(driver,url)
				.openTablePage()
				.getCellData();
		
		char[] dueAmountArray =  rowData.toCharArray();
		
		for (int i = 0; i<dueAmountArray.length; i++) {
			if (dueAmountArray[i]=='$') {
				System.out.println("DueAmount is equal to: " +dueAmountArray[i]+dueAmountArray[i+1]+dueAmountArray[i+2]+dueAmountArray[i+3]);
			}
		}
	}
	
}
