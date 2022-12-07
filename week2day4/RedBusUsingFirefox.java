package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusUsingFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement m = driver.findElement(By.id("src"));
		m.clear();
		m.sendKeys("Chennai");
		Thread.sleep(2000);
		m.sendKeys(Keys.ENTER);
		WebElement m2 = driver.findElement(By.id("dest"));
		m2.clear();
		m2.sendKeys("Bangalore");
		Thread.sleep(2000);
		m2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td")).click();
		Thread.sleep(2000);
		WebElement cli = driver.findElement(By.id("search_btn"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", cli);
		Thread.sleep(5000);
		String text1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		WebElement cli2 = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", cli2);
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		WebElement cli3 = driver.findElement(By.xpath("(//div[text()='View Seats'])[2]"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", cli3);
		

	}

}
