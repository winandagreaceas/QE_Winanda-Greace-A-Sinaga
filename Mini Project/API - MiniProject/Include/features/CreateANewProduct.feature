Feature: Create A New Product

	Background:
	Given I set POST method CP1

  Scenario: Verify that users can successfully create a new product with valid data.
    When I set URL CP1
    And I input the HTTP Body CP1
    And I click the Test Request CP1
    Then The verify result is Response Code 200 CP1

  Scenario: Verify that users can failed create a new product with missing data.
    When I set URL CP2
    And I input the HTTP Body CP2
    And I click the Test Request CP2
    Then The verify result is Response Code 500 CP2