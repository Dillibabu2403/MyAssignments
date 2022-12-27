package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;



public class VerifyOpportunityPage extends baseclass.BaseClass_SalesForce {

	@Then("verify name contains {string}")
public VerifyOpportunityPage verifyOpportunityName(String verifyName) {
	String text2 = getDriver().findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
	System.out.println(text2);
	if (text2.contains(verifyName)) {
		System.out.println("Opportunity Name Matched");
	} else {
		System.out.println("Opportunity name not matched");
	}
	return this;
	
	
}
	
	

}
