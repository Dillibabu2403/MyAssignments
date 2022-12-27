package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginPage_SalesForce extends baseclass.BaseClass_SalesForce {
	@Given("Enter the username as {string}")
	public LoginPage_SalesForce enterUserName(String uname) throws IOException {
		try {
			getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
			reportStep1("Username entered successful","Pass");
		} catch (Exception e) {
			reportStep1("Username unsuccessful","Fail");
		}
		return this;
	}
	
	@And("Enter the password as {string}")
public LoginPage_SalesForce enterPassword(String pwd) throws IOException {
	try {
		getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		reportStep1("Password entered successful","Pass");
	} catch (Exception e) {
		reportStep1("Password unsuccessful","Fail");
	}
	return this;
	}
	
	@When ("Click on Login button in Salesforce")
public HomePage_SalesForce clickLogin() throws IOException {
	try {
		getDriver().findElement(By.xpath("//input[@id='Login']")).click();
		reportStep1("clicked Login button","Pass");
	} catch (Exception e) {
		reportStep1("Not clicked login button","Fail");
	}
	return new HomePage_SalesForce();
}

}
