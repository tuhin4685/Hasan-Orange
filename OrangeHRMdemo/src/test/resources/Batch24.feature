@smoketest @batch24 @regressionTest
Feature: User able to login to Orange HRM site
Scenario: User successfully login to Orange HRM
Given user go to Orange HRM demo
When user type the username
 And user also type password
Then user click on the login button
And user verify the welcome screen 