package appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {

	protected static WebDriver wd;


	public HelperBase(WebDriver wd) {
		this.wd = wd;
	}

	protected void type(By locator, String text) {
		wd.findElement(locator).sendKeys(text);
	}	

	}


