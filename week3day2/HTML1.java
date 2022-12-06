package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		List<WebElement> count1 = driver
				.findElements(By.xpath("//div[@id='container']//tr"));
		int size = count1.size();
		System.out.println("Total number of Rows is :"+size);
		List<WebElement> count2 = driver
				.findElements(By.xpath("//div[@id='container']//th"));
		int size2 = count2.size();
		System.out.println("Total number of Columns is :"+ size2);
		driver.close();
	}

}
