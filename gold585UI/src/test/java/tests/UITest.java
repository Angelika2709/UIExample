package tests;

import org.junit.jupiter.api.Test;


class UITest extends TestBase{

	@Test
	void testGold585UI() {				
			app.getNavigationHelper().getMenu();
			app.getNavigationHelper().goTo50();
			app.getItems().getCountItems();
			app.getItems().getFirstItem();
			app.getItems().goToBucket();
			app.getBucket().contacts("Bark", "Anz", "Nik", "+79999638497", "angel27@yandex.ru");
			app.getNavigationHelper().setAddress();
			app.getBucket().address("Санкт-Петербург");			
			app.getNavigationHelper().toPay();
			
			
			
			
	}

}
