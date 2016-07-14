package amazon.automation.stepDefinitions;

import amazon.automation.pageObjects.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * SignIn Page steps
 * @author 
 *
 */
public class SignInPageSteps {
    public static final String baseUrl = "https://www.amazon.com/";
    private SignInPage signInPage = new SignInPage();
	 
	@Given("^I am at the signInPage of Amazon$")
	public void launchHomePage() throws Throwable {
		signInPage.launchPage();
	}
	
	@When("^I enter username as (.*) and password as (.*)$")
	public void enterCredentialForLogin(String username, String password){
		signInPage.enterCredential(username,password);
	}
	
	@And("^I click on signIn button$")
	public void clickSignInBtn(){
		signInPage.clickSignInBtn();
	}
	
	@Then("^The message for invalid signin is displayed as (.*)$")
	public void verifySignInError(String errorMsg){
		signInPage.verifySignInError(errorMsg);
	}
}
