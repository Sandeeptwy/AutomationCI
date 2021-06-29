package com.qadiaries.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath = "//span[@id='submit.add-to-cart-announce']")
	WebElement addToCartBtn;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickAddtoCart(){
		addToCartBtn.click();		
	}
	

}
