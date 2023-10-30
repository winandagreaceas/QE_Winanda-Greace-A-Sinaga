Feature: Create A New Product

  Scenario: Verify that users can successfully assign a rating and review for a product.
    Given I set POST method AR1
    When I set URL AR1
    And I input the HTTP Body AR1
    And I click the Test Request AR1
    Then The verify result is Response Code 200 AR1