package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import pages.LoginPage_LeafTaps;
import pages.LoginPage_SalesForce;


public class CreateOpportunity extends baseclass.BaseClass_SalesForce {
	@BeforeTest
	public void setData1() {
		Exceldatafile="CreateOpportunity";
		testCase = "To create opportunity in salesforce application";
		testDescription = "Using extent report to get report";
		testCategory = "Sanity";
		testAuthor = "Dilli";
	}
	@Test(dataProvider="fetch")
	public void leads(String oppName,String verifyName) throws InterruptedException, IOException {
		LoginPage_SalesForce lp = new LoginPage_SalesForce();
		lp.enterUserName("hari.radhakrishnan@qeagle.com").enterPassword("Testleaf$321").clickLogin().verifyPage().clickToggleMenu().clickViewAll().ClickOpportunity().clickOnNewButton().enterOpportunityName(oppName).chooseCloseDate().selectStage().clickOnSave().verifyOpportunityName(verifyName);
	}
}
