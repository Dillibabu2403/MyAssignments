package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShowUsingEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[contains(@class,sc-hCaUpS)]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,sc-hCaUpS)]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String url1 = "https://in.bookmyshow.com/explore/home/hyderabad";
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		if (url1.equals(url2)) {
			System.out.println("Matched");
		} else {
			System.out.println("Not matched");
		}
		driver.findElement(By.xpath("//span[contains(@class,'sc-cooIXK')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'sc-hCaUpS')]")).sendKeys("Love Today");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'sc-hCaUpS')]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		Thread.sleep(2000);
		String text1 = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("//div[text()='INFO']")).click();
Thread.sleep(2000);
WebElement facilityCheck = driver.findElement(By.xpath("//div[contains(text(),'Parking')]"));
String check = facilityCheck.getText();
if(check.equalsIgnoreCase("parking facility"))
{
	System.out.println("Parking facility available");
}else {
	System.out.println("Parking not available");
}
driver.findElement(By.xpath("//div[@class='cross-container']")).click();
driver.findElement(By.xpath("//div[@class='showtime-pill-container _available']")).click();
driver.findElement(By.id("btnPopupAccept")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//ul[@id='popQty']/li")).click();
Thread.sleep(2000);
driver.findElement(By.id("proceed-Qty")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='_available']")).click();
driver.findElement(By.xpath("//a[@id='btmcntbook']/span[@id='btnSTotal_reserve']")).click();
Thread.sleep(5000);
String text2 = driver.findElement(By.id("subTT")).getText();
System.out.println(text2);

	
	}
}



