package jForceTask;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcc {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		Flib flib = new Flib();
		String firstname = flib.readExcelData("./data/Maganto.xlsx", "validdata", 1, 2);
		String lastname = flib.readExcelData("./data/Maganto.xlsx", "validdata", 1, 3);
		String email = flib.readExcelData("./data/Maganto.xlsx", "validdata", 1, 0);
		String password = flib.readExcelData("./data/Maganto.xlsx", "validdata", 1, 1);
		
		driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='Create an Account'])[1]")).click();
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("password_confirmation")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[.='Create an Account']")).click();
		
		
		
		
		
		
		
	}

}
