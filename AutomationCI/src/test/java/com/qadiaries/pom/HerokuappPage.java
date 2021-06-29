package com.qadiaries.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappPage {

	@FindBy(xpath = "//input[@type='range']")
	protected WebElement slider;
	
	@FindBy(id = "range")
	protected WebElement sliderNumber;

	public HerokuappPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSlider() {
		return slider;
	}
	
	public WebElement getSliderNumber() {
		return sliderNumber;
	}
}
