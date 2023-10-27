@GetCategoryByID
Feature: Get Category By ID

  @GetCategoryByID.CID1
  Scenario Outline: Verify that users can successfully get category with valid ID.
    Given I set GET method CID1
    When I set URL https://altashop-api.fly.dev/api/categories/29722 CID1
    And I click the Test Request CID1
    Then The verify result is Response Code 200 CID1
    
  @GetCategoryByID.CID2
  Scenario Outline: Verify that users failed to get category because invalid ID.
    Given I set GET method CID2
    When I set URL https://altashop-api.fly.dev/api/categories/1 CID2
    And I click the Test Request CID2
    Then The verify result is Response Code 400 CID2