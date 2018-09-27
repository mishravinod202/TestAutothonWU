package com.wu.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By userName = By.name("login_email");

	By password = By.name("login_password");

	By titleText = By.className("barone");

	By btn_login = By.cssSelector("button.login-button");

	By login = By.name("btnLogin");

	public Login(WebDriver driver) {

		this.driver = driver;

	}

	public void setUserName(String strUserName) {

		driver.findElement(userName).sendKeys(strUserName);

	}

	public void setPassword(String strPassword) {

		driver.findElement(password).sendKeys(strPassword);

	}

	// Click on login button

	public void clickLogin() {

		driver.findElement(btn_login).click();

	}

	// Get the title of Login Page

	public String getLoginTitle() {

		return driver.findElement(titleText).getText();

	}

	public void quitBrowser() {
		driver.quit();
	}

}
