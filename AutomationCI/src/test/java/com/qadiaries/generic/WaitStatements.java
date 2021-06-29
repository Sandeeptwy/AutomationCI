package com.qadiaries.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitStatements {

	public static void hardWait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void implicitWait(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
