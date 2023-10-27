@CreateNewProductCategory
Feature: Create Comment For Product

  @CreateNewProductCategory.CPC1
  Scenario Outline: Verify that users can successfully create a product category with valid data.
    Given I set POST method CPC1
    When I set URL https://altashop-api.fly.dev/api/categories CPC1
    And I input the HTTP Body CPC1
    And I click the Test Request CPC1
    Then The verify result is Response Code 200 CPC1
    
  @CreateNewProductCategory.CPC2
  Scenario Outline: Verify that users failed to create a product category with missing information.
    Given I set POST method CPC2
    When I set URL https://altashop-api.fly.dev/api/categories CPC2
    And I input the HTTP Body CPC2
    And I click the Test Request CPC2
    Then The verify result is Response Code 400 CPC2