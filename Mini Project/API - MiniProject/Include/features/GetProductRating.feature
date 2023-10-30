Feature: Get Product Rating

  Scenario: Verify that users can successfully retrieve the ratings of a product.
    Given I set GET method PR1
    When I set URL PR1
    And I click the Test Request PR1
    Then The verify result is Response Code 200 PR1