package appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class Bucket extends HelperBase{

	public Bucket(WebDriver wd) {
		super(wd);
	}
	
	public void contacts(String lastname, String name, String secondname, String phone, String email) {
		type(By.xpath("//input[@data-save='last-name']"), lastname);
		type(By.xpath("//input[@data-save='name']"), name);
		type(By.xpath("//input[@data-save='second-name']"), secondname);
		type(By.xpath("//input[@data-save='phone']"), phone);
		type(By.xpath("//input[@data-save='email']"), email);		
	}
	
	public void address(String city) {
		type(By.xpath("//input[@data-save='city']"), city);
	}
	
	
}
