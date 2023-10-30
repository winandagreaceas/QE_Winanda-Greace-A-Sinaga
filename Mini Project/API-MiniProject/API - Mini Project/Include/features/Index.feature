Feature: Index 

  Scenario: Verify that the API endpoint responds with a greeting or a message.
    Given I set GET method I1
    When I set URL https://altashop-api.fly.dev/api/hello I1
    And I click the Test Request I1
    Then The verify result is Response Code 200 I1