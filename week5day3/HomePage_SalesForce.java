package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import base.BaseClass_LeafTaps;

public class HomePage_SalesForce extends BaseClass_LeafTaps {
	
	public HomePage_SalesForce(ChromeDriver driver) {
		this.driver=driver;
	}
	public HomePage_SalesForce verifyPage() {
		String actTitle=driver.getTitle();
		if((actTitle.equals("Lightning Experience")||actTitle.equals("Home | Salesforce"))) {
		System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
	
		return this;
	}
	public HomePage_SalesForce clickToggleMenu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}
	public HomePage_SalesForce clickViewAll() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		return this;
	}
	public HomePage_SalesForce ClickSales() throws InterruptedException {
		WebElement ele1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", ele1);
		Thread.sleep(5000);
		return this;
	}
	
	public RecentlyViewedPage ClickOpportunity() throws InterruptedException {
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", ele2);
		Thread.sleep(3000);
		return new RecentlyViewedPage(driver);
	}

	
}
