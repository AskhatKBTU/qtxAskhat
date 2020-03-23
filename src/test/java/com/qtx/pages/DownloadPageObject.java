package com.qtx.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPageObject extends SuperPageObject {
	
	String url = "/download";
	
	public DownloadPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}


	public DownloadPageObject openDowloadPage() {
		Navigate(url);
		return this;
	}
	
	public DownloadPageObject downloadFile() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[3]")).click();
		return this;
	}
	
	
	public boolean getConfirmationAndPrint() throws FileNotFoundException {
		File tempFile = new File("/Users/user/Downloads/test.txt");	
		boolean exists = tempFile.exists();
		if(exists) {
			 Scanner sc = new Scanner(tempFile); 
			    while (sc.hasNextLine()) 
			      System.out.println(sc.nextLine()); 
		}
		return exists;
	}
	
	public DownloadPageObject readDownloadedFile() {
		
		return this;
	}


}
