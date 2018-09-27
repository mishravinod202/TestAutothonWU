package com.wu.test.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wu.test.pages.Login;
import com.wu.test.pages.Logout;

public class LoginTest {

	WebDriver driver;

	Login objLogin;

	// DropBox objHomePage;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\WebDrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.dropbox.com/login");
	}

	@Test
	public void login() {
		Login loginTest = new Login(driver);
		Logout logoutTest = new Logout(driver);
		loginTest.setUserName("mishravinod202@hotmail.com");
		loginTest.setPassword("mish909202");
		loginTest.clickLogin();

		logoutTest.clickAvtar();
		logoutTest.clickSignOut();

	}

}
