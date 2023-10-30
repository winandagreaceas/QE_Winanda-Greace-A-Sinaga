Feature: UserInfo

  Scenario: Verify that users can access their profile information.
    Given I set GET method Ui1
    When I set URL https://altashop-api.fly.dev/api/auth/info Ui1
    And I click the Test Request Ui1
    Then The verify result is Response Code 200 Ui1