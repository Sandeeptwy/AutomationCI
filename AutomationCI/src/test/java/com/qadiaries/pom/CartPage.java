package com.qadiaries.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy(id = "hlb-ptc-btn")
	WebElement proceedToCheckout;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickproceedToCheckout(){
		proceedToCheckout.click();		
	}
	
}
