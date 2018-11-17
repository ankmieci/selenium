import org.openqa.selenium.By;

import com.capgemini.mrchecker.selenium.core.BasePage;

public class ProductPage extends BasePage {
	
	public static final By selectorProductCondition = By.cssSelector("#product_condition span");
	
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
	
	public String getProductCondition() {
		return getDriver().findElementDynamic(selectorProductCondition)
				.getText();
	}
	
}
