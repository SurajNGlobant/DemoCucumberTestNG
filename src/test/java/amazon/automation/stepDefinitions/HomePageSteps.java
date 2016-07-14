package amazon.automation.stepDefinitions;

import org.testng.Assert;
import org.testng.Reporter;

import amazon.automation.pageObjects.HomePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Home Page steps 
 * @author 
 *
 */
public class HomePageSteps {
    
    private HomePage homePage = new HomePage();
	 
	@Given("^I am at the homepage of Amazon$")
	public void launchHomePage() throws Throwable {
		homePage.launchPage();
	}
	
	@Given("^I search with '(.*)'$")
	public void searchProduct(String searchText) throws Throwable {
		homePage.searchProduct(searchText);
	}
	
	@Given("^The list of product is displayed for '(.*)'$")
	public void verifyListOfProductDisplayed(String textToVerify) throws Throwable {
		homePage.verifySearchTextOnSRP(textToVerify);
	}
	
	@Then("^The search error message is displayed as '(Your search \"adlfjaldjf\" did not match any products\\.)'$")
	public void the_error_message_is_displayed_as_Your_search_did_not_match_any_products(String errorMsg) throws Throwable {
		homePage.verifySearchErrorMsg(errorMsg);
	}
	
	@Then("^The (.*) appears on the signInYourAccount block$")
	public void verifyLoggedInUser(String username) throws Throwable {
	   homePage.verifyLoggedUsername(username);
	}
}
