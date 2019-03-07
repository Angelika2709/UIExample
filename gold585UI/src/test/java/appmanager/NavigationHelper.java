package appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;

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
		wd.findElement(By.xpath("//span[@class='alter-delivery-arrow']")).click();
		WebDriverWait wait = new WebDriverWait(wd, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-save='city']")));
		}

	public void toPay() throws Exception {	
		wd.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/form/div[1]/div/a")).click();
		Thread.sleep(10000);
		Assert.assertTrue(wd.getTitle().contains("Яндекс.Деньги"));
	}

}
