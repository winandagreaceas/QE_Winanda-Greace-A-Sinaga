Feature: Get Category By ID

	Background:
	Given I set GET method CID1
	
  Scenario: Verify that users can successfully get category with valid ID
    When I set URL CID1
    And I click the Test Request CID1
    Then The verify result is Response Code 200 CID1
    
  Scenario: Verify that users failed to get category because invalid ID
    When I set URL CID2
    And I click the Test Request CID2
    Then The verify result is Response Code 404 CID2