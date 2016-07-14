package amazon.automation.locators;

public interface HomePageLocators {
	String searchTextBox_loc = "#twotabsearchtextbox";
	String searchBtn_loc = "div.nav-right input.nav-input";
	String searchTextVerify_loc = "#s-result-count>span";
	String searchErrorMsg_loc = "#noResultsTitle";
	String signInYourAccountBlock_loc = "#nav-link-yourAccount";
	String loggedUsername_loc = "a#nav-link-yourAccount>span:first-child";
}
