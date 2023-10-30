@CategoriesFeature
Feature: Categories

	Background: 
	Given User navigated to the Login Page C1

  Scenario Outline: Verify that users can select and view items within a specific category
    When User fill in <emailC1> then <passwordC1> Field C1
    And User click the Login Button C1
    When User click dropdown to Select Categories on Homepage C1
    And User click on the categories C1
    Then User successfully directed to Categories Page C1
    
    Examples: 
      | emailC1        							| passwordC1 		|
      | winandasinaga22@gmail.com		| indomie				|
      
	Scenario Outline: Verify that users can navigate subcategories and return to the main category or the main page without categories
    When User fill in <emailC1> then <passwordC1> Field C1
    And User click the Login Button C1
    When User click dropdown to Select Categories on Homepage C1
    And User click on the categories C1
    And User click close icon when successfully directed to Categories Page C2
    Then User successfully directed to Homepage C2
    
    Examples: 
      | emailC1        							| passwordC1 		|
      | winandasinaga22@gmail.com		| indomie				|