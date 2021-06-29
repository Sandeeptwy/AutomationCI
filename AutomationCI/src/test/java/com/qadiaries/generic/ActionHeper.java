package com.qadiaries.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionHeper {

	static WebDriver driver;

	public void setDriver(WebDriver recDriver) {
		driver = recDriver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public static void switchToTab() {
		Set<String> tabs = driver.getWindowHandles();

		Iterator<String> it = tabs.iterator();

		String firstTab = it.next();
		String secondTab = it.next();

		driver.switchTo().window(secondTab);
	}

	public static void switchToFirstTab() {
		driver.switchTo().defaultContent();
	}

	public static void scrollTillElementVisible(WebElement element) {

		for (int i = 0; i < 5; i++) {
			
			try {
			if (element.isDisplayed()) {
				element.click();
			} else {
				scrollPageDown();
			}
			}catch (Exception e) {
				scrollPageDown();
			}
		}
	}

	public static void scrollPageDown() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
