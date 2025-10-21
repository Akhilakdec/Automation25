package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartorderingobj {
	public WebDriver driver;
	
By firstitem = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
By Seconditem = By.xpath("(//button[contains(text(),'Add to cart')])[4]");
By thirditem = By.xpath("(//button[contains(text(),'Add to cart')])[6]");
By cart = By.xpath("//a[@class = 'shopping_cart_link']");
By Checkout = By.id("checkout");
By continueshopping = By.id("continue-shopping");
By firstname =By.id("first-name");
By Lastname =By.id("last-name");
By postcode =By.id("postal-code");
By Continue =By.id("continue");
By erromsg = By.className("error-button");
By finishbutton =By.name("finish");
By totalamount = By.className("summary_total_label");
By Thankyoumsg = By.xpath("//h2[text() = 'Thank you for your order!']");
By remove = By.xpath("(//button[text() = 'Remove'])[1]");
By shopping = By.xpath("//button[text() = 'Continue Shopping']");
By error1 = By.xpath("//div//h3[text() = 'Error: First Name is required']");
By error2 =By.xpath("//div//h3[text() = 'Error: Last Name is required']");
By error3 = By.xpath("//div//h3[text() = 'Error: Postal Code is required']");


public void ordering() {
	driver.findElement(firstitem).click();
	driver.findElement(Seconditem).click();
	driver.findElement(thirditem).click();
}
public void cartlogo() {
	driver.findElement(cart).click();
}

public void checkoutclk()
{
driver.findElement(Checkout).click();
}

public void checkoutinfo() {
	driver.findElement(firstname).sendKeys("abcde");
	driver.findElement(Lastname).sendKeys("a");
	driver.findElement(postcode).sendKeys("a12 f34");
    driver.findElement(Continue).click();
}

public String totalprice() {
	return driver.findElement(totalamount).getText();
}
public void finishbutton () {
	driver.findElement(finishbutton).click();
}
public String successmessage() {
	return driver.findElement(Thankyoumsg).getText();
	}

public void removeitem() {
	driver.findElement(remove).click();
    driver.findElement(shopping).click();
}
public String errormessagescenarios1() {
    driver.findElement(Continue).click();
    return driver.findElement(error1).getText();
}
public String errormessagescenarios2() {
	driver.findElement(firstname).sendKeys("abcde");
    driver.findElement(Continue).click();
    return driver.findElement(error2).getText();
}
public String errormessagescenarios3() {
	driver.findElement(firstname).sendKeys("abcde");
	driver.findElement(Lastname).sendKeys("a");
    driver.findElement(Continue).click();
    return driver.findElement(error3).getText();
}
}
