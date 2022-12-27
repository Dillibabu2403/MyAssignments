package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;



public class RecentlyViewedPage extends baseclass.BaseClass_SalesForce{
	@And("Click New button")
	public NewOpportunityPage clickOnNewButton() throws InterruptedException, IOException {
		try {
			WebElement ele3 = getDriver().findElement(By.xpath("//div[text()='New']"));
			getDriver().executeScript("arguments[0].click();", ele3);
			reportStep1("Clicked New button","Pass");
		} catch (Exception e) {
			reportStep1("Not clicked New button","Fail");
		}
		Thread.sleep(5000);
		return new NewOpportunityPage();
		
	}

}
