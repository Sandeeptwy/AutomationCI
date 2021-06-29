package com.qadiaries.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.qadiaries.generic.ActionHeper;

public class SearchPage {

	@FindBys(@FindBy(className = "s1Q9rs"))
	List<WebElement> product;

	@FindBy(className = "_30jeq3")
	List<WebElement> productPrize;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void readProduct() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Product Name: "+product.get(i).getText()+"Prize"+productPrize.get(i).getText());
		}
	}
}
