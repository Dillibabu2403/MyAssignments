Feature: To test Salesforce application
Background: 
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Testleaf$321'
When Click on Login button in Salesforce
Then Login is successfully in Salesforce

Scenario Outline: 
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






