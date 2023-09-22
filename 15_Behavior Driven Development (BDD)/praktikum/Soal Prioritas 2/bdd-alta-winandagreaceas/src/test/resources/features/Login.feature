Feature: Login
  As a user
  I want to login
  so that i can access my sepulsa homepage

  Scenario: Success login
    Given I go to Homepage
    When Click the login button to go to the login page
    And I input valid username and valid password
    And Click Login Button
    Then I go to Homepage