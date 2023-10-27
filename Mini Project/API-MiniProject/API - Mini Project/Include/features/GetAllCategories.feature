@GetAllCategories
Feature: Create Comment For Product

  @GetAllCategories.AC1
  Scenario Outline: Verify that users successfully retrieves a list of all product categories.
    Given I set GET method AC1
    When I set URL https://altashop-api.fly.dev/api/categories AC1
    And I click the Test Request AC1
    Then The verify result is Response Code 200 AC1