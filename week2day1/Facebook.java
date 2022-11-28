package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dillibabu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ruthiran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test@0221");
		WebElement sele = driver.findElement(By.id("day"));
		Select src=new Select(sele);
		src.selectByValue("24");
		WebElement sele2 = driver.findElement(By.id("month"));
		Select src2=new Select(sele2);
		src2.selectByVisibleText("Mar");
		WebElement sele3 = driver.findElement(By.id("year"));
		Select src3=new Select(sele3);
		src3.selectByIndex(1);
		driver.findElement(By.name("sex")).click();
		}

}
