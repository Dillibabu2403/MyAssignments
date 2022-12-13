package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateOpportunityWithoutMandatoryFields extends BaseClass {
	@Test
	public void runOpportunityWithoutMandatoryFields() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", ele1);
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", ele2);
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath("//div[text()='New']"));
		driver.executeScript("arguments[0].click();", ele3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(3000);
		WebElement ele4 = driver.findElement(By.xpath("//td[@class='slds-is-today']/following-sibling::td/span"));
		driver.executeScript("arguments[0].click();", ele4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
		System.out.println(text2);
		if (text2.contains("Review")) {
			System.out.println("Alert message displayed");
		} else {
			System.out.println("Alert message is not displayed");
		}
		
}
}