package runner;

import org.testng.annotations.Test;


import base.BaseClass_LeafTaps;
import base.BaseClass_SalesForce;
import pages.LoginPage_LeafTaps;
import pages.LoginPage_SalesForce;

public class LoginDetails_SalesForce extends BaseClass_SalesForce {
	
	@Test
	public void loginPageDetails() {
		LoginPage_SalesForce lp = new LoginPage_SalesForce(driver);
		lp.enterUserName().enterPassword().clickLogin();
	}
}