Feature: As a New User, I want to Success Register, So that I can Success Login

  @Register
  Scenario: As a New User, I have be able to create New Account
    Given New User on the Login Page
    When New User click Register Link
    And New User input Name on Name Field
    And New User input Email on Email Field
    And New User input Password on Password Field
    And New User confirm Password
    And New User click Register Button
    Then New User can view Success Message "Registration Successful"