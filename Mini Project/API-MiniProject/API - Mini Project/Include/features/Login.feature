@Login
Feature: Login

  @Login.Lg1
  Scenario Outline: Verify that users can successful login with valid login credentials.
    Given I set POST method Lg1
    When I set URL https://altashop-api.fly.dev/api/auth/login Lg1
    And I input the HTTP Body Lg1
    And I click the Test Request Lg1
    Then The verify result is Response Code 200 Lg1

  @Login.Lg2
  Scenario Outline: Verify that users can failed login with invalid password.
    Given I set POST method Lg2
    When I set URL https://altashop-api.fly.dev/api/auth/login Lg2
    And I input the HTTP Body Lg2
    And I click the Test Request Lg2
    Then The verify result is Response Code 400 Lg2
    
  @Login.Lg3
  Scenario Outline: Verify that users can failed login with an email that is not registered.
    Given I set POST method Lg3
    When I set URL https://altashop-api.fly.dev/api/auth/login Lg3
    And I input the HTTP Body Lg3
    And I click the Test Request Lg3
    Then The verify result is Response Code 400 Lg3