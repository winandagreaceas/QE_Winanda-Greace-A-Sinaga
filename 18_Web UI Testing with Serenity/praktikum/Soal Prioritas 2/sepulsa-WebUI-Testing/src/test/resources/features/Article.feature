Feature: Article
  As Guest
  I want to see homepage
  So that I can read the articles

  Scenario: As Guest, I can read the articles on the Article Page
    Given I am on the Home Page
    When I click on an article
    Then I am on the Article Page