Feature: As an User, I want to Success Login, So that I can see my Homepage

  Scenario: As an User, I cannot Login because wrong email or password
    Given User on the Login Page
    When User input "winandagreaceas@gmail.com" on Email Field
    And User input "password" on Password Field
    And User click Login Button
    Then User see Error Message "Wrong Email or Password"