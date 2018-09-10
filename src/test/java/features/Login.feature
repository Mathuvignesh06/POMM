Feature: LeafTaps Automation 
Background: 
	Given Launch the browser 
	And Maximize the browser 
	And Set timeout 
	And Load the URL 
@smoke @reg
Scenario: 
	And Enter username as DemoSal 
	And Enter password as c 
	When Click login button 
	Then verify that login is successful 
@sanity @reg
Scenario Outline: Login into leaftaps for DemoSalesManager 
	And Enter username as <username> 
	And Enter password as <password> 
	When Click login button 
	Then verify that login is successful 
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|