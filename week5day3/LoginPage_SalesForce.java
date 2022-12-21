package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass_LeafTaps;
import base.BaseClass_SalesForce;

public class LoginPage_SalesForce extends BaseClass_SalesForce {
	
	public LoginPage_SalesForce(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage_SalesForce enterUserName() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;
	}
public LoginPage_SalesForce enterPassword() {
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
	return this;
	}
public HomePage_SalesForce clickLogin() {
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	return new HomePage_SalesForce(driver);
}

}
