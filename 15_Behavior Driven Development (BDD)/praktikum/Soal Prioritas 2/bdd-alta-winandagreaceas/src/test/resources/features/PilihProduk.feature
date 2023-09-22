Feature: Select The Product
  As a user
  I want to login
  so that i can access my web app homepage

  Scenario: Successfully selected products
    Given I go to the Homepage
    When I click Credit as the product to buy
    And I input Phone Number
    And I input the number of products you want to buy
    Then I click Pay Now to proceed