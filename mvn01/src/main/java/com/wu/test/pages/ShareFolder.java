package com.wu.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShareFolder {
	WebDriver driver;
	
	By lnk_MyFiles= By.linkText("My files");
	
	
	public ShareFolder(WebDriver driver) {
		this.driver=driver;
	}
}
