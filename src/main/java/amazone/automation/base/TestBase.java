package amazone.automation.base;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.automation.utils.ApplicationPropertiesInitializer;
import cucumber.api.Scenario;

public class TestBase {
	public static WebDriver driver = null;
	public static ApplicationPropertiesInitializer applicationProperties = null; 
    public TestBase(){
    	if(driver == null){
    		applicationProperties = new ApplicationPropertiesInitializer();
    		initilizeBrowser(applicationProperties.getApplicationPropertiesObject().getProperty("browser"));
    	}
 
    }
    
    /**
     * To initialize/launch browser
     * @param browser
     */
    public static void initilizeBrowser(String browser){
    	browser = browser.toLowerCase().trim();
    	switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Config/Drivers/chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().deleteAllCookies();
    		driver.manage().window().maximize();
			break;
        case "firefox":
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
    		driver.manage().window().maximize();
			break;
        case "ie":
        	System.setProperty("webdriver.ie.driver", "Config/Drivers/IEDriverServer.exe");
    		driver = new ChromeDriver();
    		driver.manage().deleteAllCookies();
    		driver.manage().window().maximize();
			break;
			
		default:
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
    		driver.manage().window().maximize();
			break;
		}
    }
    /**
     * To wait for a page to load until it gets in ready state
     */
    public static void waitForPageLoad() {
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver input) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");				
			}
		});		
	}
    
    /**
     * To wait for specific element on the page for defined period[explicit wait]
     * @param element
     * @param seconds
     * @return
     */
    public boolean waitForElement(WebElement element, int seconds) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(seconds, TimeUnit.SECONDS)
				.pollingEvery((seconds/5), TimeUnit.SECONDS);	
		return wait.until(ExpectedConditions.visibilityOf(element)) !=null;
    }	
}
