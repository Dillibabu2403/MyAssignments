package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		// Nested Frame
		// Parent frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Dillibabu");
		// Child frame
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		// Switching from frame 3 to frame 1
		driver.switchTo().defaultContent();
		// Handling frame 2
		driver.switchTo().frame("frame2");
		WebElement sele = driver.findElement(By.xpath("//select[@id='animals']"));
		Select src = new Select(sele);
		src.selectByIndex(3);
		driver.close();

	}

}
