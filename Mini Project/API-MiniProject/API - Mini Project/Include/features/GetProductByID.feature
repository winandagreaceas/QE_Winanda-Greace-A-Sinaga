Feature: Get All Products

  Scenario: Verify that users can successfully retrieve product details with valid ID.
    Given I set GET method ID1
    When I set URL https://altashop-api.fly.dev/api/products/85533 I D1
    And I click the Test Request ID1
    Then The verify result is Response Code 200 ID1
    
  Scenario: Verify that users failed retrieve product details with invalid ID.
    Given I set GET method ID2
    When I set URL https://altashop-api.fly.dev/api/products/1000 ID2
    And I click the Test Request ID2
    Then The verify result is Response Code 404 ID2