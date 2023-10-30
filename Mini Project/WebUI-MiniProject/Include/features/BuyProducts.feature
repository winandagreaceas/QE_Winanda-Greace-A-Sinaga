@BuyProductsFeature
Feature: Buy Products

	Background: 
	Given User navigated to the Login Page B1

  Scenario Outline: Verify that users can add a single item to their shopping cart
    When User fill in <emailB1> then <passwordB1> Field B1
    And User click the Login Button B1
    When User click Beli Button on the product B1
    Then User successfully Add a Product to Cart B1
    
    Examples: 
      | emailB1        							| passwordB1 		|
      | winandasinaga22@gmail.com		| indomie				|
      
  Scenario Outline: Verify if users can add multiple items to their cart
    When User fill in <emailB1> then <passwordB1> Field B1
    And User click the Login Button B1
    When User click Beli Button on the product B1
    And User click Beli Button on the product B2
    And User click Beli Button on the product B3
    Then User successfully Add a Product to Cart B2
    
    Examples: 
      | emailB1        							| passwordB1 		|
      | winandasinaga22@gmail.com		| indomie				|
  