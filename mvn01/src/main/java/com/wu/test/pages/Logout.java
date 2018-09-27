package com.wu.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;

	By avtar = By.className("mc-avatar");

	By signOut = By.linkText("Sign out");

	public Logout(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignOut() {
		driver.findElement(signOut).click();
	}

	public void clickAvtar() {
		driver.findElement(avtar).click();
	}

}
