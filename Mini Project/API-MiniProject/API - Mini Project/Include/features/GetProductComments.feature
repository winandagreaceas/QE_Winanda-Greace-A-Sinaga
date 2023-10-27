@GetProductComments
Feature: Create A New Product

  @GetProductComments.GPC1
  Scenario Outline: Verify that users can successfully assign a rating and review for a product.
    Given I set GET method GPC1
    When I set URL https://altashop-api.fly.dev/api/products/2/ratings GPC1
    And I click the Test Request GPC1
    Then The verify result is Response Code 200 GPC1