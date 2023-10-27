@CreateCommentForProduct
Feature: Create Comment For Product

  @CreateCommentForProduct.CC1
  Scenario Outline: Verify that users can successfully create a comment or review for a product.
    Given I set POST method CC1
    When I set URL https://altashop-api.fly.dev/api/products/2/comments CC1
    And I input the HTTP Body CC1
    And I click the Test Request CC1
    Then The verify result is Response Code 200 CC1
    
  @CreateCommentForProduct.CC2
  Scenario Outline: Verify that users failed to create a comment with invalid or empty data.
    Given I set POST method CC2
    When I set URL https://altashop-api.fly.dev/api/products/2/comments CC2
    And I input the HTTP Body CC2
    And I click the Test Request CC2
    Then The verify result is Response Code 400 CC2