Feature: Create Comment For Product

	Background:
	I set POST method CC1

  Scenario: Verify that users can successfully create a comment or review for a product
    When I set URL CC1
    And I input the HTTP Body CC1
    And I click the Test Request CC1
    Then The verify result is Response Code 200 CC1
    
  Scenario: Verify that users failed to create a comment with invalid or empty data
    When I set URL CC2
    And I input the HTTP Body CC2
    And I click the Test Request CC2
    Then The verify result is Response Code 400 CC2