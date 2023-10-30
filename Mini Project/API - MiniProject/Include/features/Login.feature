@LoginFeature
Feature: Login

	Background: 
	Given I set POST method Lg1

  Scenario: Verify that users can successful login with valid login credentials
    When I set URL Lg1
    And I input the HTTP Body Lg1
    And I click the Test Request Lg1
    Then The verify result is Response Code 200 Lg1

  Scenario: Verify that users can failed login with invalid password
    When I set URL Lg1
    And I input the HTTP Body Lg2
    And I click the Test Request Lg2
    Then The verify result is Response Code 400 Lg2
    
  Scenario: Verify that users can failed login with an email that is not registered
    When I set URL Lg1
    And I input the HTTP Body Lg3
    And I click the Test Request Lg3
    Then The verify result is Response Code 400 Lg3