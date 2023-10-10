package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		plugin = {"json:target/cucumber.json" },
		features = {"./src/main/resources/Google framework.feature"},
		glue= {"com.cucumber"},
		tags= "@Smoke",
		// Optional
		dryRun=false,
		monochrome=true
		
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
}
