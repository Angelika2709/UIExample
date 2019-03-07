package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ApplicationManager {
	WebDriver wd;
	private NavigationHelper navigationHelper;
	private Items items;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}

	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.gold585.ru");	
		navigationHelper = new NavigationHelper(wd);
		items = new Items(wd);	

	}

	public void stop() {
		System.out.println("Running: tearDown");
		wd.quit();
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}
	
	public Items getItems() {
		return items;
	}
	

    
    
   }
