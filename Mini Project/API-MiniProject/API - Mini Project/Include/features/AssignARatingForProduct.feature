@AssignARatingForProduct
Feature: Create A New Product

  @AssignARatingForProduct.AR1
  Scenario Outline: Verify that users can successfully assign a rating and review for a product.
    Given I set POST method AR1
    When I set URL https://altashop-api.fly.dev/api/products/2/ratings AR1
    And I input the HTTP Body AR1
    And I click the Test Request AR1
    Then The verify result is Response Code 200 AR1