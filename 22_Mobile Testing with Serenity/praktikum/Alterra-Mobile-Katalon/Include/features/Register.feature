@tag
Feature: Register
	As a Guest 
  I want to Register an account
  So that I have an account

  @tag1
  Scenario Outline: Verify Success Register
    Given I am on the Login Page
    When I click on
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      