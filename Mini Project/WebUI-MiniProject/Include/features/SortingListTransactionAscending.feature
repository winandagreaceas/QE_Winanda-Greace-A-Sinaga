@SortingListTransactionAscendingFeature
Feature: Sorting List Transaction Ascending

	Background: 
	Given User navigated to the Login Page TA1

  Scenario Outline: Verify that users can sort their list of transactions by Product Name in Ascending Order
    When User fill in <emailTA1> then <passwordTA1> Field TA1
    And User click the Login Button TA1
    When User click Profile Icon TA1
    And User click Transaction Menu and refresh the webpage
    Then User click ascending icon on Product Name and view that the list changes
    
    Examples: 
      | emailTA1       							| passwordTA1 	|
      | winandasinaga22@gmail.com		| indomie				|
      
  Scenario Outline: Verify that users can sort their list of transactions by Price in Ascending Order
    When User fill in <emailTA1> then <passwordTA1> Field TA1
    And User click the Login Button TA1
    When User click Profile Icon TA1
    And User click Transaction Menu and refresh the webpage
    Then User click ascending icon on Price and view that the list changes
    
    Examples: 
      | emailTA1        						| passwordTA1 	|
      | winandasinaga22@gmail.com		| indomie				|
      
  Scenario Outline: Verify that users can sort their list of transactions by Amount in Ascending Order
    When User fill in <emailTA1> then <passwordTA1> Field TA1
    And User click the Login Button TA1
    When User click Profile Icon TA1
    And User click Transaction Menu and refresh the webpage
    Then User click ascending icon on Amount and view that the list changes
    
    Examples: 
      | emailTA1        						| passwordTA1	|
      | winandasinaga22@gmail.com		| indomie				|
      
  Scenario Outline: Verify that users can sort their list of transactions by Sub-Total in Ascending Order
    When User fill in <emailTA1> then <passwordTA1> Field TA1
    And User click the Login Button TA1
    When User click Profile Icon TA1
    And User click Transaction Menu and refresh the webpage
    Then User click ascending icon on Sub-Total and view that the list changes
    
    Examples: 
      | emailTA1       						| passwordTA1 	|
      | winandasinaga22@gmail.com		| indomie				|