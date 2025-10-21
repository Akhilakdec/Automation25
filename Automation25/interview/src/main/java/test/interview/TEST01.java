package test.interview;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TEST01 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\kisho\\eclipse-workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://staging.beo-fredi.de/");
		 
		 WebElement username = driver.findElement(By.name("email"));
		 username.sendKeys("akhilas1410@yopmail.com");
		 
		 WebElement pasword = driver.findElement(By.name("password"));
		 pasword.sendKeys("Akhila@12345");
		 WebElement login = driver.findElement(By.xpath("//button[text() = 'Login']"));
		 login.click();
		 Thread.sleep(5000);
		 WebElement createshipment = driver.findElement(By.xpath("//button[text() = 'Create Shipment']"));
		 createshipment.click();
		 WebElement Addaddressclick = driver.findElement(By.xpath( "(//button[@data-slot ='button'])[1]"));
		 Addaddressclick.click();
		 WebElement sendername = driver.findElement(By.xpath("(//input[@inputmode ='decimal'])[1]"));
		 sendername.sendKeys("Rajesh");
		 WebElement country = driver.findElement(By.xpath("(//input[@placeholder ='Select a country'])[1]"));
		 Select select = new Select(null);
		//country.Selectbyvisibletext("Australia (AU)");
		 select.selectByVisibleText("Australia (AU)");
		 WebElement senderemail = driver.findElement(By.xpath("//input[@placeholder = 'Enter an email address']"));
		 senderemail.sendKeys("rajeshkumar12@yahoo.com");
		 WebElement Checkbox = driver.findElement(By.id("_r_mb_-form-item"));
		 Checkbox.click();
		 driver.close();
		 
		 
	}
}
