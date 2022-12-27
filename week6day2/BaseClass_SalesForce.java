package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.IntegrateMultipleExcelFiles;

public class BaseClass_SalesForce  extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> remote1=new ThreadLocal<RemoteWebDriver>();
	public String Exceldatafile;
	public static ExtentReports extent1;
	public String testCase,testDescription,testCategory,testAuthor;
	public static ExtentTest test1;

	public void set1() {
		remote1.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver() {
		return remote1.get();
	}

	@BeforeSuite
	public void startReport1() {
		ExtentHtmlReporter repo=new ExtentHtmlReporter("./result/report.html");
		repo.setAppendExisting(true);
		extent1=new ExtentReports();
		extent1.attachReporter(repo);
	}

	@BeforeClass
	public void testCaseDetails1() {
		test1=extent1.createTest(testCase, testDescription);
		test1.assignCategory(testCategory);
		test1.assignAuthor(testAuthor);
	}

	public void reportStep1(String message,String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			test1.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap1()+".png").build());
			}
		else if(status.equalsIgnoreCase("fail")){
			test1.fail(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap1()+".png").build());
			throw new RuntimeException("See the report for details");
			
		}
			
	}
	@BeforeMethod
	public void preCondition1() {
		WebDriverManager.chromedriver().setup();
		set1();
		getDriver().get("https://login.salesforce.com/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void postCondition1() {
		getDriver().close();
	}
	@DataProvider(name = "fetch")
	public String[][] fetchData() throws IOException {
		String[][] data = IntegrateMultipleExcelFiles.read(Exceldatafile);
		return data;
	}
	@AfterSuite
	public void stopReport1() {
		extent1.flush();
	}
	
	public int takeSnap1() throws IOException {
		int random=(int)(Math.random()*9999999);
		File scr=getDriver().getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img"+random+".png");
		FileUtils.copyFileToDirectory(scr, dest);
		return random;
	}
}