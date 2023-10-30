Feature: Create Comment For Product

	Background:
	Given I set POST method CPC1
	
  Scenario: Verify that users can successfully create a product category with valid data
    When I set URL CPC1
    And I input the HTTP Body CPC1
    And I click the Test Request CPC1
    Then The verify result is Response Code 200 CPC1
    
  Scenario: Verify that users failed to create a product category with missing information
    When I set URL CPC2
    And I input the HTTP Body CPC2
    And I click the Test Request CPC2
    Then The verify result is Response Code 400 CPC2