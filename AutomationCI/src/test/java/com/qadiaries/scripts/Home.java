package com.qadiaries.scripts;

import java.awt.Desktop.Action;
import java.util.Scanner;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.qadiaries.generic.ActionHeper;
import com.qadiaries.generic.BasicLib;
import com.qadiaries.generic.ReadTestData;
import com.qadiaries.generic.WaitStatements;
import com.qadiaries.pom.CartPage;
import com.qadiaries.pom.HerokuappPage;
import com.qadiaries.pom.HomePage;
import com.qadiaries.pom.ProductPage;
import com.qadiaries.pom.SearchPage;
import com.qadiaries.pom.SignInPage;

public class Home extends BasicLib {

	HomePage homePage;
	SearchPage searchPage;
	ProductPage productPage;
	CartPage cartPage;
	SignInPage singInPage;
	HerokuappPage heroPage;

	@Test(enabled = true)
	public void tc1_validateNumber() {
		heroPage = new HerokuappPage(driver);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Odd number");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			throw new SkipException("Wrong Input entered");
		}

		Actions ac = new Actions(driver);
		ac.clickAndHold(heroPage.getSlider()).moveByOffset(18, 18).perform();

		WaitStatements.hardWait(20);

		Assert.assertSame(Integer.parseInt(heroPage.getSliderNumber().getText()), num, "Values didn't matched");
	}

	@Test(enabled = true)
	public void tc2_printProducts() {
		driver.get("https://flipkart.com");
		WaitStatements.implicitWait(driver, 20);
		homePage = new HomePage(driver);
		searchPage = new SearchPage(driver);
		productPage = new ProductPage(driver);
		cartPage = new CartPage(driver);
		singInPage = new SignInPage(driver);

		homePage.clickCloseBtn();
		homePage.searchProduct("boat speaker");
		searchPage.readProduct();

	}
}
