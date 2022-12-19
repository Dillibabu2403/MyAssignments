package steps_salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefSalesForce {
	

		public ChromeDriver driver;
		
		@Given("Launch the Chrome Browser with the Salesforce url")
		public void precondition() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--disable-notifications");
			driver=new ChromeDriver(ch);
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		

		@Given("Enter the username as {string}")
		public void enter_the_username_as(String username) {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		}

		@Given("Enter the password as {string}")
		public void enter_the_password_as(String password) {
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		}
		@When ("Click on Login button")
		public void clickLogin() {
			driver.findElement(By.xpath("//input[@id='Login']")).click();
		}

		@Then("Login is successful")
		public void login_is_successful() {
		   System.out.println("Logged in successfully");
		}

		@And("Click on toggle menu button")
		public void clickToggle_withMandatory() {
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		}

		@And("select Sales from App Launcher")
		public void selectSales_withMandatory() throws InterruptedException {
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			Thread.sleep(3000);
			WebElement ele1 = driver.findElement(By.xpath("//p[text()='Sales']"));
			driver.executeScript("arguments[0].click();", ele1);
			Thread.sleep(5000);
		}

		@And("Click on Opportunity tab")
		public void clickOpp_withMandatory() throws InterruptedException {
			WebElement ele2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click();", ele2);
			Thread.sleep(3000);
		}

		@And("Click New button with Opportunity name as {string}")
		public void click_new_button_with_opportunity_name_as(String oppName) throws InterruptedException {
			WebElement ele3 = driver.findElement(By.xpath("//div[text()='New']"));
			driver.executeScript("arguments[0].click();", ele3);
			Thread.sleep(5000);
			WebElement text1 = driver.findElement(By.xpath("//input[@name='Name']"));
			text1.sendKeys(oppName);
			System.out.println(text1.getAttribute("value"));
			Thread.sleep(3000);
		}

		@And("Choose Close date as today")
		public void choose_close_date_as_today() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
			Thread.sleep(3000);
			WebElement ele4 = driver.findElement(By.xpath("//td[@class='slds-is-today']/span"));
			driver.executeScript("arguments[0].click();", ele4);
			Thread.sleep(2000);
		}

		@And("Select Stage as Need Analysis")
		public void select_stage_as_need_analysis() {
			WebElement ele5 = driver.findElement(By.xpath("//span[text()='--None--']"));
			driver.executeScript("arguments[0].click();", ele5);
			driver.findElement(By.xpath("(//lightning-base-combobox-item[contains(@class,'listbox__option')])[4]//span[text()='Needs Analysis']")).click();
		}

		@When("Save the details")
		public void save_withMandatory() {
			driver.findElement(By.xpath("//button[text()='Save']")).click();
		}

		@Then("verify name contains {string}")
		public void verify_name_contains(String verifyName) {
			String text2 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
			System.out.println(text2);
			if (text2.contains(verifyName)) {
				System.out.println("Opportunity Name Matched");
			} else {
				System.out.println("Opportunity name not matched");
			}
		}
		
		@And ("Click the New option under Opportunity")
		public void openNewOpportunity() throws InterruptedException {
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			Thread.sleep(3000);
			WebElement ele1 = driver.findElement(By.xpath("//p[text()='Sales']"));
			driver.executeScript("arguments[0].click();", ele1);
			Thread.sleep(5000);
			WebElement ele2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click();", ele2);
			Thread.sleep(3000);
			WebElement ele3 = driver.findElement(By.xpath("//div[text()='New']"));
			driver.executeScript("arguments[0].click();", ele3);
			Thread.sleep(5000);
		}
		  
			@And("Choose Close date as tomorrow date")
			public void chooseCloseDateTomorrow() throws InterruptedException {
				driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
				Thread.sleep(3000);
				WebElement ele4 = driver
						.findElement(By.xpath("//td[@class='slds-is-today']/following-sibling::td/span"));
				driver.executeScript("arguments[0].click();", ele4);
				Thread.sleep(2000);
			}

			@And("Enter the details in description as {string}")
			public void enterDescription(String descName) {
				driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(descName);
			}

			@When("Save the details without Mandatory field")
			public void save_withoutMandatory() {
				driver.findElement(By.xpath("//button[text()='Save']")).click();
			}

			@Then("verify Alert message contains {string}")
			public void verifyAlertMsg(String AlertMessage) {
				String text2 = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
				System.out.println(text2);
				if (text2.contains(AlertMessage)) {
					System.out.println("Alert message matched");
				} else {
					System.out.println("Alert message not matched");
				}

		  }
		 
		
		}

