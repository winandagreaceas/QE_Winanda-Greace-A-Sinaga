Feature: View Product
  As user
  I want to see homepage
  So that I can see detail Product

  Scenario: As user, I have be able to see detail product
    Given I am on homepage
    When I click on the name of product
    Then I am on the Product Page