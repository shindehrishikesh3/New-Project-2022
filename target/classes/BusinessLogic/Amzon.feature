Feature: To check login functionalities
Background:User succesfully launched browser
Given user launch the browser "Chrome"

@SmokeTest
Scenario: Check login functionality with valid credentials
When user open URL as "amzin.com"
When user select "books" from dropdown
When user enter "name" in searchbox
When user click on search
Then user can view the results