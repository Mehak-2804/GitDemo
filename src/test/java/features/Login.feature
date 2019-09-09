 Feature: Application Login
 
 Scenario Outline: Validating rediff login
 Given Initialize the browser with Chrome
 And Navigate to the "https://www.rediff.com/" site
 And Click on Login link to land on signin page
 When User enters <username> and <password> and logsin
 Then verify that user is successfully logged in
 
Examples:
|username	|password	|
|mehak0410	|1234	|
|prchmeta	|Jan@2804	|