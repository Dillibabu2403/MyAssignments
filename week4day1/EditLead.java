package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public ChromeDriver driver;

	@BeforeMethod
	public void preConditions() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	
@Test
	public  void runEditLead() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[(text()='Leads')]")).click();
		driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Dillibabu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='15482']")).click();
		String actualTitle = driver.getTitle();
		System.out.println("Page title is : " + driver.getTitle());
		String expectedTitle = "View Lead | opentaps CRM";
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Dilli");
		driver.findElement(By.name("submitButton")).click();
		String text1 = "Dilli (15482)";
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text2);
		if (text1.equals(text2)) {
			System.out.println("Matched");
		} else {
			System.out.println("Not matched");
		}
}
		
		@AfterMethod
		public void postConditions() {
			driver.close();
		}
	}


