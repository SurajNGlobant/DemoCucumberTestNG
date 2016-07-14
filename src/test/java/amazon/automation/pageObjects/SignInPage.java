package amazon.automation.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import amazon.automation.locators.SignInPageLocators;
import amazone.automation.base.TestBase;

/**
 * Page object model for SignIn page for Amazon
 * @author 
 *
 */
public class SignInPage extends TestBase implements SignInPageLocators{
	
	@FindBy(css = signInHeader_loc)
	WebElement signInHeader;
	
	@FindBy(css = emailTxtBox_loc)
	WebElement emailTxtBox;
	
	@FindBy(css = passwordTxtBox_loc)
	WebElement passwordTxtBox;
	
	@FindBy(css = signInBtn_loc)
	WebElement signInBtn;
	
	@FindBy(css = signInErrorList_loc)
	List<WebElement> signInErrorList;
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * to launch signin page
	 */
	public void launchPage(){
		HomePage homePage = new HomePage();
		homePage.launchPage();
		homePage.clickOnSignInYourAccountBlock();
	}
   
	/**
	 * To enter credential in signin form on the sign page
	 * @param username
	 * @param password
	 */
	public void enterCredential(String username, String password) {
		emailTxtBox.clear();
		emailTxtBox.sendKeys(username);
		passwordTxtBox.clear();
		passwordTxtBox.sendKeys(password);
		
	}

	/**
	 * To click on signin button on the signin page
	 */
	public void clickSignInBtn() {
		signInBtn.click();
		
	}
	
	/**
	 * To verify signin error message (can verify any error message to be passed as argument)
	 * @param errorMsg
	 */
	public void verifySignInError(String errorMsg){

		errorMsg = errorMsg.replaceAll("\\+", "").trim();
		for(WebElement ele : signInErrorList){
			if(ele.isDisplayed()){	
				Assert.assertTrue(errorMsg.contains(ele.getText().trim()));
				
			}
		}
	}
}
