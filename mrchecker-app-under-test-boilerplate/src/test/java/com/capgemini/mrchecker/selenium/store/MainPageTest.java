package com.capgemini.mrchecker.selenium.store;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import com.capgemini.mrchecker.test.core.BaseTest;
import com.capgemini.mrchecker.test.core.logger.BFLogger;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class MainPageTest extends BaseTest {
	
	private static MainPage storeMainPage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BFLogger.logInfo("Open store main page");
		storeMainPage = new MainPage();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		BFLogger.logInfo("Close browser");
		storeMainPage.closeBrowser();
	}
	
	@Override
	public void setUp() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void tearDown() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	@Parameters(name = "testData")
	public void shouldAddProductsToCart(String productName) {
		
		BFLogger.logInfo("Search for product");
		ResultsPage resultsPage = storeMainPage.searchProduct(productName);
		resultsPage.clickAddToCart();
		resultsPage.clickReturnHomeButton();
		
		BFLogger.logInfo("Open cart");
		CartPage cartPage = storeMainPage.clickCartButton();
		
		BFLogger.logInfo("Get product list");
		List<String> productListFromCart = cartPage.getProductList();
		
		BFLogger.logInfo("Assert the searched product is in the cart");
		assertTrue(productName + " is not on list", productListFromCart.contains(productName));
	}
	
	private Object[] testData() {
		return new Object[] { "Apple iPod touch Large", "Apple iPad 2 16GB, Wi-Fi, 9.7in - Black" };
	}
	
}
