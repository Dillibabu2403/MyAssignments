package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass_LeafTaps;

public class NewOpportunityPage extends BaseClass_LeafTaps {
	public NewOpportunityPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public NewOpportunityPage enterOpportunityName() throws InterruptedException {
		WebElement text1 = driver.findElement(By.xpath("//input[@name='Name']"));
		text1.sendKeys("Salesforce Automation by DBR Christopher");
		System.out.println(text1.getAttribute("value"));
		Thread.sleep(3000);
		return this;
	}
		public NewOpportunityPage chooseCloseDate() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
			Thread.sleep(3000);
			WebElement ele4 = driver.findElement(By.xpath("//td[@class='slds-is-today']/span"));
			driver.executeScript("arguments[0].click();", ele4);
			Thread.sleep(2000);
			return this;
		}
			public NewOpportunityPage selectStage() {
				WebElement ele5 = driver.findElement(By.xpath("//span[text()='--None--']"));
				driver.executeScript("arguments[0].click();", ele5);
				driver.findElement(By.xpath("(//lightning-base-combobox-item[contains(@class,'listbox__option')])[4]//span[text()='Needs Analysis']")).click();
				return this;
			}
				public VerifyOpportunityPage clickOnSave() {
					driver.findElement(By.xpath("//button[text()='Save']")).click();
					return new VerifyOpportunityPage(driver);
				}
		
		
	}

