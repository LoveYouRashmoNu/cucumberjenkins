Feature: Login Functionality
Description: Registered user login to the application by entering valid username and password.
Mapping: john would like to access the online shopping page.He should be registered and should use registered credentials to get logged in to the application

Scenario: Login with valid combination
Given user opens newtours application on chrome browser
When user enters "mercury" in username and password field
And click on SignIn button
Then verify login result


Scenario: Login with invalid combination
Given user opens newtours application on chrome browser
When user enters "mercury123" in username and password field
And click on SignIn button
Then verify login result