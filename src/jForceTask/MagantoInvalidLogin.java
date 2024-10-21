package jForceTask;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagantoInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/Maganto.xlsx", "invaliddata");
		
		for (int i=0; i<rc; i++)
		{
			String email = flib.readExcelData("./data/Maganto.xlsx", "invaliddata", 1, 0);
			String password = flib.readExcelData("./data/Maganto.xlsx", "invaliddata", 1, 1);
			driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
			driver.findElement(By.name("login[username]")).sendKeys(email);
			driver.findElement(By.name("login[password]")).sendKeys(password);
			driver.findElement(By.xpath("//button[.='Sign In']")).click();
		}
		
	}

}
