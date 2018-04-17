Feature: Createlead for LeafTaps
@Smoke @Regression
Scenario Outline: Positive case for CreatLead
Given Enter the username as DemoSalesManager
And Enter password as crmsfa
When click login
And click the crmsfa
And click the Leads
And click the CreateLead
And enter compname as <compname>
And enter firstname as <firstname>
And enter lastname as <lastname>
And click submit button
Examples:
|compname|firstname|lastname|
|TCS|Chandru|S|
|CTS|Chandru|S|
