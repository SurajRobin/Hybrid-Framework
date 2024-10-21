package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActitimeCreateUser extends BaseTest {
	
	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actitimeValidLogin(flib.readPropertyData(PROPERTY_PATH, "Username"), flib.readPropertyData(PROPERTY_PATH, "Password"));
		Thread.sleep(2000);
	
	}

}
