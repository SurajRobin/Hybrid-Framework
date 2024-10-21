package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListner.class)
public class ActitimeTestValidLogin extends BaseTest {
	
	@Test
	public void validTest() throws InterruptedException, IOException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.actitimeValidLogin(flib.readPropertyData(PROPERTY_PATH, "Username"), flib.readPropertyData(PROPERTY_PATH, "Password"));
		
		
		
	}

}
