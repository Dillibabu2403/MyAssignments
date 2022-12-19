package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/SalesForce.feature",glue="steps_salesforce",monochrome=true,publish=true)
	
	public class Runner_SalesForce extends AbstractTestNGCucumberTests {
		
		
	}

