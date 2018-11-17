import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResultsPageTest {
	
	private static final String PRODUCT_CONDITION_NEW = "New";
	
	private static MainPage	mainPage;
	private ResultsPage		resultsPage;
	private ProductPage		productPage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mainPage = new MainPage();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// MainPage.getDriver()
		// .close();
	}
	
	@Before
	public void setUp() throws Exception {
		resultsPage = mainPage.openDresses();
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void shouldReturnSizeMColorOrangeConditionNewStyleGirlyDress() {
		resultsPage.clickSizeM();
		resultsPage.clickColorOrange();
		resultsPage.clickConditionNew();
		resultsPage.clickStyleGirly();
		
		productPage = resultsPage.clickProduct();
		
		assertEquals("Product condition not as expected", productPage.getProductCondition()
				.toUpperCase(),
				PRODUCT_CONDITION_NEW.toUpperCase());
	}
	
}
