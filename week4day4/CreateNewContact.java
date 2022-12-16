package week4.day4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateNewContact extends BaseClassSalesForce {
	@DataProvider(name="CreateContact")
	public String[][] createCont() throws IOException {
		String [] [] data=ReadExcelForCreateNewContact.read();
		return data;
	}
	
	@Test(dataProvider="CreateContact")
	public void runCreateNewContact(String SearchBox,String FirstName,String LastName,String Email,String VerifyName) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//label[contains(text(),'apps')]/following-sibling::div/input"));
		  driver.executeScript("arguments[0].click();", ele1); 
		  ele1.sendKeys(SearchBox);
		  Thread.sleep(3000);
		  WebElement cli = driver.findElement(By.xpath("//mark[text()='Contacts']"));
		  driver.executeScript("arguments[0].click();", cli); 
		  Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='--None--']"));
		  driver.executeScript("arguments[0].click();", ele); 
		  Thread.sleep(5000);
		  WebElement ele2 = driver.findElement(By.xpath("//span[text()='Mr.']"));
		  driver.executeScript("arguments[0].click();", ele2); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FirstName);
		  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(LastName);
		  driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email);
		  WebElement ele3 = driver.findElement(By.xpath("//label[text()='Account Name']/following-sibling::div//lightning-icon"));
		  driver.executeScript("arguments[0].click();", ele3); 
		  Thread.sleep(5000);
		  WebElement ele4 = driver.findElement(By.xpath("//span[text()='Credits']"));
		  driver.executeScript("arguments[0].click();", ele4); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[text()='Save']")).click();
		  String text2 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
			System.out.println(text2);
			if (text2.contains(VerifyName)) {
				System.out.println("Contact Name Matched");
			} else {
				System.out.println("Contact name not matched");
			}
		

	}

}
