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

	// ѕроверить отображение меню навигации
	public boolean isElementPresent(By by) {
		try {
			wd.findElement(by);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void goTo50() {
		wd.findElement(By.linkText("Sale -50%")).click();
	}



}
