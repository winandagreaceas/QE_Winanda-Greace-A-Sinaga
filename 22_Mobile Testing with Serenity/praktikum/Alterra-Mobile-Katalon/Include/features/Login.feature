@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given I am on the Login Page
    When I input <email> on Email field
    And I input <password> on Password field
    Then I click Login Button

    Examples: 
      | email  | password |
      | winandagreaceas@gmail.com |     wina12345 |
