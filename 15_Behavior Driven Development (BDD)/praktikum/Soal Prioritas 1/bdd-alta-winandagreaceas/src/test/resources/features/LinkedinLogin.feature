Feature: Login
  As a user
  I want to login
  so that i can access my homepage

  Scenario: Success login
    Given I go to Login Page
    When I input valid username and valid password
    And Click login button
    Then I go to homepage

  Scenario: Failed Login with valid username and invalid password
    Given I go to Login Page
    When I input valid username and invalid password
    And Click login button
    Then I will get error message invalid password

  Scenario: Failed Login with invalid username and valid password
    Given I go to Login Page
    When I input invalid username and valid password
    And Click login button
    Then I will get an error message invalid username

  Scenario: Failed Login with invalid username and invalid password
    Given I go to Login Page
    When I input invalid username and invalid password
    And Click login button
    Then I will get error message invalid username and invalid password