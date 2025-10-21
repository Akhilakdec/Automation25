Feature: Login scenarios

  Scenario: Login with valid credentials
    Given User navigate to url
    When user enters Username and Password
    Then Click on login button
    And Verify user navigate to Swag Labs page
    
  Scenario: Login with invalid credentials
    Given User navigate to url
    When user enters invalid Username and invalid Password
    Then Click on login button
    And Verify the error message displayed
    
  Scenario Outline: Login with multiple valid credentials
    Given User navigate to url
    When user enters multiple credentials username "<Username>" and password "<Password>"
    Then Click on login button
    And Verify user navigate to Swag Labs page
    Examples:
    |Username               |Password    |   
    |standard_user          |secret_sauce|
    |locked_out_user        |secret_sauce|
    |problem_user           |secret_sauce|
    |performance_glitch_user|secret_sauce|
    |error_user             |secret_sauce|
    |visual_user            |secret_sauce|
   