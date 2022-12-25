Feature: To test Salesforce application
Background: 
Given Launch the Chrome Browser with the Salesforce url
And Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Testleaf$321'
When Click on Login button
Then Login is successful

Scenario Outline: Create Opportunity with Mandatory fields
And Click on toggle menu button
And select Sales from App Launcher
And Click on Opportunity tab 
And Click New button with Opportunity name as <oppName>
And Choose Close date as today
And Select Stage as Need Analysis
When Save the details
Then verify name contains <verifyName>
 
Examples:
|oppName|verifyName|
|'Dilli0324'|'Dilli'|

Scenario Outline: Create Opportunity without Mandatory fields
And Click the New option under Opportunity 
And Choose Close date as tomorrow date
And Enter the details in description as <descName>
When Save the details without Mandatory field
Then verify Alert message contains <AlertMessage>

Examples:
|descName|AlertMessage|
|'Testing purpose please ignore'|'Review'|




