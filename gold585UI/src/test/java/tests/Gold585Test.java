package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import appmanager.NavigationHelper;

public class Gold585Test extends TestBase {

	@Test
	void testGold585UI() {
		app.getNavigationHelper().isElementPresent(By.className("n-header-bottom"));
		Assert.assertTrue(app.getNavigationHelper().isElementPresent(By.className("n-header-bottom")));
		
		
		app.getNavigationHelper().goTo50();
		
		
		
		/*
		
		app.getInsuranceType().getTypes(new InsTypes("Estate"));
		app.getInsurerName().getInsurer(new InsNames("PAX"));
		app.datesHelper.data("12/02/2019", "12/03/2019");
		
		app.priceHelper.price("300");
	*/
	}



}
