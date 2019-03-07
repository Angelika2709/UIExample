package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class UITest extends TestBase{

	@Test
	void testGold585UI() throws Exception {
			app.getNavigationHelper().isElementPresent(By.className("n-header-bottom"));
			Assert.assertTrue(app.getNavigationHelper().isElementPresent(By.className("n-header-bottom")));			
			
			app.getNavigationHelper().goTo50();
			app.getItems().getCountItems();
			app.getItems().getFirstItem();
			app.getItems().goToBucket();
			
			
			
	}

}
