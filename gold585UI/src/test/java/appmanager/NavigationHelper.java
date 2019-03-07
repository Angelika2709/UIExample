package appmanager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(WebDriver wd) {
		super(wd);
	}

	// Проверить отображение меню навигации
	public void getMenu() {
		Assert.assertTrue(wd.getPageSource().contains("n-header-bottom"));
	}

	public void goTo50() {
		wd.findElement(By.xpath("//*[@id='body']/div[2]/div[2]/div[3]/div/div[2]/a[5]")).click();
		Assert.assertTrue(wd.getTitle().contains("Глобальная распродажа в ювелирном магазине 585 Золотой."));
	}

	public void setAddress() {
		wd.findElement(By.xpath("//[@id='app']/div[1]/div[1]/form/div[5]/a")).click();
	}

	public void toPay() {
		wd.findElement(By.linkText("Оплата на сайте")).click();
		Assert.assertTrue(wd.getTitle().contains("Яндекс.Деньги"));
	}

}
