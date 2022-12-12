package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {
@Test
	public  void runArchitectCertification() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(3000);
		Set<String> windowsHandles = driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowsHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow sh=new Shadow(driver);
		sh.findElementByXPath("//span[text()='Learning']").click();
		WebElement ele = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(5000);
		WebElement ele2 = sh.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();", ele2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Architect']")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("architectoverview")) {
			System.out.println("Correct URL");
		}else {
			System.out.println("Wrong URL");
		}
		System.out.println("-------------------------------------------");
String text1 = driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/following-sibling::div[contains(@class,'slds')]")).getText();
		System.out.println(text1);
		System.out.println("-------------------------------------------");
		List<WebElement> name = driver
				.findElements(By.xpath("//div[@class='credentials-card_title']"));
		int size = name.size();
		System.out.println("Total Salesforce Architect Certifications is:"+ size);
		List<String> certName = new ArrayList<String>();
		for (WebElement cn : name) {
			certName.add(cn.getText());
			System.out.println(cn.getText());
		}
		Thread.sleep(3000);
		System.out.println("-------------------------------------------");
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		List<WebElement> name2 = driver
				.findElements(By.xpath("//div[@class='credentials-card_title']"));
		int size2 = name2.size();
		System.out.println("Total Architect Certifications is:"+ size2);
		List<String> certName2 = new ArrayList<String>();
		for (WebElement cn2 : name2) {
			certName2.add(cn2.getText());
			System.out.println(cn2.getText());
		}
	}

}
