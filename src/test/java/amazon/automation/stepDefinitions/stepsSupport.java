package amazon.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import amazone.automation.base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class stepsSupport {
	
	@Before
	public void beforeSupport(Scenario scenario){
	}
	
	@After
	public void closebrowser() throws Exception{
		TestBase.driver.manage().deleteAllCookies();
		TestBase.driver.navigate().refresh();
		
	}
	
}
