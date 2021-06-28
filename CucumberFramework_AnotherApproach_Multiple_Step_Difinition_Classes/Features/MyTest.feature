Feature: Guru99 Demo Page

Scenario: User tries to login to the demo page
Given I navigate to the login page
When I submit username and password
	|user            |pass     |
	|mngr337584      |etupyte  |	
Then I should be logged in

Scenario: Once logged IN user tries to Add a New Customer
Given Click on New Customer Link
When User enters value for all the required fields
And  Clicks on the Submit button 		
Then New Customer gets added

Scenario: User Edits the details of an already added Customer
Given Edit Customer Page is displayed		
When Search for the Customer 
And  Edit the Details	
Then Customer's details gets updated

Scenario: User Creates a new account for an already added Customer
Given New Account Page is displayed		
When Provide the Details	
Then Customer's account details gets updated

Scenario: User Edits the details of an already added Account
Given Edit Account Page is displayed		
When Search for the Account 
And  Edit the Account Details	
Then Account's details gets updated



