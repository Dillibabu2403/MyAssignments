package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BaseClassSalesForce {
	
	@DataProvider(name="CreateWithMandatory")
	public String[][] createOpportunity() {
		String [] [] data=new String [2][2];
		data[0][0]="Salesforce Automation by Dillibabu";
		data[0][1]="Dillibabu";
		data[1][0]="Salesforce Automation by Johnson";
		data[1][1]="testing";
		return data;
	}
	@Test(dataProvider="CreateWithMandatory")
	public void runCreateNewOpportunity(String OppName,String VerifyName) throws InterruptedException {
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
		WebElement text1 = driver.findElement(By.xpath("//input[@name='Name']"));
		text1.sendKeys(OppName);
		System.out.println(text1.getAttribute("value"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(3000);
		WebElement ele4 = driver.findElement(By.xpath("//td[@class='slds-is-today']/span"));
		driver.executeScript("arguments[0].click();", ele4);
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.xpath("//span[text()='--None--']"));
		driver.executeScript("arguments[0].click();", ele5);
		driver.findElement(By.xpath("(//lightning-base-combobox-item[contains(@class,'listbox__option')])[4]//span[text()='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text2 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(text2);
		if (text2.contains(VerifyName)) {
			System.out.println("Opportunity Name Matched");
		} else {
			System.out.println("Opportunity name not matched");
		}
		

	}

}
