package com.runnerTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/appFeatures"}, // check this is execute or not // Yes executing 
		glue= {"com/stepDefination","com/appHooks"},// check this one also  // Yes Executing
		plugin= {"pretty"}
		// How to generate cucumber Extent Report check How to do that 
		)

public class MyTestRunner {
		
	
	
}
