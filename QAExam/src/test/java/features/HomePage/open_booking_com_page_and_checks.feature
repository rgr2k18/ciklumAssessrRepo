Feature: Going to Booking Main Page

Scenario: User should select the English US language
	Given I open booking page
	When I check the logo displaying
	Then I should see the homepage title
	When I click on language selection area
	Then I should see the language panel
	Then I select english us
	Then I select currency euro
	Then I filled the fields to search