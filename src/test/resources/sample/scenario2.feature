Feature: Test Calculator functionqality
 Scenario: Test Add function
 When user enters 1
 And user press plus
 Then the user enters second value as 5
 Then the user press equal
 Then validate the output as 6