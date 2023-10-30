Feature: Delete A Product

  Scenario: Verify that users can successfully create a new product with valid data.
    Given I set DELETE method DEL1
    When I set URL https://altashop-api.fly.dev/api/products/1 DEL1
    And I click the Test Request DEL1
    Then The verify result is Response Code 200 DEL1

  Scenario: Verify that users can failed create a new product with missing data.
    Given I set DELETE method DEL2
    When I set URL https://altashop-api.fly.dev/api/products/01 DEL2
    And I click the Test Request DEL2
    Then The verify result is Response Code 404 DEL2