@smoke
Feature: User have to check the ticket booking functionality of Wonderla application
@valid
Scenario: User have to check all segement functionality of ticket booking 
Given User have to check the ticket booking functionality through chrome browser
When  User have to check the standard ticket booking functionality of wonderla application
And User have to fill the User required details to book ticket 
Then User have to close the browser


@invalid
Scenario Outline: User have to check all segement functionality as Invalid User details of ticket booking 
Given User have to check the ticket booking functionality through chrome browser
When  User have to check the standard ticket booking functionality of wonderla application
And User have to fill the Invalid User "<name>" and "<phoneno>" details to book ticket 
Then User have to close the browser

Examples:
|name|phoneno|
|MuraliM|9344228438|
|Mu@iu2e02|890770@---|
