Feature: check functions of adaction hotel
@Ad1
Scenario: login with username and password
Given user navigate to the login page
When enter username and password
|username|password|
|HDeepika|Mine#143|
Then user enter the login button

@AD2
Scenario: user given the details for booking hotel
Given user select the location
When user select hotel
And user select room type
And user select noof room
And fill the check in date
And fill the check out date
And given details about members
And user enter submit button
Then user get hotel details

@AD3
Scenario: user check htoel details
Given user click selected hotel
Then user navigate to next page


@AD4
Scenario: user gives the personal details
Given enter the first name
When user select the last name
And user fillup the billing address
And user enter the cridit card number
And user select the card type
And user Select the month of expiry
And user select the year of expiry
And user given cvv number
Then user click book now and navigate to next page


@AD5
Scenario: user check hotel details
Given user check hotel details
Then user click booked itnerary

@AD6
Scenario: cancel the hotel
Given user click the hotel from the list
When user cancel the hotel
Then user take screenshot

