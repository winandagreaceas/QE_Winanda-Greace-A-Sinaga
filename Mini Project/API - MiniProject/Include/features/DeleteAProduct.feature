Feature: Delete A Product

	Background:
	Given I set DELETE method DEL1

  Scenario: Verify that users can successfully create a new product with valid data
    When I set URL DEL1
    And I click the Test Request DEL1
    Then The verify result is Response Code 200 DEL1

  Scenario: Verify that users can failed create a new product with missing data
    When I set URL DEL2
    And I click the Test Request DEL2
    Then The verify result is Response Code 404 DEL2