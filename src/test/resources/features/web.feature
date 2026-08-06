Feature: Login to saucedemo - E2E User

  @web
  Scenario: Positive - Login with valid credentials
    Given I am on the home page
    When I fill the username field with "standard_user"
    And I fill the password field with "secret_sauce"
    And I click on the login button
    Then I should be redirected to the dashboard page

  @web
  Scenario: Negative - Login with invalid credentials
    Given I am on the home page
    When I fill the username field with "invalid_user"
    And I fill the password field with "wrong_password"
    And I click on the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

  @web
  Scenario: Boundary - Login with an empty username
    Given I am on the home page
    When I fill the username field with ""
    And I fill the password field with "secret_sauce"
    And I click on the login button
    Then I should see an error message "Epic sadface: Username is required"

  @web
  Scenario: Boundary - Login with extremely long username
    Given I am on the home page
    When I fill the username field with "userAXXXXXXXXXXXXXXXXZZZZZZZZZZZZZZZYYYYYYYYYYYYYYYYUUUUUUUUUUUUUUU"
    And I fill the password field with "secret_sauce"
    And I click on the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

  @web
  Scenario: Successful End-to-End purchase process
    Given user is on login page
    When user input valid username "standard_user" and password "secret_sauce"
    And user click login button
    Then user is navigated to home page
    When user add item "Sauce Labs Backpack" to cart
    And user click cart icon
    And user click checkout button
    And user fill checkout information with First Name "John", Last Name "Doe", Postal Code "12345"
    And user click continue button
    And user click finish button
    Then user should see order complete message "Thank you for your order!"