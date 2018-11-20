package com.capgemini.mrchecker.selenium.store;

import org.openqa.selenium.By;

import com.capgemini.mrchecker.selenium.core.BasePage;

public class ResultsPage extends BasePage {
	
	public static final By	selectorAddToCart	= By.cssSelector("input.wpsc_buy_button");
	public static final By	selectorReturnHome	= By.cssSelector("#menu-item-15 a");
	
	@Override
	public boolean isLoaded() {
		// TASK Auto-generated method stub
		return false;
	}
	
	@Override
	public void load() {
		// TASK Auto-generated method stub
		
	}
	
	@Override
	public String pageTitle() {
		// TASK Auto-generated method stub
		return null;
	}
	
	public void clickAddToCart() {
		getDriver().findElementDynamic(selectorAddToCart)
				.click();
	}
	
	public MainPage clickReturnHomeButton() {
		getDriver().findElementDynamic(selectorReturnHome)
				.click();
		
		return new MainPage();
	}
	
}
