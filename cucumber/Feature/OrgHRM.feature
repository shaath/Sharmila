Feature: Login and logout Functionality

Scenario: Login Test

	Given The user launch the browser and navigated to url
	When The tester enter username and password
	And click on login button
	Then welcome admin message displayed
	
Scenario: Logout Test
	
		When tester click on welcome admin link
		And also click on logout link
		Then login page displayed 	