package com.capgemini.mrchecker.selenium.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.capgemini.mrchecker.selenium.core.BasePage;

public class MainPage extends BasePage {
	
	private static final By	selectorProductSearch	= By.cssSelector("input.search");
	private static final By	selectorCart			= By.cssSelector("a.cart_icon");
	
	@Override
	public boolean isLoaded() {
		return getDriver().getTitle()
				.equals(pageTitle());
	}
	
	@Override
	public void load() {
		getDriver().get("http://store.demoqa.com/");
		
	}
	
	@Override
	public String pageTitle() {
		return "ONLINE STORE | Toolsqa Dummy Test site";
	}
	
	public ResultsPage searchProduct(String searchedProduct) {
		WebElement webElement = getDriver().findElementDynamic(selectorProductSearch);
		
		webElement.sendKeys(searchedProduct);
		webElement.submit();
		
		return new ResultsPage();
	}
	
	public CartPage clickCartButton() {
		getDriver().findElementDynamic(selectorCart)
				.click();
		
		return new CartPage();
	}
	
	public void closeBrowser() {
		getDriver().close();
	}
	
}
