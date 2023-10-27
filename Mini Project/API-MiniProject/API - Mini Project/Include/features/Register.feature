@Register

Feature: Register 

  @Register.R1
  Scenario Outline: Verify that users can successfully register with valid data.
    Given I set POST method R1
    When I set URL https://altashop-api.fly.dev/api/auth/register R1
    And I input the HTTP Body R1
    And I click the Test Request R1
    Then The verify result is Response Code 200 R1
	
  @Register.R2
  Scenario Outline: Verify that users failed to register with an email that is already exist.
    Given I set POST method  R2
    When I set URL https://altashop-api.fly.dev/api/auth/register R2
    And I input the HTTP Body R2
    And I click the Test Request R2
    Then The verify result is Response Code 400 R2
    
  @Register.R3
  Scenario Outline: Verify that users failed to register with Empty Field data.
    Given I set POST method R3
    When I set URL https://altashop-api.fly.dev/api/auth/register R3
    And I input the HTTP Body R3
	And I click the Test Request R3
    Then The verify result is Response Code 400 R3