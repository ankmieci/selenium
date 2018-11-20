package com.capgemini.mrchecker.selenium.store;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.mrchecker.test.core.BaseTest;
import com.capgemini.mrchecker.test.core.logger.BFLogger;

public class MainPageTest extends BaseTest {
	
	public static String	PRODUCT_1	= "Apple iPod touch Large";
	public static String	PRODUCT_2	= "Apple iPad 2 16GB, Wi-Fi, 9.7in - Black";
	
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
	public void shouldAddProductsToCart() {
		// Add first product to cart and submit search
		ResultsPage resultsPage = storeMainPage.searchProduct(PRODUCT_1);
		resultsPage.clickAddToCart();
		resultsPage.clickReturnHomeButton();
		
		// Add second product to cart and submit search
		resultsPage = storeMainPage.searchProduct(PRODUCT_2);
		resultsPage.clickAddToCart();
		resultsPage.clickReturnHomeButton();
		
		CartPage cartPage = storeMainPage.clickCartButton();
		
		List<String> productListFromCart = cartPage.getProductList();
		
		System.out.println(productListFromCart);
		
		assertTrue(PRODUCT_1 + " is not on list", productListFromCart.contains(PRODUCT_1));
		assertTrue(PRODUCT_2 + " is not on list", productListFromCart.contains(PRODUCT_2));
	}
	
}
