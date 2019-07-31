Feature: Login Application
Scenario Outline: login credentials
Given user opens the application in chrome browser
When user enters "<username>" as username and "<password>" as password
And click on Login button
Then verify the results

Examples: 
|username|password|
|mercury|mercury|
#|sample|sample|
|monica|monica|