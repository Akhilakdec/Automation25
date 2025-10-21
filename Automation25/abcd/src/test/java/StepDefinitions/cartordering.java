package StepDefinitions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import PageObject.cartorderingobj;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class cartordering {
	WebDriver driver = new ChromeDriver();
    cartorderingobj cartorderingobj = new cartorderingobj();
	
    @And("Move to pop up message and click OK")
    public void Move_to_pop_up_message_and_click_OK() {
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText()); // Read message
    alert.accept();
    }
	
	@Then("Click on add to cart button for {int} product")
	public void click_on_add_to_cart_button_for_product(Integer int1) {
		cartorderingobj.ordering();
	}
	   
	@Then("Click on cart button")
	public void click_on_cart_button() {
		cartorderingobj.cartlogo();
	}
	   

	@Then("Verify the product name in cart is same as selected product")
	public void verify_the_product_name_in_cart_is_same_as_selected_product() {
		//cartorderingobj.cartquantity();
		List<WebElement> cartItems  = driver.findElements(By.className("cart_item")); // Locate all cart item containers
		int totalQuantity = cartItems.size();
		int expected = 3;
		Assert.assertEquals(totalQuantity, expected);
		    
	}

	@Then("Click on checkout button")
	public void click_on_checkout_button() {
		cartorderingobj.checkoutclk();
	    
	}

	@Then("Enter first name, last name and postal code")
	public void enter_first_name_last_name_and_postal_code() {
		cartorderingobj.checkoutinfo();
	   
	}
	@Then("verify the total amount")
	public void verify_the_total_amount() {
		String totalprice = cartorderingobj.totalprice();
		System.out.println(totalprice);
	  
	}

	@Then("Click on finish button")
	public void click_on_finish_button() {
		cartorderingobj.finishbutton();
	}

	@Then("Verify the thank you message")
	public void verify_the_thank_you_message() {
	  String Expected = cartorderingobj.successmessage();
	  String Actual = "Thank you for your order!";
	  Assert.assertEquals(Actual, Expected,"Order is placed successfully");
	  driver.close();
	}

	@Then("click on remove button and continue shopping button")
	public void click_on_remove_button_and_continue_shopping_button() {
		cartorderingobj.removeitem();
		System.out.println("order Again....");	
		driver.close();
	}

	@Then("click on continue button without entering anything")
	public void click_on_continue_button_without_entering_anything() {
	   
	}
	@Then("verify the error messages")
	public void verify_the_error_message() {
		cartorderingobj.errormessagescenarios1();
		cartorderingobj.errormessagescenarios2();
		cartorderingobj.errormessagescenarios3();
		driver.close();
	}



}
