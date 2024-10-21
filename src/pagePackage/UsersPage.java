package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	@FindBy(xpath = "//a[@class='content users']")private WebElement userTab;
	@FindBy(xpath ="//input[@value='Create New User']") private WebElement createUserButton; 
	@FindBy(name = "username") private WebElement userTB;
	@FindBy(name = "passwordText")private WebElement passwordTB;
	@FindBy(name = "passwordTextRetype")private WebElement retypePasswordTB;
	@FindBy(name = "firstName")private WebElement firstNameTB;
	@FindBy(name = "lastName")private WebElement lastNameTB;
	@FindBy(xpath = "//input[@value='   Create User   ']")private WebElement createUser;
	@FindBy(xpath = "//input[@value='      Cancel      ']")private WebElement cancelButton;
	
	
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// initialization
	
	public WebElement getUserTab() {
		return userTab;
	}



	public void setUserTab(WebElement userTab) {
		this.userTab = userTab;
	}



	public WebElement getCreateUserButton() {
		return createUserButton;
	}



	public void setCreateUserButton(WebElement createUserButton) {
		this.createUserButton = createUserButton;
	}



	public WebElement getUserTB() {
		return userTB;
	}



	public void setUserTB(WebElement userTB) {
		this.userTB = userTB;
	}



	public WebElement getPasswordTB() {
		return passwordTB;
	}



	public void setPasswordTB(WebElement passwordTB) {
		this.passwordTB = passwordTB;
	}



	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}



	public void setRetypePasswordTB(WebElement retypePasswordTB) {
		this.retypePasswordTB = retypePasswordTB;
	}



	public WebElement getFirstNameTB() {
		return firstNameTB;
	}



	// operational method
	
	public void userDetails(String validUser,String validPass,String firstName,String lastName) throws InterruptedException
	{
		userTab.click();
		Thread.sleep(2000);
		createUserButton.click();
		userTB.sendKeys(validUser);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPass);
		Thread.sleep(2000);
		retypePasswordTB.sendKeys(validPass);
		Thread.sleep(2000);
		firstNameTB.sendKeys(firstName);
		Thread.sleep(2000);
		lastNameTB.sendKeys(lastName);
		Thread.sleep(2000);
		createUser.clear();
		
		
	}
	
	
	
	
	
	
	
	
	
}
