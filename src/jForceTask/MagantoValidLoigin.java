package jForceTask;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagantoValidLoigin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		Flib flib = new Flib();
		String email = flib.readExcelData("./data/Maganto.xlsx", "validdata", 1, 0);
		String password = flib.readExcelData("./data/Maganto.xlsx", "validdata", 1, 1);
		
		driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
		driver.findElement(By.name("login[username]")).sendKeys(email);
		driver.findElement(By.name("login[password]")).sendKeys(password);
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		
		driver.findElement(By.id("search")).sendKeys("Jacket");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		driver.findElement(By.xpath("(//div[@class='product-item-info'])[6]")).click();
		driver.findElement(By.id("option-label-size-143-item-170")).click();
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='counter qty']/ancestor::a[@class='action showcart']")).click();
		driver.findElement(By.xpath("//span[.='View and Edit Cart']")).click();
		WebElement Qty = driver.findElement(By.name("cart[209869][qty]"));
		Qty.click();
		Qty.clear();
		Qty.sendKeys("6");
		driver.findElement(By.xpath("//span[.='Update']")).click();
		driver.findElement(By.id("top-cart-btn-checkout")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Proceed to Checkout']")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
		
		
		
	}

}
