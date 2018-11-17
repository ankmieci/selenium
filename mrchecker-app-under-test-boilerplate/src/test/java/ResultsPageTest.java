import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResultsPageTest {
	private static MainPage	mainPage;
	private ResultsPage		resultsPage;
	
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
	public void test() {
		resultsPage.clickSizeS();
		resultsPage.clickColorOrange();
		resultsPage.clickConditionNew();
		resultsPage.clickStyleGirly();
	}
	
}
