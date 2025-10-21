package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObject {
	public WebDriver driver;
	 public LoginObject(WebDriver driver)
	    {
	        this.driver = driver;
	    }
	
	 By username = By.id("user-name");
	 By password = By.id("password");
	 By loginButton = By.id("login-button");
	 By errormessage = By.className("error-button");

	    
	    public void enterUsername(String user) {
	        driver.findElement(username).clear();
	        driver.findElement(username).sendKeys(user);
	    }

	    public void enterPassword(String pass) {
	        driver.findElement(password).clear();
	        driver.findElement(password).sendKeys(pass);
	    }

	    public void clickloginbutton() {
	        driver.findElement(loginButton).click();
	    }
	    
	    public String errormessage() {
	    	return driver.findElement(errormessage).getText();
	    
	    }
}
