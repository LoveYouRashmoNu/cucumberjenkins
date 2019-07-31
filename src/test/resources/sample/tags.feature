Feature: Flight application
Background: WELCOME

Scenario: user opens browser
Given user opens chrome for newtours app

@login @dryrun @regression
Scenario: login details
When user types "mercury" as username and "mercury" as password

@regression
Scenario: clicking signin
And click signin button

@regression
Scenario: login verification
And verify the result
