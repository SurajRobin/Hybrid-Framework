package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
  @Test
  public void logout() throws InterruptedException, IOException {
	  LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actitimeValidLogin(flib.readPropertyData(PROPERTY_PATH,"username"),flib.readPropertyData(PROPERTY_PATH,"password"));
		HomePage hp = new HomePage(driver);
		hp.logOut();
	  
  }
}
