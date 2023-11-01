@HomepageFeature
Feature: Reset Item

	Background:
	Given User open The ShoppingList App
	When User tap add icon on Homepage

  Scenario Outline: Verify that users can clear all input fields and options such as returning the form to its initial state by clicking "Reset"
    And User tap and set <name> on the Name Field
    And User tap and set <quantity> on the Quantity Field
    Then User click reset item button and all field was blank

    Examples:
      | 	name   	| quantity |
      |  Sirloin  |		  5		 |