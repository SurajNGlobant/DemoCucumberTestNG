package amazon.automation.pageObjects;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import amazon.automation.locators.HomePageLocators;
import amazone.automation.base.TestBase;

/**
 * Page object model for Home page of Amazon
 * @author 
 *
 */
public class HomePage extends TestBase implements HomePageLocators{
	
	
	@FindBy(css = searchTextBox_loc)
	private WebElement searchTextBox;
	
	@FindBy(css = searchBtn_loc)
	private WebElement searchBtn;
	
	@FindBy(css = searchTextVerify_loc)
	private WebElement searchTextVerify;
	
	@FindBy(css = searchErrorMsg_loc)
	private WebElement searchErrorMsg;
	
	@FindBy(css = signInYourAccountBlock_loc)
	private WebElement signInYourAccountBlock;
	
	@FindBy(css = loggedUsername_loc)
	private WebElement loggedUsername;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * to launch base url
	 */
	public void launchPage(){
		driver.get(applicationProperties.getApplicationPropertiesObject().getProperty("baseUrl"));
	}

	/**
	 * to search a product on homepage
	 * @param SearchText : the text to be search as product
	 */
	public void searchProduct(String searchText) {
		searchTextBox.sendKeys(searchText);
		searchBtn.click();
		
	}
	
	/**
	 * to verify searchText on SearchResult 
	 * @param searchText: text that needs to be verify on the page
	 */
	public void verifySearchTextOnSRP(String verificationText){
		Assert.assertTrue(searchTextVerify.getText().contains(verificationText));
	}
	
	/**
	 * to verify search error message for invalid search
	 * @param SearchText : the text to be search as product
	 */
	public void verifySearchErrorMsg(String message){
		Assert.assertEquals(searchErrorMsg.getText(), message);
	}
	
	/**
	 * to click on SingIn block for navigating signin page
	 */
	public void clickOnSignInYourAccountBlock(){
		signInYourAccountBlock.click();
	}
	
	/**
	 * to verify username on homepage after signin
	 * @param username : the username that appears on the page after signin
	 */
	public void verifyLoggedUsername(String username){
		Assert.assertTrue(loggedUsername.getText().trim().contains(username));
	}

}
