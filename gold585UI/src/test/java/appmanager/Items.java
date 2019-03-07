package appmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Items extends HelperBase {
	List<WebElement> items = new ArrayList<WebElement>();
	String nameItem;
	List<Integer> pricesNotSort = new ArrayList<Integer>();
	List<Integer> pricesSort = new ArrayList<Integer>();

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
	
	// ��������� ��� �� ������� � �������� ������
	public void getFirstItem() {
		nameItem = items.get(0).getText();
		items.get(0).click();
		System.out.println(nameItem);
		if (wd.getPageSource().contains(nameItem))
			System.out.println("Name item");
	}

	//��������� ��� ���������� ������ ������ �������
	public void goToBucket() {
		WebElement toBucket = wd.findElement(By.id("buy-to-cart"));
		toBucket.click();
		Assert.assertTrue(toBucket.toString().contains("� ������"));		
	}
	
	// ��������� ��� ����������� ����� ����������� � �������
	public void moveToBucket() {
		wd.findElement(By.xpath("//a[@title='�������']")).click();
		if (wd.getPageSource().contains(nameItem))
			System.out.println("Name items");
	}
	
	
		
	
	

	



}
