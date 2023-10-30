Feature: UserInfo

  Scenario: Verify that users can access their profile information
    Given I set GET method U1
    When I set URL U1
    And I click the Test Request U1
    Then The verify result is Response Code 200 U1