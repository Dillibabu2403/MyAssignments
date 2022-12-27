package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;




public class NewOpportunityPage extends baseclass.BaseClass_SalesForce {
	@And ("enter Opportunity name as {string}")
	public NewOpportunityPage enterOpportunityName(String oppName) throws InterruptedException, IOException {
		try {
			WebElement text1 = getDriver().findElement(By.xpath("//input[@name='Name']"));
			text1.sendKeys(oppName);
			System.out.println(text1.getAttribute("value"));
			reportStep1("Entered Opportunityname","Pass");
		} catch (Exception e) {
			reportStep1("Not entered Opportunityname","Fail");
		}
		Thread.sleep(3000);
		return this;
	}
	@And("Choose Close date as today")
		public NewOpportunityPage chooseCloseDate() throws InterruptedException, IOException {
			try {
				getDriver().findElement(By.xpath("//input[@name='CloseDate']")).click();
				Thread.sleep(3000);
				WebElement ele4 = getDriver().findElement(By.xpath("//td[@class='slds-is-today']/span"));
				getDriver().executeScript("arguments[0].click();", ele4);
				reportStep1("Entered Closedate","Pass");
			} catch (InterruptedException e) {
				reportStep1("Not entered Closedate","Fail");
			}
			Thread.sleep(2000);
			return this;
		}
	@And("Select Stage as Need Analysis")
			public NewOpportunityPage selectStage() throws IOException {
				try {
					WebElement ele5 = getDriver().findElement(By.xpath("//span[text()='--None--']"));
					getDriver().executeScript("arguments[0].click();", ele5);
					getDriver().findElement(By.xpath("(//lightning-base-combobox-item[contains(@class,'listbox__option')])[4]//span[text()='Needs Analysis']")).click();
					reportStep1("Selected Need analysis option","Pass");
				} catch (Exception e) {
					reportStep1("Not Selected Need analysis option","Fail");
				}
				return this;
			}
	@When("Save the details")
				public VerifyOpportunityPage clickOnSave() throws IOException {
					try {
						getDriver().findElement(By.xpath("//button[text()='Save']")).click();
						reportStep1("Clicked save button","Pass");
					} catch (Exception e) {
						reportStep1("Not clicked save button","Fail");
					}
					return new VerifyOpportunityPage();
				}
		
		
	}

