package com.qadiaries.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath =  "/html/body/div[2]/div/div/button")
	WebElement closeBtn;

	@FindBy(className = "_3704LK")
	WebElement searchEdit;

	@FindBy(className = "L0Z3Pu")
	WebElement searchBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickCloseBtn() {
		//if (closeBtn.isDisplayed()) {
			closeBtn.click();
		//}
	}

	public void searchProduct(String productName) {
		searchEdit.sendKeys(productName);
		searchBtn.click();
	}

}
