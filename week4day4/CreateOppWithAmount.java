package week4.day4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOppWithAmount extends BaseClassSalesForce {

	@DataProvider(name="CreateWithAmount")
	public String[][] createOpp() throws IOException {
		String [] [] data=ReadExcelForCreateOppWithAmount.read();
		return data;
	}
	
	@Test(dataProvider="CreateWithAmount")
	public void runCreateNewOpp(String OppName,String Amount,String VerifyName) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", ele1);
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		driver.executeScript("arguments[0].click();", ele2);
		Thread.sleep(5000);
		  WebElement ele3 = driver.findElement(By.xpath("//div[text()='New']"));
		  driver.executeScript("arguments[0].click();", ele3); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OppName);
		  WebElement ele4 = driver.findElement(By.xpath("(//span[text()='--None--'])[2]"));
		  driver.executeScript("arguments[0].click();", ele4); 
		  Thread.sleep(5000);
		  WebElement ele5 = driver.findElement(By.xpath("//span[text()='New Customer']"));
		  driver.executeScript("arguments[0].click();", ele5); 
		  Thread.sleep(5000);
		  WebElement ele6 = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		  driver.executeScript("arguments[0].click();", ele6); 
		  Thread.sleep(5000);
		  WebElement ele7 = driver.findElement(By.xpath("//span[text()='Partner Referral']"));
		  driver.executeScript("arguments[0].click();", ele7); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		  WebElement ele8 = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		  driver.executeScript("arguments[0].click();", ele8); 
		  Thread.sleep(2000);
		  WebElement ele9 = driver.findElement(By.xpath("//span[text()='Next Month']"));
		  driver.executeScript("arguments[0].click();", ele9); 
		  Thread.sleep(2000);
		  WebElement ele10 = driver.findElement(By.xpath("//span[text()='20']"));
		  driver.executeScript("arguments[0].click();", ele10); 
		  Thread.sleep(2000);
		  WebElement ele11 = driver.findElement(By.xpath("//span[text()='--None--']"));
		  driver.executeScript("arguments[0].click();", ele11); 
		  WebElement ele12 = driver.findElement(By.xpath("(//lightning-base-combobox-item[contains(@class,'listbox__option')])[4]//span[text()='Needs Analysis']"));
		  driver.executeScript("arguments[0].click();", ele12); 
		  WebElement ele13 = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]"));
		  driver.executeScript("arguments[0].click();", ele13); 
		  Thread.sleep(3000);
		  WebElement ele14 = driver.findElement(By.xpath("//span[text()='Campaign']"));
		  driver.executeScript("arguments[0].click();", ele14); 
		  driver.findElement(By.xpath("//button[text()='Save']")).click();
		  String text2 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).
		  getText(); System.out.println(text2); 
		  if (text2.contains(VerifyName)) {
		  System.out.println("Opportunity Name Matched"); 
		  } 
		  else {
		  System.out.println("Opportunity name not matched"); 
		  }
		 
		

	}

}
