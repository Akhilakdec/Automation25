package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.LoginObject;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginSteps 
{
	
	WebDriver driver = new ChromeDriver();
	LoginObject LoginObject =new LoginObject(driver);
	
	@Given("User navigate to url")
	public void User_navigate_to_url() throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\kisho\\eclipse-workspace\\Drivers\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
      
	}

	@When("user enters Username and Password")
	public void user_enters_Username_and_Password() 
	{
	LoginObject.enterUsername("standard_user");
	LoginObject.enterPassword("secret_sauce");	
	    
	}
	
	@Then("Click on login button")
	public void Click_on_login_button() 
	{
		 LoginObject.clickloginbutton(); 
	}
	
	@ And("Verify user navigate to Swag Labs page")
	 public void Verify_user_navigate_to_Swag_Labs_page() {
	String Title =driver.getTitle();
	Assert.assertEquals(Title, "Swag Labs");
	driver.close();
	}
	
	@When("user enters invalid Username and invalid Password")
	public void user_enters_invalid_Username_and_invalid_Password() 
	{
	LoginObject.enterUsername("abcd");
	LoginObject.enterPassword("qwer");	
	    
	}
	@And("Verify the error message displayed")
	public void Verify_the_error_message_displayed() {
		String actualError = LoginObject.errormessage();
		String expectedError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualError, expectedError, "Error message matched");
		driver.close();	
	}
	@When("user enters multiple credentials username {string} and password {string} ")
	public void user_enters_multiple_credentials_username_and_password (String Username, String Password) {
		LoginObject.enterUsername(Username);
		LoginObject.enterPassword(Password);
	}
	   
}