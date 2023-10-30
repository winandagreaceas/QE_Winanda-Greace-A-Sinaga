@CartFeature
Feature: Cart

	Background: 
	Given User navigated to the Login Page Cr1

  Scenario Outline: Verify that users can add the quantity of a single item in their cart
    When User fill in <emailCr1> then <passwordCr1> Field Cr1
    And User click the Login Button Cr1
    When User click Beli Button on the product Cr1
    And User click Cart Icon
    And User click Add Icon to Add Quantity of Product
    Then User can view quantity of the product changes
    
    Examples: 
      | emailCr1        						| passwordCr1 	|
      | winandasinaga22@gmail.com		| indomie				|
      
  Scenario Outline: Verify that users can add the quantity of a single item in their cart
    When User fill in <emailCr1> then <passwordCr1> Field Cr1
    And User click the Login Button Cr1
    When User click Beli Button on the product Cr1
    And User click Cart Icon
    And User click Reduce Icon to Add Quantity of Product
    Then User can view the quantity of product changes 
    
    Examples: 
      | emailCr1        						| passwordCr1 	|
      | winandasinaga22@gmail.com		| indomie				|
      
Scenario Outline: Verify that users can add the quantity of a single item in their cart
    When User fill in <emailCr1> then <passwordCr1> Field Cr1
    And User click the Login Button Cr1
    When User click Beli Button on the product Cr1
    And User click Cart Icon
    And User click Bayar Button
    Then User successfully pay and directed to Transaction Page
    
    Examples: 
      | emailCr1        						| passwordCr1 	|
      | winandasinaga22@gmail.com		| indomie				|