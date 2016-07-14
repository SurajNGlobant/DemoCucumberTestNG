package amazon.automation.testRunners;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import amazon.automation.support.GenerateReport;
import amazone.automation.base.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "Features/homepage_searchModule.feature", 
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/json-report/home-page-cucumber-json-report.json"},
		glue = "amazon.automation.stepDefinitions",
		tags = {"@homePage"}
		)

public class HomePage_SearchModule_Runner extends AbstractTestNGCucumberTests {
	
}

