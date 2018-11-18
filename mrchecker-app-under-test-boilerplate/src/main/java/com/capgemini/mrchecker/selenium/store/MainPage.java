package com.capgemini.mrchecker.selenium.store;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.capgemini.mrchecker.selenium.core.BasePage;

public class MainPage extends BasePage {
	
	private static final By	selectorSelectWomen		= By.cssSelector("ul.sf-menu>li:nth-child(1)");
	private static final By	selectorSelectDresses	= By.cssSelector("ul.sf-menu>li:nth-child(2)");
	private static final By	selectorSelectTshirts	= By.cssSelector("ul.sf-menu>li:nth-child(3)");
	
	@Override
	public boolean isLoaded() {
		// TASK Auto-generated method stub
		return false;
	}
	
	@Override
	public void load() {
		getDriver().get("http://automationpractice.com/index.php");
		
	}
	
	@Override
	public String pageTitle() {
		// TASK Auto-generated method stub
		return null;
	}
	
	public ResultsPage openDresses() {
		WebElement webElement = getDriver().findElementDynamic(selectorSelectDresses);
		webElement.click();
		
		return new ResultsPage();
	}
	
}
