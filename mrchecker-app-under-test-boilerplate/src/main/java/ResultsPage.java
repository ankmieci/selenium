import org.openqa.selenium.By;

import com.capgemini.mrchecker.selenium.core.BasePage;

public class ResultsPage extends BasePage {
	
	public static final By	selectorSizeM			= By.cssSelector("#layered_id_attribute_group_2");
	public static final By	selectorColorOrange		= By.cssSelector("#layered_id_attribute_group_13");
	public static final By	selectorStyleGirly		= By.cssSelector("#layered_id_feature_13");
	public static final By	selectorConditionNew	= By.cssSelector("#layered_condition_new");
	public static final By	selectorProduct			= By.cssSelector("div.right-block a.product-name");
	
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
	
	public void clickSizeM() {
		getDriver().findElementDynamic(selectorSizeM)
				.click();
	}
	
	public void clickColorOrange() {
		getDriver().findElementDynamic(selectorColorOrange)
				.click();
	}
	
	public void clickStyleGirly() {
		getDriver().findElementDynamic(selectorStyleGirly)
				.click();
	}
	
	public void clickConditionNew() {
		getDriver().findElementDynamic(selectorConditionNew)
				.click();
	}
	
	public ProductPage clickProduct() {
		getDriver().findElementDynamic(selectorProduct)
				.click();
		
		return new ProductPage();
	}
	
}
