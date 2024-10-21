package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners(CustomListner.class)

public class ActitimeInvalidLogin extends BaseTest {
	@Test
	public void invalidLoginToActiTime() throws IOException, InterruptedException {
	
		
		// we are creating object for Flib class to access the generic methods which is present in Flib class
		Flib flib = new Flib();
		
		// we are using LoginPage class to open the application
		LoginPage lp = new LoginPage(driver);
		
		// here we are calling rowCount method to count the last row number
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
		
		// here we are using for loop to test the application with invalid test data
		for(int i=1;i<=rc;i++)
		{
			// in this for loop we are reading the invalid test data like as 
			// username and password then passing these invalid data in this
			lp.actitimeInvalidLogin(flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0),flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1));
		
			
		}
		
	}
	
}
