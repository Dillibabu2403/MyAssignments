package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {
@Test
	public  void runCreateTask() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("task");
		driver.findElement(By.xpath("//mark[text()='Task']")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Show more actions']"));
		driver.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='New Task']"));
		driver.executeScript("arguments[0].click();", ele2);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//label[text()='Subject']/following-sibling::div//input")).click();
		driver.findElement(By.xpath("//label[text()='Subject']/following-sibling::div//input")).sendKeys("Bootcamp");
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Not Started']"));
		driver.executeScript("arguments[0].click();", ele3);
		driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(text);
		if(text.contains("Bootcamp")) {
			System.out.println("Task created successfully");
		}
		else {
			System.out.println("Task not created");
		}
	}

}
