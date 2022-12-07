package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllAlerts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		// Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		driver.switchTo().alert().accept();
		String text1 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text1);
		// Confirm Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		driver.switchTo().alert().dismiss();
		String text2 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text2); // Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		String text3 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text3); // Sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();

		// driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/Alert.png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
