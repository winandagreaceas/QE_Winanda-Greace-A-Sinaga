@HomepageFeature
Feature: Homepage

	Background:
	Given User open ShoppingList App
	When User tap add icon 

  Scenario Outline: Verify that the user can successfully add New Items and they appear in the List on the Homepage
    And User tap and set <nameA1> on Name Field A1
    And User tap and set <quantityA1> on Quantity Field A1
    And User tap and select the item type A1
    Then User click add item button and directed to Homepage

    Examples:
      |  nameA1  |  quantityA1 |
      |	 Orange	 |		  10		 |

	Scenario Outline: Verify that the user failed to add a New Item because of missing information on the Name Field
    And User tap and set <quantityA2> on Quantity Field A2
    And User tap and select the item type A2
    Then User click add item and view error message on Name Field
    
    Examples:
      |  quantityA2 |
      |		  10			|

	Scenario Outline: Verify that the user failed to add a New Item because of missing information on the Quantity Field
    And User tap and set <nameA2> on Name Field A2
    And User tap and set <quantityA3> on Quantity Field A3
    And User tap and select the item type A3
    Then User click add item and view error message on Quantity Field
    
    Examples:
      |  nameA2  |  quantityA3 	|
      |	 Melon	 |		  0				|