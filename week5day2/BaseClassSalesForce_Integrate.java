package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSalesForce_Integrate {
	public String Exceldatafile;
	public RemoteWebDriver driver;

	@Parameters({ "browser", "url", "username", "password" })

	@BeforeMethod
	public void preConditions(String browser, String url, String username, String password) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("--disable-notifications");
			driver = new ChromeDriver(ch);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions eh = new EdgeOptions();
			eh.addArguments("--disable-notifications");
			driver = new EdgeDriver(eh);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fh = new FirefoxOptions();
			fh.addArguments("--disable-notifications");
			driver = new FirefoxDriver(fh);
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@AfterMethod
	public void postConditions() {
		driver.close();
	}

	@DataProvider(name = "fetch",indices= {3,5})
	public String[][] fetchData() throws IOException {
		String[][] data = IntegrateMultipleExcelFiles.read(Exceldatafile);
		return data;
	}

}
