package runnerTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/appFeatures/E_ComerceApp2.feature"}, // check this is execute or not // Yes executing 
		glue= {"stepDefination","appHooks"},// check this one also  // Yes Executing
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		// How to generate cucumber Extent Report check How to do that 
		)

public class MyTestRunner {
	
	// this things add into the GitHub remote repository check that staged things
		
	
	
}
