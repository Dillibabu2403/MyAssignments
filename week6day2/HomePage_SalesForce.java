package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePage_SalesForce extends baseclass.BaseClass_SalesForce {
	
	@Then("Login is successfully in Salesforce")
	public HomePage_SalesForce verifyPage() {
		String actTitle=getDriver().getTitle();
		if((actTitle.equals("Lightning Experience")||actTitle.equals("Home | Salesforce"))) {
		System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
	    return this;
	}
	@And("Click on toggle menu button")
	public HomePage_SalesForce clickToggleMenu() throws IOException {
		try {
			getDriver().findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			reportStep1("Clicked Togglemenu","Pass");
		} catch (Exception e) {
			reportStep1("Not clicked Togglemenu","Fail");
		}
		return this;
	}
	@And("select Sales from App Launcher")
	public HomePage_SalesForce clickViewAll() throws InterruptedException, IOException {
		try {
			getDriver().findElement(By.xpath("//button[text()='View All']")).click();
			reportStep1("Clicked viewall","Pass");
		} catch (Exception e) {
			reportStep1("Not clicked viewall button","Fail");
		}
		Thread.sleep(3000);
		WebElement ele1;
		try {
			ele1 = getDriver().findElement(By.xpath("//p[text()='Sales']"));
			getDriver().executeScript("arguments[0].click();", ele1);
			reportStep1("Clicked Sales button","Pass");
		} catch (Exception e) {
			reportStep1("Not clicked Sales button","Fail");
		}
		Thread.sleep(5000);
		return this;
	}
	
	@And("Click on Opportunity tab")
	public RecentlyViewedPage ClickOpportunity() throws InterruptedException, IOException {
		
		try {
			WebElement ele2 = getDriver().findElement(By.xpath("//span[text()='Opportunities']"));
			getDriver().executeScript("arguments[0].click();", ele2);
			reportStep1("Clicked opportunity button","Pass");
			
		} catch (Exception e) {
			reportStep1("Not Clicked opportunity button","Fail");
		}
		Thread.sleep(3000);
		return new RecentlyViewedPage();
	}

	
}
