package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[(text()='Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("baba123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement p = driver.findElement(By.xpath("//a[text()='jj']"));
		String s = p.getText();
		System.out.println("Text content is : " + s);
		driver.findElement(By.xpath("//a[text()='jj']")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		String actualTitle = driver.getTitle();
		System.out.println("Page title is : " + driver.getTitle());
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title didn't match");
		}

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(text2);
		if (s.equals(text2)) {
			System.out.println("Matched");
		} else {
			System.out.println("Not matched");
		}
		driver.close();

	}

}
