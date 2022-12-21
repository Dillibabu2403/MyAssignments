package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass_SalesForce;

public class VerifyOpportunityPage extends BaseClass_SalesForce {

	public VerifyOpportunityPage(ChromeDriver driver) {
		this.driver=driver;
	}
public VerifyOpportunityPage verifyOpportunityName() {
	String text2 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
	System.out.println(text2);
	if (text2.contains("Christopher")) {
		System.out.println("Opportunity Name Matched");
	} else {
		System.out.println("Opportunity name not matched");
	}
	return null;
	
	
}
	
	

}
