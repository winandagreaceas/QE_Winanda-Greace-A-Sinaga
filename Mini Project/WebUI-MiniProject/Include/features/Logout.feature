@LogoutFeature
Feature: Log Out

	Background: 
	Given User navigated to the Login Page

  Scenario Outline: Verify that users can successfully log out of their accounts
    When User fill in Field <email> and <password>
    And User click the Login Button
    When User click Profile Icon
    And User click Logout
    Then User successfully Logout and directed to Login Page
    
    Examples: 
      | email        								| password 			|
      | winandasinaga22@gmail.com		| indomie				|