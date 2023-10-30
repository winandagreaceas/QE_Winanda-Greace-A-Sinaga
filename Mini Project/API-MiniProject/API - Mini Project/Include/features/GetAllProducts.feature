Feature: Get All Products

  Scenario: Verify that users can successfully retrieve a list of all products.
    Given I set GET method GAP
    When I set URL https://altashop-api.fly.dev/api/products GAP
    And I click the Test Request GAP
    Then The verify result is Response Code 200 GAP