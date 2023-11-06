@RegisterFeature
Feature: Register

	Background: 
	Given User navigated to Register Page

  Scenario Outline: Registration with Invalid Credentials
    When User fill in the <fullNameR1> and <emailR1> and <passwordR1> Field
    And User click Register Button
    Then User get Error Message

    Examples: 
      | fullNameR1        | emailR1 									| passwordR1  |
      |  									| alterraqea@gmail.com 			| alterra 		|
      | Alterra Academy		| alterra@gmail.com 				| alterra 		|	

  Scenario Outline: Registration with Valid Credentials
    When User input <fullNameR1> and <emailR1> and <passwordR1>
    And User click Register Button 
    Then User get directed to Login Page   
    
    Examples: 
      | fullNameR1      	| emailR1 								| passwordR1  |
      | Alterra Academy	 	| alterraAB5@gmail.com 		| alterra 		|