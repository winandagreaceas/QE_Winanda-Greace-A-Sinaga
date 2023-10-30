Feature: Get All Products

	Background:
	Given I set GET method ID1

  Scenario: Verify that users can successfully retrieve product details with valid ID
    When I set URL ID1
    And I click the Test Request ID1
    Then The verify result is Response Code 200 ID1
    
  Scenario: Verify that users failed retrieve product details with invalid ID
    When I set URL ID2
    And I click the Test Request ID2
    Then The verify result is Response Code 404 ID2