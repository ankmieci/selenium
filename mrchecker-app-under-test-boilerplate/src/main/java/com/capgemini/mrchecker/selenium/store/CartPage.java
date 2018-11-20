package com.capgemini.mrchecker.selenium.store;

import java.util.List;

import org.openqa.selenium.By;

import com.capgemini.mrchecker.selenium.core.BasePage;
import com.capgemini.mrchecker.selenium.jsoupHelper.JsoupHelper;

public class CartPage extends BasePage {
	
	public static final By selectorProductName = By.cssSelector("td.wpsc_product_name");
	
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
	
	public List<String> getProductList() {
		return JsoupHelper.findTexts(selectorProductName);
	}
	
}
