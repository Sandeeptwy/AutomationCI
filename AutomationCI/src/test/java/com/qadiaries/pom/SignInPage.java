package com.qadiaries.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	@FindBy(id = "")
	WebElement singInTitle;

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public Boolean validateTitle(WebDriver driver) {
		return driver.getTitle().equalsIgnoreCase("Amazon Sign In");
	}

}
