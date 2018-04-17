Feature: Createlead for LeafTaps
Scenario Outline: Positive case for CreatLead

And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When click on login
Then verify login is success
And click on crmsfa
And click on Leads
And click on CreateLead
And enter company name as <compname>
And enter first name as <firstname>
And enter last name as <lastname>
And click submit button
Examples:
|compname|firstname|lastname|
|TCS|Chandru|S|
|CTS|Chandru|S|
