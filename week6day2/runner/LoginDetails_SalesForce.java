package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.LoginPage_LeafTaps;
import pages.LoginPage_SalesForce;

public class LoginDetails_SalesForce extends baseclass.BaseClass_SalesForce {
	@BeforeTest
	public void setData() {
		testCase = "Login Page Salesforce";
		testDescription = "Using extent report to get report";
		testCategory = "Sanity";
		testAuthor = "Dilli";
	}
	@Test
	public void loginPageDetails() throws IOException {
		LoginPage_SalesForce lp = new LoginPage_SalesForce();
		lp.enterUserName("hari.radhakrishnan@qeagle.com").enterPassword("Testleaf$321").clickLogin();
	}
}