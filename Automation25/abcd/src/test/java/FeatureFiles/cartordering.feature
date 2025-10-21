Feature: ordering 2 products

  @test1 @smoke @cart
  Scenario: Ordering 2 products by adding into cart
    Given User navigate to url
    When user enters Username and Password
    And Click on login button
    And Move to pop up message and click OK
    Then Click on add to cart button for 3 product
    And Click on cart button
    And Verify the product name in cart is same as selected product
    And Click on checkout button
    And Enter first name, last name and postal code
    And verify the total amount
    And Click on finish button
    And Verify the thank you message

  @test2 @cart @remove
  Scenario: validate remove button in cart page
    Given User navigate to url
    When user enters Username and Password
    Then Click on login button
    Then Click on add to cart button for 3 product
    And Click on cart button
    And click on remove button and continue shopping button

  @test3 @cart @validation
  Scenario: validate error messages in checkout
    Given User navigate to url
    When user enters Username and Password
    Then Click on login button
    Then Click on add to cart button for 3 product
    And Click on cart button
    And Verify the product name in cart is same as selected product
    And Click on checkout button
    And click on continue button without entering anything
    And verify the error message
    