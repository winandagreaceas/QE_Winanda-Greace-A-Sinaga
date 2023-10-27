@CreateANewProduct
Feature: Create A New Product

  @CreateANewProduct.CP1
  Scenario Outline: Verify that users can successfully create a new product with valid data.
    Given I set POST method CP1
    When I set URL https://altashop-api.fly.dev/api/products CP1
    And I input the HTTP Body CP1
    And I click the Test Request CP1
    Then The verify result is Response Code 200 CP1

  @CreateANewProduct.CP2
  Scenario Outline: Verify that users can failed create a new product with missing data.
    Given I set POST method CP2
    When I set URL https://altashop-api.fly.dev/api/products CP2
    And I input the HTTP Body CP2
    And I click the Test Request CP2
    Then The verify result is Response Code 500 CP2