Feature: Amazon Assignment

Scenario: Navigate to Amazon and varify search

	Given Setup up browser "chrome"
	When Navigate to website "https://www.amazon.com/"
  And Search for Book 'qa testing for beginners'
  And Store item price as expected result
  And Click on first item in the listed results
 	Then Validate Item price in Item detail Page 
  And Click on Add to Cart
  Then Validate Item price in cart page
  When Click on proceed to checkout
  Then Validate Item price in proceed checkout page
  
	
	
	