package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE SME Share Prices']/following-sibling::a[text()='NSE Bulk Deals']"))
				.click();
		List<WebElement> name = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));
		int size = name.size();
		System.out.println(size);
		List<String> secName = new ArrayList<String>();
		for (WebElement securityNames : name) {
			secName.add(securityNames.getText());
			System.out.println(securityNames.getText());
		}

		// System.out.println(secName);

		Set<String> tr = new LinkedHashSet<String>(secName);

		int size2 = tr.size();
		System.out.println(size2);
		if (size == size2) {
			System.out.println("No duplicate found");
		} else {
			System.out.println("Duplicate found");
		}
		driver.close();
	}

}
