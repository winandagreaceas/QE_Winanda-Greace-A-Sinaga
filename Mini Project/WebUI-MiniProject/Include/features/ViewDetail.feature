@ViewDetailFeature
Feature: View Detail

	Background: 
	Given User navigated to the Login Page V1

  Scenario Outline: Verify that users can access the detail page of an item
    When User fill in <emailV1> then <passwordV1> Field V1
    And User click the Login Button V1
    When User click Detail Button on the product
    Then User successfully directed to Detail Page V1
    
    Examples: 
      | emailV1        							| passwordV1 		|
      | winandasinaga22@gmail.com		| indomie				|

  Scenario Outline: Verify that user reviews and ratings are accessible on the item's detail page
    When User fill in <emailV1> then <passwordV1> Field V1
    And User click the Login Button V1
    When User click Detail Button on the product
    Then User can view Costumer Ratings on Detail Page V2
    
    Examples: 
      | emailV1        							| passwordV1 		|
      | winandasinaga22@gmail.com		| indomie				|