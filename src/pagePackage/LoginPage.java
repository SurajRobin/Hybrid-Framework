package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		// to avoid StaleElementReferanceException
	
		// initialization
	
			@FindBy(name="username") private WebElement usernameTB;
			@FindBy(name="pwd") private WebElement passwordTB;
			@FindBy(id="loginButton") private WebElement loginButton;
			@FindBy(id="keepLoggedInCheckBox") private WebElement loggedInCheckBox;
			@FindBy(xpath = "//a[.='Actimind Inc.']") private WebElement actiMindLink;
			@FindBy(id = "licenseLink") private WebElement licenseLink;
		
		// here we are using constructor to point the current object
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		// utilization
		// here we are calling these getters methods

		public WebElement getusernameTB() {
			return usernameTB;
		}

		public WebElement getpasswordTB() {
			return passwordTB;
		}

		public WebElement getloginButton() {
			return loginButton;
		}

		public WebElement getloggedInCheckBox() {
			return loggedInCheckBox;
		}

		public WebElement getactiMindLink() {
			return actiMindLink;
		}

		public WebElement getlicenseLink() {
			return licenseLink;
		}
		
		// Operational Methods
		// by using operational methods we are passing valid test data in this operational method
		
		public void actitimeValidLogin(String validUsername,String validPassword) throws InterruptedException
		{
			usernameTB.sendKeys(validUsername);
			passwordTB.sendKeys(validPassword);
			loginButton.click();
			Thread.sleep(2000);
		}
		
		// in this method we are passing invalid test data this is the operational method
		public void actitimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
		{
			usernameTB.sendKeys(invalidUsername);
	    	passwordTB.sendKeys(invalidPassword);
	    	loginButton.click();
	    	Thread.sleep(2000);
	    	usernameTB.clear();
		}
		

}
