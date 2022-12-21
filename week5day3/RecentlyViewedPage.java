package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass_LeafTaps;

public class RecentlyViewedPage extends BaseClass_LeafTaps{
	public RecentlyViewedPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public NewOpportunityPage clickOnNewButton() throws InterruptedException {
		WebElement ele3 = driver.findElement(By.xpath("//div[text()='New']"));
		driver.executeScript("arguments[0].click();", ele3);
		Thread.sleep(5000);
		return new NewOpportunityPage(driver);
		
	}

}
