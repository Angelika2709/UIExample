package appmanager;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class Items extends HelperBase {
	List<WebElement> items = new ArrayList<WebElement>();
	String nameItem;

	public Items(WebDriver wd) {
		super(wd);
	}

	@SuppressWarnings("deprecation")
	public void getCountItems() {
		items = wd.findElements(By.xpath("//div[@class='grid-item ddl_product']"));
		int countItems = items.size();
		Assert.assertEquals(40, countItems);
		System.out.println(countItems);
	}
	
	// Проверить что мы перешли в карточку товара
	public void getFirstItem() {
		nameItem = items.get(0).getText();
		items.get(0).click();
		System.out.println(nameItem);
		if (wd.getPageSource().contains(nameItem))
			System.out.println("Name item");
	}

	//Проверить что добавление товара прошло успешно
	public void goToBucket() {
		WebElement toBucket = wd.findElement(By.id("buy-to-cart"));
		toBucket.click();
		Assert.assertTrue(toBucket.getAttribute("В заказе"), true);		
	}
	
	// Проверить что добавленный товар отобразился в корзине
	public void moveToBucket() {
		wd.findElement(By.xpath("//a[@title='Корзина']")).click();
		if (wd.getPageSource().contains(nameItem))
			System.out.println("Name items");
	}
	
	
		
	
	

	



}
