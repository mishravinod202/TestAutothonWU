package com.wu.test.utils;

import org.openqa.selenium.WebDriver;

public class Reporting {

	public String REPORT_TYPE;

	WebDriver wd;

	public Reporting(String reportType) {
		REPORT_TYPE = reportType;
	}

	public void logPassStep(String message) {

	}

	public void logFailedStep(String message) {

	}

}
