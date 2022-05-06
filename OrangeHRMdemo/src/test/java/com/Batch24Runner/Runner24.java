package com.Batch24Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
	features ="src/test/resources",
	glue= {"com.OrangeHRM"},
	tags= {"@batch24"},
	plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		
	monochrome=true	
		
		
		
		
		)



public class Runner24 {

}
