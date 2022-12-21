package runner;

import org.testng.annotations.Test;


import base.BaseClass_LeafTaps;
import base.BaseClass_SalesForce;
import pages.LoginPage_LeafTaps;
import pages.LoginPage_SalesForce;
import pages.LoginPage_LeafTaps;

public class CreateOpportunity extends BaseClass_SalesForce {

	@Test
	public void leads() throws InterruptedException {
		LoginPage_SalesForce lp = new LoginPage_SalesForce(driver);
		lp.enterUserName().enterPassword().clickLogin().verifyPage().clickToggleMenu().clickViewAll().ClickSales().ClickOpportunity().clickOnNewButton().enterOpportunityName().chooseCloseDate().selectStage().clickOnSave().verifyOpportunityName();
	}
}
