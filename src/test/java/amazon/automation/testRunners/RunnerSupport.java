package amazon.automation.testRunners;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import amazon.automation.support.GenerateReport;
import amazone.automation.base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class RunnerSupport {
	
	@BeforeSuite
	public void beforesuite(){
		deleteAllJsonReportFiles(new File("target/json-report"));
	}
	
	@AfterSuite
	public void aftersuite(){
		TestBase.driver.quit();
		GenerateReport.GenerateMasterthoughtReport();
		
	}
	
	/**
	 * It deletes all report related json file before suite starts
	 */
	public void deleteAllJsonReportFiles(final File folder){
		for (final File file : folder.listFiles()) {
            if (!file.isDirectory()) {
              file.delete();
            }
        }
	}
}
