package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
		Thread.sleep(3000);
		String text1 = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text1);
		List<WebElement> name = driver
				.findElements(By.xpath("//div[@class='brand']"));
		int size = name.size();
		System.out.println(size);
		List<String> brandName = new ArrayList<String>();
		for (WebElement br : name) {
			brandName.add(br.getText());
			System.out.println(br.getText());
		}
		List<WebElement> name2 = driver
				.findElements(By.xpath("//div[@class='nameCls']"));
		int size2 = name2.size();
		System.out.println(size2);
		List<String> bagName = new ArrayList<String>();
		for (WebElement bn : name2) {
			bagName.add(bn.getText());
			System.out.println(bn.getText());
		}
		driver.quit();
		
	}

}
