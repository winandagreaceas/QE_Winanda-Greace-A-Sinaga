Feature: Get Product Comments

  Scenario: Verify that users can successfully assign a rating and review for a product
    Given I set GET method GPC1
    When I set URL GPC1
    And I click the Test Request GPC1
    Then The verify result is Response Code 200 GPC1