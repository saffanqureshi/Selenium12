Feature: Automate Testleaf Application

Scenario Outline: TC001_login_and_logout
Given launch chrome browser and load url
#And enter username as DemoSalesManager
#And enter password as crmsfa
And enter username as <username>
And enter password as <password>
When click login button
Then its navigated to homepage
And click the logout button
And close browser

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

Scenario:  TC002_Login and Logout for failure
Given launch chrome browser and load url 
And enter username as ssssss 
And enter password as crmsfa 
When click login button 
Then its navigate to same Page
But verify error msg
And close browser 