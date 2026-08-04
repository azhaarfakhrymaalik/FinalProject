Feature: Login to saucedemo

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